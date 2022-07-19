import java.util.Scanner;
 
public class PhoneNumber{
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);
        String number;
        String midDigit;
        String firstDigit;
        String lastDigit;
            
        System.out.print("enter 10 digit number :  ");
        number = scan.next();
            
        scan.close();
            
        midDigit = number.substring( 3,number.length() - 4);
        firstDigit = number.substring(0, number.length() - 7);
        lastDigit = number.substring(6, number.length() -0);

            
        System.out.println("("+firstDigit +")"+ midDigit + "-"+lastDigit);
    }
}
