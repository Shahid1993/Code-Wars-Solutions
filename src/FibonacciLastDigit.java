/**
 * Created by ajinkyakolhe on 6/22/2016.
 * As you probably know, Fibonacci sequence are the numbers in the following integer sequence: 1, 1, 2, 3, 5, 8, 13...
 * Write a method that takes the index as an argument and returns last digit from fibonacci number.
 * Example: getLastDigit(15) - 610. Your method must return 0 because the last digit of 610 is 0.
 * Fibonacci sequence grows very fast and value can take very big numbers (bigger than integer type can contain),
 * so, please, be careful with overflow.
 */
public class FibonacciLastDigit {
    public static int getFibNumb(int n) {
        int first = 1, second = 0;
        int next = 0;
        for (int i = 1; i < n; i++) {
            next = second + first;
            first = second % 10;
            second = next % 10;
        }
        return second;
    }
}
