package unittesting;

/**
 * Created by jessicasutd on 2017/10/30.
 */

public class FindSmaller {
    public FindSmaller() {
    }

    public static int findSmaller(int x, int[] arr) {

        int res=0;
        for (int i: arr) {
            if(i<=x) res+=1;
        }
        return res;
    }


}
