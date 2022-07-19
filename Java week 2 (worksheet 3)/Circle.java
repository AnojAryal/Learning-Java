// importing scanner package from java
import java.util.Scanner;
// creating class named Circle
class Circle{
    
    // declaring constant
    public static final double PI = 3.1415;
     
    // declaring circumference method
    public void circumference(double radius){
        double e = 2 * PI * radius;
        // output the result
        System.out.printf("The circumference of the circle is " + e);
    }

    // declaring area method
    public void area(double radius){
        double f = 2 * PI * radius * radius;
        //output the result
        System.out.printf("The area of the circle is " + f);

    }

    // volume method is declared.
    public void volume(double radius){
        double g = 4 * PI * radius * radius * radius / 3;
        // output the result
        System.out.printf("The volume of the circle is " + g);
    }

    // main function is decalred
    public static void main(String [] args){
        // object is initialized
        Scanner read = new Scanner(System.in);
        // output the required result
        System.out.printf("Enter radius of the circle : ");
        double radius = read.nextDouble();
        read.close();
        // object is initilized
        Circle c = new Circle();
        // circumference is called
        c.circumference(radius);
        // area is called
        c.area(radius);
        // volume is called
        c.volume(radius);
        
    }
}