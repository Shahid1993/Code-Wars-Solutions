public class CircleSorted {


    public boolean isCircleSorted(int[] a) {
        int i = 0;
        int breakIndex = 0;
        while (i < a.length - 1) {
            if (a[i] > a[i + 1]) {
                breakIndex = i;
                break;
            }
            i++;
        }
        i = 0;
        while (i < a.length) {
            if (a[breakIndex] > a[(breakIndex + 1) % a.length])
                break;
            breakIndex = (breakIndex + 1) % a.length;
            i++;
        }
        if (i == a.length - 1)
            return true;
        else
            return false;
    }
}