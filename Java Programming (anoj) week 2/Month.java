import java.util.Scanner;
 
public class Month{
    public static String names;
    public static String month_text;
    public static int month;

    public Month(){
        names = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
    }
    public String month(){
        return names.substring((month - 1) * 9, month * 9);
    }
    public static void main(String[] args) {
           
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Month number: ");
    month = scan.nextInt();
    scan.close();

    Month m = new Month();
    System.out.println(m.month());
    }
}