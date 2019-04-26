package unittesting;

/**
 * Created by jessicasutd on 2017/11/6.
 */

public class SingleTon {

    private static SingleTon instance=null;
    private SingleTon() {

    }
    public static SingleTon getInstance() {
        if(instance==null) instance=new SingleTon();
        return instance;
    }



}
