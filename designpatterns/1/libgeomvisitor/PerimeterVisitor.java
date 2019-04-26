package designpatterns.libgeomvisitor;

public class PerimeterVisitor implements Visitor {

     // Your code goes here
    private double per=0;
    public void visit(Circle c){
        per+=Math.PI*2*c.getRadius();
    }
    public void visit(Rectangle r){
        per+=2*(r.getA()+r.getB());
    }
    public void visit(Square s){
        per+=  s.getLen()*4;
    }
    public double getTotalPerimeter() {
        return per;
    }





}

