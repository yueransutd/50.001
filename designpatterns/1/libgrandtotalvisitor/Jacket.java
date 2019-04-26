package designpatterns.libgrandtotalvisitor;

 
public class Jacket implements Visitable {
    
  // Your code goes here
    private double price;
    public Jacket(double price) {
        this.price=price;
    }
    public double getPrice() {
        return this.price;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }






}

