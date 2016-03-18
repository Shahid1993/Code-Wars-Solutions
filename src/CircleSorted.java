public class CircleSorted {


    public boolean isCircleSorted(int[] a) {
        boolean breakFlag = false;
        int breakIndex = 0;
        int i;
        for (i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1] && breakFlag == false) {
                breakFlag = true;
                breakIndex = i;
            } else if (a[i] > a[i + 1] && breakFlag == true)
                return false;
            else
                break;
        }
        if (breakFlag == true) {
            if (a[a.length - 1] < a[0])
                return true;
            else
                return false;
        } else {
            if (i < a.length - 1)
                return false;
            else
                return true;
        }
    }
}