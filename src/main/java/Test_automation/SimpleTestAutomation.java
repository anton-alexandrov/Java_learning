package Test_automation;

public class SimpleTestAutomation {
    public static void main (String[] arg){
        System.out.println("It's working");

        Square s = new Square(5);
        System.out.println("Area of square with "+s.l + " side is "+s.area());

        Rectangle r = new Rectangle(3,4);
        System.out.println("Area of rectangle with sides: " + r.a + " and "+ r.b +" is "+r.area());
        System.out.println(r.perimeter());

    }
}
