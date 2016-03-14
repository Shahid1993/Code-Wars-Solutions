public class FrogJumping {

    public static int solution(int[] a) {
        int i;
        int count = 0;
        for (i = 0; i < a.length; ) {
            i = i + a[i];
            count++;
        }
        if (i == a.length - 1)
            return count + 1;
        else
            return -1;
    }
}