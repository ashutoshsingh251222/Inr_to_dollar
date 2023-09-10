import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner dollar=new Scanner (System.in);
        System.out.println("Enter the current price of Dollar here :-");
        int d=dollar.nextInt();
        System.out.println("Enter the INR here :-");
        int rs=dollar.nextInt();
        System.out.println(d*rs);
    }
}