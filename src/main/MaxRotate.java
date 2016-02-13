package main;

/**
 * Created by ajinkya on 13/2/16.
 */
public class MaxRotate {

    public static long maxRot(long n) {
        String number = Long.toString(n);
        int length = number.length();
        int count = 1;

        while (count < length) {
            String subString = number.substring(count, length);
            subString = shift(subString,1);

        }
        return 0;
    }

    public static String shift(String string, int shift) {
        StringBuilder rotate = new StringBuilder();
        for (int i = shift; i < string.length(); i = (i + 1) % string.length())
            rotate.append(string.charAt(i));

        return rotate.toString();
    }
}
