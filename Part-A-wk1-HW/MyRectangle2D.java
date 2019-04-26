 

// Question 2
// total: 20 points

//===============================================
// todo: complete the following program
//===============================================

public class MyRectangle2D {
    //center of the rectangle
    double x;
    double y;
    //width and height
    double width;
    double height;

    //get and set
    double getX() {
        return this.x;
    }

    void setX(double x) {
        this.x = x;
    }

    double getY() {
        return this.y;
    }

    void setY(double y) {
        this.y = y;
    }

    double getWidth() {
        return this.width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getHeight() {
        return this.height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    //no-arg constructor
    MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    //constructor with args
    MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    //Area of the rectangle
    double getArea() {
        return this.width * this.height;
    }

    //Perimeter
    double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    //Check if the point is inside
    boolean contains(double x, double y) {
        return (x > (this.x - this.width / 2) &&
                x < (this.x + this.width / 2) &&
                y < (this.y + this.height / 2) &&
                y > (this.y - this.height / 2));
    }

    //Check if the rectangle is inside
    boolean contains(MyRectangle2D r) {
        return (r.x + r.width / 2 <= this.x + this.width / 2 &&
                r.x - r.width / 2 >= this.x - this.width / 2 &&
                r.y + r.height / 2 <= this.y + this.height / 2 &&
                r.y - r.height / 2 >= this.y - this.height / 2);
    }

    //overlap
    boolean overlaps(MyRectangle2D r) {
        if (this.contains(r)) return false;
        return (this.contains(r.x - r.width / 2, r.y - r.height / 2) ||
                this.contains(r.x + r.width / 2, r.y - r.height / 2) ||
                this.contains(r.x - r.width / 2, r.y + r.height / 2) ||
                this.contains(r.x + r.width / 2, r.y + r.height / 2));

    }


}




//===============================================
// test case
//===============================================

/*

Input:

MyRectangle2D a = new MyRectangle2D();
System.out.println(a.getX());

Expected Output: 0


Input: 

MyRectangle2D a = new MyRectangle2D();
String ans =a.getX()+", "+a.getY()+", "+a.getWidth()+", "+a.getHeight()+", "+a.getPerimeter()+", "+a.getArea();
System.out.println(ans);

Expected Output: 0.0, 0.0, 1.0, 1.0, 4.0, 1.0


Input: 

MyRectangle2D a = new MyRectangle2D(1,2,3,4);
String ans =a.getX()+", "+a.getY()+", "+a.getWidth()+", "+a.getHeight()+", "+a.getPerimeter()+", "+a.getArea();
System.out.println(ans);

Expected Output: 1.0, 2.0, 3.0, 4.0, 14.0, 12.0


Input: 

MyRectangle2D b = new MyRectangle2D(10,20,60,20);
String ans = ""+b.contains(-18,12);
System.out.println(ans);

Expected Output: true


Input: 

MyRectangle2D b = new MyRectangle2D(10,20,60,20);
String ans = ""+b.contains(new MyRectangle2D(-10,22,5,4));
System.out.println(ans);

Expected Output: true


Input: 

MyRectangle2D b = new MyRectangle2D(10,20,60,20);
String ans = ""+b.contains(new MyRectangle2D(-10,22,22,4));
System.out.println(ans);

Expected Output: false


Input: 

MyRectangle2D b = new MyRectangle2D(10,20,60,20);
String ans = ""+b.overlaps(new MyRectangle2D(-32,22,22,4));
System.out.println(ans);

Expected Output: false

*/

