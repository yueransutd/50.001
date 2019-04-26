package unittesting;

/**
 * Created by jessicasutd on 2017/10/30.
 */

public class Calculator {

    public static int add(int number1,int number2) {
        return number1+number2;
    }
    public static int sub(int number1,int number2) {
        return number1-number2;
    }
    public static int mul(int number1,int number2) {
        return number1*number2;
    }
    public static int divInt(int number1,int number2) throws IllegalArgumentException {
        int op=0;
        try {
            return number1 / number2;
        }
        catch (Exception e) {}
        return op;
    }



}
