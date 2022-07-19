import java.util.Scanner;
 
public class Comma{
    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        String number;
        String lastDigit;
        String firstDigit;
            
        System.out.print("Integer between 1000 and 999999: ");
        number = input.next();
            
        input.close();
            
        lastDigit = number.substring(number.length() - 3);
        firstDigit = number.substring(0, number.length() - 3);
            
        System.out.println(firstDigit +","+ lastDigit);
    }
}