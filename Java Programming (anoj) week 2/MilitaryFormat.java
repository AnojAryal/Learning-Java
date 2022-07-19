import java.util.Scanner;;

public class MilitaryFormat{
    public static int firstTime;
    public static int secoundTime;
    public static int difference;

    public MilitaryFormat(){
        difference = secoundTime-firstTime;
    }
    public int militaryFormatHour(){
        return Math.floorDiv(difference, 100);
    }
    public int militaryFormatMinutes(){
        return difference % 100;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first time :" );
        firstTime = scan.nextInt();
        System.out.println("Enter the secound time :" );
        secoundTime = scan.nextInt();
        scan.close();

        MilitaryFormat mf = new MilitaryFormat();
        System.out.println(mf.militaryFormatHour()+" Hour "+" "+mf.militaryFormatMinutes()+" Minutes");
    }
}