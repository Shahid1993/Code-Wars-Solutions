/**
 * Created by ajinkya on 22/2/16.
 */
public class Money {
    public static int calculateYears(double principal, double interest, double tax, double desired) {
        int numberOfYears = 0;
        while (principal < desired) {
            principal += principal * interest * (1 - tax);
            numberOfYears++;
        }
        return numberOfYears;
    }
}