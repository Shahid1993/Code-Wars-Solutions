public class FrogJumping {

    public static int solution(int[] a) {
        int currentIndex = 0;
        int nextIndex = 0;
        int count = 0;
        while (true) {
            nextIndex = currentIndex + a[currentIndex];
            count++;
            if (nextIndex < 0 || nextIndex > a.length - 1)
                return count;
            currentIndex = nextIndex;
        }
    }
}