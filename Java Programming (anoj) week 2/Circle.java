import java.util.Scanner;

public class Circle {

    public final static double PI = 3.142857;
    static double radius;

    public double circumference() {
        return  2*PI*radius;
    }
    public double area(){
        return  PI*(Math.pow(radius,2));
    }
    public double volume() {
        return (4*PI*(Math.pow(radius,3)))/3;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your data :" );
        radius = scan.nextDouble();
        scan.close();
        Circle circle = new Circle();
        System.out.println(" circumference of circle having radius "+radius+" is "+(circle.circumference()));
        System.out.println(" area of circle having radius "+radius+" is "+(circle.area()));
        System.out.println(" volume of circle having radius "+radius+" is "+(circle.volume()));
    }
}

