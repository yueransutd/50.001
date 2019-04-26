 

// Question 1
// total: 10 points

//===============================================
// todo: complete the following program
//===============================================

class LinearEquation {

    private double a, b, c, d, e, f;

    LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public double getX() {
        return (a*f-c*e)/(a*d-b*c);
    }

    public double getY() {
        return (e*d-b*f)/(a*d-b*c);
    }

    public boolean isSolvable() {
        return ((a*d-b*c)!=0);
    }






}




//===============================================
// test case
//===============================================

/*

Input:

a = 1.0, b = 2.0, c = 3.0, d = 5.0, e = 6.0, f= 7.0

Expected Output: x is -16.0 and y is 11.0


Input: 

a = 1.25, b = 2.0, c = 2.0, d = 4.2, e = 3.0, f= 6.0

Expected Output: x is 0.48000000000000115 y is 1.2


Input: 

a = 1.0, b = 2.0, c = 2.0, d = 4.0, e = 3.0, f= 6.0

Expected Output: The equation has no solution

*/

