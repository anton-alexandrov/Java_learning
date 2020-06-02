package Test_automation;

public class Rectangle {

    public double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }



    public double area () {
        return this.a * this.b;
    }

    public double perimeter() {return this.a*2+this.b*2;}
}
