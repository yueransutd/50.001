/*
package designpatterns.libstockgrabber;

import java.util.ArrayList;

import Week5.*;

public class StockGrabber implements Subject {
     // your code goes here

    private String msg;
    private ArrayList<Observer> observers;
    public StockGrabber(){
        observers=new ArrayList<Observer>();
    }
    public void register(Observer o) {
        observers.add(o);
    }
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void stockUpdate(String s) {
        this.msg=s;
        this.Notify();
    }
    private void Notify() {
        for(Observer o:observers) {
            o.update(this.msg);
        }
    }
}
*/
