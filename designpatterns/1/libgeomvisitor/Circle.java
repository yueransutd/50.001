package designpatterns.libgeomvisitor;
import java.lang.Math;

import designpatterns.libgrandtotalvisitor.*;


public class Circle implements Visitable {
     // Your code goes here
    private double radius;
    public Circle(double radius) {
        this.radius=radius;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
    public double getRadius() {
        return this.radius;
    }






}
