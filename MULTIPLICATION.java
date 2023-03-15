import javax.swing.JOptionPane;

public class MULTIPLICATION {

    public static void main(String[] args) {
        boolean tryAgain = true;
        while (tryAgain) {
            int start, end;

            String input = JOptionPane.showInputDialog(null,
                    "Please enter the range of numbers.\n\n" +
                            "START: ");
            start = Integer.parseInt(input);

            input = JOptionPane.showInputDialog(null, "END: ");
            end = Integer.parseInt(input);

            String output = " ";
            if (start <= end) {
                for (int i = start; i <= end; i++) {
                    output += ("         " + i);
                }
                output += ("      \n");

                for (int i = start; i <= end; i++) {
                    output += (i);
                    for (int j = start; j <= end; j++) {
                        output += ("     " + i * j);
                    }
                    output += ("    ");
                }
                output += ("    ");
            }

            else {
                for (int i = start; i >= end; i--) {
                    output += ("         " + i);
                }
                output += ("    ");

                for (int i = start; i >= end; i--) {
                    output += i;
                    for (int j = start; j >= end; j--) {
                        output += "     \n" + (i * j);
                    }
                    output += ("      ");

                }
                output += "        ";

            }

            JOptionPane.showMessageDialog(null, output);

            int choice = JOptionPane.showConfirmDialog(null, "Do you want to try again?", "Try again?",
                    JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                tryAgain = true;
            } else {
                tryAgain = false;
            }
        }
        JOptionPane.showMessageDialog(null, "Thank you!");
    }
}
