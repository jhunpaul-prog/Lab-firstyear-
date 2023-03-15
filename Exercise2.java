import java.util.Scanner;
import java.rmi.RemoteException;
import java.text.*;

public class Exercise2 {

    public static methods() {
        Scanner sc = new Scanner(System.in);
        DecimalFormat of = new DecimalFormat("0.00");
        int num1, num2, sum, diff, product;
        double quotient, remainder;
        System.out.print("Enter First Number:");
        num1 = sc.nextInt();

        System.out.print("Enter Second Number:");
        num2 = sc.nextInt();

        sum = num1 + num2;
        diff = num1 - num2;
        product = num1 * num2;
        quotient = (double) num1 / (double) num2;
        remainder = (double) num1 % (double) num2;

        System.out.println("THE SUM IS: " + sum);
        System.out.println("THE DIFFERENCE IS: " + diff);
        System.out.println("THE PRODUCT IS: " + product);
        System.out.println("THE QUOTIENT IS: " + String.format("%.2f", quotient));
        System.out.println("THE REMAINDER IS: " + String.format("%.2f", remainder));

    }

}
