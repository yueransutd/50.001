package piwords;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class AlphabetGenerator {
    /**
     * Given a numeric base, return a char[] that maps every digit that is
     * representable in that base to a lower-case char.
     * 
     * This method will try to weight each character of the alphabet
     * proportional to their occurrence in words in a training set.
     * 
     * This method should do the following to generate an alphabet:
     *   1. Count the occurrence of each character a-z in trainingData.
     *   2. Compute the probability of each character a-z by taking
     *      (occurrence / total_num_characters).
     *   3. The output generated in step (2) is a PDF of the characters in the
     *      training set. Convert this PDF into a CDF for each character.
     *   4. Multiply the CDF value of each character by the base we are
     *      converting into.
     *   5. For each index 0 <= i < base,
     *      output[i] = (the first character whose CDF * base is > i)
     * 
     * A concrete example:
     * 	 0. Input = {"aaaaa..." (302 "a"s), "bbbbb..." (500 "b"s),
     *               "ccccc..." (198 "c"s)}, base = 93
     *   1. Count(a) = 302, Count(b) = 500, Count(c) = 198
     *   2. Pr(a) = 302 / 1000 = .302, Pr(b) = 500 / 1000 = .5,
     *      Pr(c) = 198 / 1000 = .198
     *   3. CDF(a) = .302, CDF(b) = .802, CDF(c) = 1
     *   4. CDF(a) * base = 28.086, CDF(b) * base = 74.586, CDF(c) * base = 93
     *   5. Output = {"a", "a", ... (29 As, indexes 0-28),
     *                "b", "b", ... (46 Bs, indexes 29-74),
     *                "c", "c", ... (18 Cs, indexes 75-92)}
     * 
     * The letters should occur in lexicographically ascending order in the
     * returned array.
     *   - {"a", "b", "c", "c", "d"} is a valid output.
     *   - {"b", "c", "c", "d", "a"} is not.
     *   
     * If base >= 0, the returned array should have length equal to the size of
     * the base.
     * 
     * If base < 0, return null.
     * 
     * If a String of trainingData has any characters outside the range a-z,
     * ignore those characters and continue.
     * 
     * @param base A numeric base to get an alphabet for.
     * @param trainingData The training data from which to generate frequency
     *                     counts. This array is not mutated.
     * @return A char[] that maps every digit of the base to a char that the
     *         digit should be translated into.
     */


    public static char[] generateFrequencyAlphabet(int base,
                                                   String[] trainingData) {
        // TODO: Implement (Problem f)
        int total_num_characters=0;

        if(base<0) return null;
        char[] res=new char[base];

        HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
        for(String st: trainingData){
            st.toLowerCase();
            for(char c: st.toCharArray()) {
                if(Character.isLetter(c)) {
                    total_num_characters+=1;
                    if(!hm.containsKey(c)) hm.put(c,1);
                    else hm.put(c,hm.get(c)+1);
                }
            }
        }


        //Compute the probability of each character
        HashMap<Character,Double> h=new HashMap<Character, Double>();
        for(char c:hm.keySet()) h.put(c,(double)hm.get(c)/total_num_characters);

        //Convert PDF into a CDF for each character
        ArrayList<Character> arrls=new ArrayList<>();
        for(char c: h.keySet()) arrls.add(c);
        Collections.sort(arrls);
        double cdfCount=0.0;
        for(char c: arrls) {
            cdfCount+=h.get(c);
            h.put(c,cdfCount);
        }


        //Multiply the CDF value of each character by the base we are converting into
        for(char c: arrls) {
            h.put(c,h.get(c)*base);
        }


        //Generate oup
        int in=0;
        for(char c: arrls) {
            while(in<h.get(c)) {

                res[in]=c;
                in++;
            }

        }
        return res;
    }


}
