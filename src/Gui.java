import javax.swing.*;

public class Gui {
    public static void main(String[] args) {
        String host =  JOptionPane.showInputDialog(null,
                "What is the hostname you'd like to connect to?",
                "Hostname?", JOptionPane.QUESTION_MESSAGE);

        String portString =  JOptionPane.showInputDialog(null,
                "What is the port you'd like to connect to?",
                "Hostname?", JOptionPane.QUESTION_MESSAGE);
        int port = Integer.parseInt(portString);
        // put the big purdue picture
        Object[] options = {"Yes, I want to book a flight.", "Exit"};
        int n = JOptionPane.showOptionDialog(null,
                "Do you want to book a flight today?",
                "Purdue University Flight Reservation System",
                JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE
                ,
                null,     //do not use a custom Icon
                options,  //the titles of buttons
                options[0]);
    }
}
