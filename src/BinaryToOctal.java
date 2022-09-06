import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int num = sc.nextInt();

        int d = 0;
        int temp = num;
        int i = 0;
        String b="";

        while (temp > 0) {
            int r = temp % 10;
            temp = temp / 10;
            d = d + r * (int) Math.pow(2, i++);
        }

            while (d > 0)
            {
                int r = d % 8;
                d = d / 8;
                b = r + b;
            }

        System.out.println("octal of " + num + " is " + b);

    }
}
