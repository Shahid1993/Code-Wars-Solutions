package main;

/**
 * Created by ajinkya on 13/2/16.
 */
public class MaxRotate {

    public static long maxRot(long n) {
        String number = Long.toString(n);
        int length = number.length();
        int count = 1;
        Long max = 0l;

        while (count < length) {
            String subString = number.substring(count, length);
            subString = shift(subString, 1);
            Long rotatedNum = Long.parseLong(subString);
            if (rotatedNum > max)
                max = rotatedNum;
            count++;
        }
        return max;
    }

    public static String shift(String string, int shift) {
        if (string.length() == 1)
            return string;

        StringBuilder rotate = new StringBuilder();
        int i = shift;
        do {
            rotate.append(string.charAt(i));
            i = (i + 1) % string.length();
        } while (i != shift);

        return rotate.toString();
    }
}
