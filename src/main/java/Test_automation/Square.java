package Test_automation;

public class Square {

    public double l;

    public Square(double l) {
        if (l<0) {
            System.out.println("incorrect value");
        }
        else{
            this.l = l;
        }

    }

    public double area () {
        return this.l * this.l;
    }
}
