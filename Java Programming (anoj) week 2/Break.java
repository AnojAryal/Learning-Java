import java.util.Scanner;

public class Break {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("give your 6 digit data : ");
        int data = scan.nextInt();
        scan.close();
        int data1 = data / 100000 % 10;
        int data2 = data / 10000 % 10;
        int data3 = data / 1000 % 10;
        int data4 = data / 100 % 10;
        int data5 = data / 10 % 10;
        int data6 = data % 10;
      System.out.println(data1 + " " + data2 + " " + data3 + " " + data4 + " " + data5 + " " + data6);

    }
}
