package designpatterns.libtrafficalert;

import java.util.ArrayList;

import designpatterns.libstockgrabber.*;

public class Traffic implements Subject {

     // Your code goes here
    private String msg;
    private ArrayList<Observer> observers;
    public Traffic(){
        observers=new ArrayList<Observer>();
    }
    public void register(Observer o) {
        observers.add(o);
    }
    public void unregister(Observer o) {
        observers.remove(o);
    }
    public void changeCondition(String msg) {
        this.msg=msg;
        this.notification();
    }
    private void notification() {
        for(Observer o:observers) {
            o.update(msg);
        }
    }




}