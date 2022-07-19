import java.util.Scanner;

public class OnlineBank {
    public static float balance, iniatialBalance;
    public static float annualRate, monthlyRate;

    public OnlineBank(){
        annualRate = annualRate/100;
        monthlyRate = annualRate/12;
    }
    public void onlineBank(){
        balance = (1+monthlyRate)*iniatialBalance;
        System.out.println("balance after first month is :"+ balance);
        balance = (1+monthlyRate)*balance;
        System.out.println("balance after secound month is :"+ balance);
        balance = (1+monthlyRate)*balance;
        System.out.println("balance after third month is :"+ balance);
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your initial balance :" );
        iniatialBalance = scan.nextInt();
        System.out.print("Enter your annual rate in percentage :" );
        annualRate = scan.nextInt();
        scan.close();
        OnlineBank ob = new OnlineBank();
        ob.onlineBank();
    }

}
