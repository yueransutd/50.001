/*
package designpatterns.libstockgrabber;


import Week5.*;

public class StockObserver implements Observer {
     // Your code goes here
    private String msg;
    private Subject subject;
    private String name;
    public StockObserver (Subject sg,String name) {
        this.subject=sg;
        this.name=name;
        this.subject.register(this);
    }
    public void update(String s) {

        this.msg=s;
        System.out.println(name+": Message received: "+this.msg);
    }




}
*/
