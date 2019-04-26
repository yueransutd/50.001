package designpatterns.libtaxvisitor;

public class Electronics implements Visitable {
    // Your code goes here
    private double price;
    public Electronics(double price) {
        this.price=price;
    }
    public double getPrice() {
        return this.price;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }






}
