// import Scanner class
import java.util.Scanner;
// declaring Average class
class Average{
    // declaring void function avg
    public void avg(double a, double b, double c){
        double ag = (a + b + c) / 3;
        // output the result
        System.out.println("The average of the three numbers is " + ag);
    }
    // declaring main method
    public static void main(String[] args) {
        // Reading form console.
        Scanner read = new Scanner(System.in);
        // print the desired result
        System.out.println("Enter three numbers : ");
        // values entered are read. 
        double a = read.nextDouble();
        double b = read.nextDouble();
        double c = read.nextDouble();
        read.close();

        // initilizaing object
        Average w = new Average();
        // invoking the avg method
        w.avg( a , b , c );
    }
}