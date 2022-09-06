import java.awt.*;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = x;
        int b = y;

        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        System.out.println("GCD=" + a);
    }
}
