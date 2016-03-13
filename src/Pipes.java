/**
 * Created by ajinkya on 22/2/16.
 */
public class Pipes {
    public static int[] pipeFix(int[] numbers) {
        int[] newNumbers = new int[numbers[numbers.length - 1] - numbers[0] + 1];
        newNumbers[0] = numbers[0];
        for (int i = 0; i < newNumbers.length; i++)
            newNumbers[i] = newNumbers[0] + i;

        return newNumbers;
    }
}
