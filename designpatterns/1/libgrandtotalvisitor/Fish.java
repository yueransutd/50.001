package designpatterns.libgrandtotalvisitor;

public class Fish implements Visitable {
    // Your code goes here
    private double weight;
    private double price;
    public Fish(double price,double weight) {
        this.price=price;
        this.weight=weight;
    }
    public double getPrice() {
        return this.price;
    }
    public double getWeight() {
        return this.weight;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }




}

