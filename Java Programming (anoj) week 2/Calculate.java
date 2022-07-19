import java.util.Scanner;

public class Calculate {
    static public int number1;
    static public int number2;

    public int sub(){
        return number1-number2;
    }
    public int product(){
        return number1*number2;
    }
    public int average(){
        return ((number1+number2)/2);
    }
    public int max(){
        return (Math.max(number1,number2));
    }
    public int min(){
        return (Math.min(number1,number2));
    }
    public int add(){
        return number1+number2;
    }
    public int distance(){
        return (Math.abs(number1-number2));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first data :" );
        number1 = scan.nextInt();
        System.out.println("Enter your secound data :" );
        number2 = scan.nextInt();
        scan.close();
        Calculate calc = new Calculate();
        System.out.println("add result ="+(calc.add()));
        System.out.println("sub result ="+(calc.sub()));
        System.out.println("product result ="+(calc.product()));
        System.out.println("average result ="+(calc.average()));
        System.out.println("max result ="+(calc.max()));
        System.out.println("min result ="+(calc.min()));
        System.out.println("distance result ="+(calc.distance()));
    }
}
