import javax.swing.JOptionPane;

public class Initials {
    public static void main(String[] args) {

        String myInitial = " ######     #######                       ####                       ####       \n"
                +
                "        #         #              #                   #        #                     #       #     \n"
                +
                "        #         #               #                  #         #                  #        #      \n"
                +
                "        #         #                #                 #           #              #          #        \n"
                +
                "        #         #                 #                #            #           #            #         \n"
                +
                "        #         #              #                  #              #          #            #          \n"
                +
                "        #         #######                     #                #      #              #            \n"
                +
                "        #         #                                   #                 #    #               #             \n"
                +
                "        #         #                                   #                  #  #                #             \n"
                +
                "        #         #                                   #                   ##                 #             \n"
                +
                "        #         #                                   #                                        #             \n"
                +
                "#       #        #                                   #                                        #              \n"
                +
                " #      #         #                                   #                                      #   ###           \n"
                +
                "  ####         #                                   #                                       #   ###             \n";

        JOptionPane.showMessageDialog(null, myInitial, "My Initials", JOptionPane.PLAIN_MESSAGE);
    }
}
