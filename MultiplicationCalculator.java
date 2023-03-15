import java.util.Scanner;

public class MultiplicationCalculator {

    public static methods(){
        int start, end;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPlease enter the range numbers.");
        System.out.print("START: ");
        start = scanner.nextInt();
        System.out.print("END: ");
        end = scanner.nextInt();

        if (start <= end) {
            for (int i = start; i <= end; i++) {
                System.out.print("\t" + i);
            }
            System.out.print("\n");

            for (int i = start; i <= end; i++) {
                System.out.print(i);
                for (int j = start; j <= end; j++) {
                    System.out.print("\t" + (i * j));
                }
                System.out.print("\n");
            }
            System.out.print("\n");

        } else {

            for (int i = start; i >= end; i--) {
                System.out.print("\t" + i);
            }
            System.out.print("\n");

            for (int i = start; i >= end; i--) {
                System.out.print(i);
                for (int j = start; j >= end; j--) {
                    System.out.print("\t" + (i * j));
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
        scanner.close();

    }
}
