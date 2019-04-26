package designpatterns.libtaxvisitor;

public class TaxVisitor implements Visitor {

   // Your code goes here
    private double tot=0;
    private String state="";
    public TaxVisitor(String s) {
        this.state=s;
    }


    public void visit(Car c) {
        if (this.state=="TAXNORMAL") {
            tot+=0.4*c.getPrice();
        }
        if(this.state=="TAXHOLIDAY") {
            tot+=0.3*c.getPrice();
        }

    }
    public void visit(Electronics e) {
        if (this.state=="TAXNORMAL") {
            tot+=0.8*e.getPrice();
        }
        if(this.state=="TAXHOLIDAY") {
            tot+=0.5*e.getPrice();
        }

    }
    public void visit(Chocolate c) {

        if (this.state=="TAXNORMAL") {
            tot+=0.2*c.getPrice();
        }
        if(this.state=="TAXHOLIDAY") {
            tot+=0.1*c.getPrice();
        }

    }
    public double getTotal() {
        return tot;
    }



}


