/**
 * Created by ajinkya on 13/03/16.
 */
public class TriangleNumbers {

    public static Boolean isTriangleNumber(long number) {
        long root = (long) Math.sqrt(number);
        if (root * (root + 1) / 2 == number)
            return true;
        else return false;
    }
}
