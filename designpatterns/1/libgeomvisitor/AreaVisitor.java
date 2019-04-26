package designpatterns.libgeomvisitor;

public class AreaVisitor implements Visitor {

    // Your code goes here
    private double area=0;
    public void visit(Circle c){
        area+=Math.PI*c.getRadius()*c.getRadius();
    }
    public void visit(Rectangle r){
        area+=r.getA()*r.getB();
    }
    public void visit(Square s){
        area+=  s.getLen()*s.getLen();
    }
    public double getTotalArea() {
        return area;
    }







}

