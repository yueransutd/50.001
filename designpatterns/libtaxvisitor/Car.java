package designpatterns.libtaxvisitor;

public class Car implements Visitable {
      // Your code goes here
    private double price;
    public Car(double price) {
        this.price=price;
    }
    public double getPrice() {
        return this.price;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }




}
