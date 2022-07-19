import java.util.Scanner;

public class EsterSunday {
    public int a, b, c, d, e, g, h, j, k, m, r, n, p;
    public static int y;
    public EsterSunday(){
        a = y % 19;
        b = y / 100;
        c = y % 100;
        d = b / 4;
        e = b % 4;
        g = (8 * b + 13) / 25;
        h = (19 * a + b - d - g + 15) % 30;
        j = c / 4;
        k = c % 4;
        m = (a + 11 * h) / 319;
        r = (2 * e + 2 * j - k - h + m + 32) % 7;
        n = (h - m + r + 90) / 25;
        p = (h - m + r + n + 19) % 32;

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your year : " );
        y = scan.nextInt();
        scan.close();
        EsterSunday es = new EsterSunday();

        System.out.println("The ester egg is at : "+ EsterSunday.y + " year, "+ es.n + " month, "+ es.p + " day, "   );

    }
}
