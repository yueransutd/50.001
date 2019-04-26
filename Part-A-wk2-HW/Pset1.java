import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by jessicasutd on 2017/9/20.
 */

public class Pset1 {

public static boolean isAllCharacterUnique(String sIn) {
        //todo: add your implementation
        if(sIn.length()>128) return false;
        int[] bl=new int[128];
        for(int i=0;i<128;i++) bl[i]=0;
        for(int i=0;i<sIn.length();i++) {
            int charNo= (int) sIn.charAt(i);
            if(bl[charNo]==0) bl[charNo]=1;
            else return false;
        }
        return true;
    }

    public static boolean isPermutation(String sIn1, String sIn2) {
        //todo: add your implementation
        if(sIn1.length()!=sIn2.length()) return false;
        char[] s1=sIn1.toCharArray();
        char[] s2=sIn2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);

    }
}
