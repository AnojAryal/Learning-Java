import java.util.Scanner;
 
public class NoComma{
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);
        String number;
        String lastDigit;
        String firstDigit;
            
        System.out.print("number between 1,000 and 999,999: ");
        number = scan.next();
            
        scan.close();
            
        lastDigit = number.substring(number.length() - 3);
        firstDigit = number.substring(0, number.length() - 4);
            
        System.out.println(firstDigit + lastDigit);
    }
}