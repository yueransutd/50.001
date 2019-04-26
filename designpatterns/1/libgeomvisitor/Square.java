package designpatterns.libgeomvisitor;


public class Square implements Visitable {
    // Your code goes here
    private double len=0;
    public Square(double len) {
        this.len=len;
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
    public double getLen() {
        return this.len;
    }





}
