/*

package designpatterns.libairpollution;

import java.util.ArrayList;

class AirPollutionAlert implements Subject {
     // Your code goes here
    private double msg;
    private ArrayList<Observer> observers;

    public AirPollutionAlert() {
        observers=new ArrayList<Observer>();

    }
    public void notifyObservers() {
        for(Observer o:observers)
            o.update(this.msg);
    }
    public void register(Observer o) {
        observers.add(o);
    }
    public void unregister(Observer o) {
        observers.remove(o);
    }

    public void setAirPollutionIndex(double msg) {
        this.msg=msg;
        if(msg>100) {
            this.notifyObservers();
        }
    }

}





*/
