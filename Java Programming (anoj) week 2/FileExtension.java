import java.util.Scanner;

public class FileExtension {
    public static String drive,path,fileName,extension;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your drive name : ");
        drive = scan.next();
        System.out.println("Enter your path : ");
        path = scan.next();
        System.out.println("Enter your file name : ");
        fileName = scan.next();
        System.out.println("Enter the extension name : ");
        extension = scan.next();
        scan.close();

        System.out.println("path :"+ drive.toUpperCase()+":\\"+path+"\\"+fileName+"."+extension);

    }
}
