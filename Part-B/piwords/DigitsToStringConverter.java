package piwords;

public class DigitsToStringConverter {
    /**
     * Given a list of digits, a base, and an mapping of digits of that base to
     * chars, convert the list of digits into a character string by applying the
     * mapping to each digit in the input.
     * 
     * If digits[i] >= base or digits[i] < 0 for any i, consider the input
     * invalid, and return null.
     * If alphabet.length != base, consider the input invalid, and return null.
     *
     * @param digits A list of digits to encode. This object is not mutated.
     * @param base The base the digits are encoded in.
     * @param alphabet The mapping of digits to chars. This object is not
     *                 mutated.
     * @return A String encoding the input digits with alphabet.
     */
    public static String convertDigitsToString(int[] digits, int base,
                                               char[] alphabet) {
        // TODO: Implement (Problem d)
        String str="";

        if(alphabet.length!=base) return null;
        for(int i=0;i<digits.length;i++){
            if(digits[i]>=base || digits[i]<0) return null;
            str+=alphabet[digits[i]];
        }
        return str;
    }

    /*public static void main(String[] args) {
        int[] digits={3, 17, 18, 16, 11};
        char[] alphabet={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println(convertDigitsToString(digits,26,alphabet));
        int[] digits2={3, 17, 18, 16, 11, 14, 10, 25};
        char[] alphabet2={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println(convertDigitsToString(digits2,26,alphabet2));

        *//*convertDigitsToString(int[] digits, int base, char[] alphabet)

        input: digits = [3, 17, 18, 16, 4], baseA = 26, alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}
        expected output: drsql

        input: digits = [3, 17, 18, 16, 11, 14, 10, 25], baseA = 26, alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}
        expected output: drsqlokz*//*


    }*/
}
