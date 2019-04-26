package designpatterns.libgrandtotalvisitor;

 
    public class Milk implements Visitable {
        // Your code goes here
        private double price;
        public Milk(double price) {
            this.price=price;
        }
        public double getPrice() {
            return this.price;
        }
        public void accept(Visitor v) {
            v.visit(this);
        }




    }
