package piwords;
import java.util.ArrayList;


public class PiGenerator {
    /**
     * Returns precision hexadecimal digits of the fractional part of pi.
     * Returns digits in most significant to least significant order.
     * 
     * If precision < 0, return null.
     * 
     * @param precision The number of digits after the decimal place to
     *                  retrieve.
     * @return precision digits of pi in hexadecimal.
     */

    public static int[] computePiInHex(int precision) {
        // TODO: Implement (Problem b)
        ArrayList<Integer> al=new ArrayList<Integer>();

        if(precision<0) return null;
        if(precision==0) return new int[0];
        else {
            for(int i=1;i<=precision;i++){
                al.add(piDigit(i));
            }
            int[] res=new int[al.size()];
            for(int q=0;q<al.size();q++) {res[q]=al.get(q);}
            return res;
            //return new int[0];
        }
    }

    /**
     * Computes a^b mod m
     * 
     * If a < 0, b < 0, or m <= 0, return -1.
     * 
     * @param a
     * @param b
     * @param m
     * @return a^b mod m
     */
    public static int powerMod(int a, int b, int m) {
        // TODO: Implement (Problem a)
        if (a<0 || b<0 || m<0) return -1;

        int res=1;
        for(int i=0;i<b;i++) {
            res*=a;
            res=res%m;
        }
        return res;

    }
    
    /**
     * Computes the nth digit of Pi in base-16.
     * 
     * If n < 0, return -1.
     * 
     * @param n The digit of Pi to retrieve in base-16.
     * @return The nth digit of Pi in base-16.
     */
    public static int piDigit(int n) {
        if (n < 0) return -1;
        
        n -= 1;
        double x = 4 * piTerm(1, n) - 2 * piTerm(4, n) -
                   piTerm(5, n) - piTerm(6, n);
        x = x - Math.floor(x);
        
        return (int)(x * 16);
    }
    
    private static double piTerm(int j, int n) {
        // Calculate the left sum
        double s = 0;
        for (int k = 0; k <= n; ++k) {
            int r = 8 * k + j;
            s += powerMod(16, n-k, r) / (double) r;
            s = s - Math.floor(s);
        }
        
        // Calculate the right sum
        double t = 0;
        int k = n+1;
        // Keep iterating until t converges (stops changing)
        while (true) {
            int r = 8 * k + j;
            double newt = t + Math.pow(16, n-k) / r;
            if (t == newt) {
                break;
            } else {
                t = newt;
            }
            ++k;
        }
        
        return s+t;
    }

    /*public static void main(String[] args) {
        //System.out.println(powerMod(2, 3,2));
        //System.out.println(powerMod(2, 3,3));
        for(int i:computePiInHex(10)) System.out.println(i);
        //System.out.println(computePiInHex(2));
        //System.out.println(computePiInHex(5));
        //System.out.println(computePiInHex(10));




    }*/
}
