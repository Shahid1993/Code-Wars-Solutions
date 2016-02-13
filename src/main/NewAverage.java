package main;

/**
 * Created by ajinkya on 13/2/16.
 * ( sum + i ) / (length +1 ) = navg;
 * i = navg * (length +1 ) - sum;
 */
public class NewAverage {
    public static long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double no = navg * (arr.length + 1) - sum;
        if (no < 0)
            throw new IllegalArgumentException("Sum negative");
        else
            return (long)no;

    }
}