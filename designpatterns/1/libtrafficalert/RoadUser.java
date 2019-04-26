package designpatterns.libtrafficalert;

import designpatterns.libstockgrabber.*;
import designpatterns.libstockgrabber.Subject;

public class RoadUser implements Observer {
     // Your code goes here
    private String msg;
    private String name;
    private designpatterns.libtrafficalert.Subject subject;
    //there are other variable called subject in the designpattern package
    public RoadUser(String name, designpatterns.libtrafficalert.Subject tr) {
        this.name=name;
        this.subject=tr;
        this.subject.register(this);
    }
    public void update(String msg) {
        this.msg=msg;
        System.out.println(name+" receives alert: "+msg);
    }





}
