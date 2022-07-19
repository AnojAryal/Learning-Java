import java.util.Scanner;

public class Convert {
    public final double MILE = 0.000621371;
    public final double FEET = 3.28084;
    public final double INCH = 39.3701;
    static public double data;

    public double convertInMile() {
        return data*MILE;
    }
    public double convertFeet() {
        return data*FEET;
    }
    public double convertInInch() {
        return data*INCH;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your data :" );
        data = scan.nextDouble();
        scan.close();
        Convert convert = new Convert();
        System.out.println(data +" meter to miles ="+ (convert.MILE));
        System.out.println(data +" meter to feet ="+ (convert.FEET));
        System.out.println(data +" meter to inch ="+ (convert.INCH));
    }
}
