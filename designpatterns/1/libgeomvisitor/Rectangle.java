package designpatterns.libgeomvisitor;

public class Rectangle implements Visitable {
    // Your code goes here
    private double a=0;
    private double b=0;
    public Rectangle(double a,double b) {
        this.a=a;
        this.b=b;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }






}

