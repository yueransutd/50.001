package designpatterns.libtaxvisitor;

public class Chocolate implements Visitable {
      // Your code goes here
    private double price;
    public Chocolate(double price) {
        this.price=price;
    }
    public double getPrice() {
        return this.price;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }





}
