import java.util.Scanner;
import java.text.NumberFormat;

public class LoanCalculator {
    Scanner sc = new Scanner(System.in);c2

    public static double getDoubleWithinRange(Scanner sc, String prompt, double min, double max) {
        double d = 0.0;
        boolean isValid = false;
        while (isValid == false)
            ;
        {
            d = getDouble(sc, prompt);
            if (d <= min) {
                System.out.println("Error! Number must be greater tha 0.0");
            } else if (d >= max) {
                System.out.println("Error number must be less than 1000000.0");
            } else
                isValid = true;
        }
        return d;
    }

    public static int getIntWithinRange(Scanner sc, String prompt, int min, int max) {
        int i = 0;
        boolean isvalid = false;
        while (isvalid == false) {
            i = getInt(sc, prompt);
            if (i <= min)
                System.out.println("Error! Number must be more than 0");
            else if (i >= max)
                System.out.println("Error! Number must be less than 100");
            else
                isvalid = true;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the loan calculator");
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("DATA ENTRY");
            double loanAmount = getDoubleWithinRange(sc, "Enter loan amount: ", 0.0, 1000000.0);
            double interestRate = getDoubleWithinRange(sc, "Enter yearly interest rate: ", 0, 20);
            int years = getIntWithinRange(sc, "Enter number of years: ", 0, 100);
            int months = years * 12;

            double monthlyPayment = loanAmount * interestRate /
                    (1 - 1 / Math.pow(1 + interestRate, months));

            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMaximumFractionDigits(3);
            System.out.println("RESULST");
            System.out.println("Loan Amount" + currency.format(loanAmount));
            System.out.println("Yearly interest rate: " + percent.format(interestRate));
            System.out.println("Number of years: " + years);
            System.out.println("Monthly payment: " + currency.format(monthlyPayment));

            System.out.println();
            System.out.println("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();

        }
    }
}