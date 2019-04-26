package designpatterns.libgrandtotalvisitor;

public class ShoppingVisitor implements Visitor {

        // Your code goes here
        private double tot=0;
        public void visit(Fish f) {
            tot+=f.getPrice()*f.getWeight();
        }
        public void visit(Jacket j) {
            tot+=j.getPrice()*1.2;
        }
        public void visit(Milk m) {
            tot+=m.getPrice();
        }





        public double getTotal() {
            return this.tot;
        }






}
