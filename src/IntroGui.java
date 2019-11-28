import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;

public class IntroGui {
    public static void main(String[] args) {
        //Thread t = new Thread();
        String host =  JOptionPane.showInputDialog(null,
                "What is the hostname you'd like to connect to?",
                "Hostname?", JOptionPane.QUESTION_MESSAGE);
        if (host == null) {
            return;
        }

        //put while loop to keep showing the dialog box as long as there is invalid input
        String portString =  JOptionPane.showInputDialog(null,
                "What is the port you'd like to connect to?",
                "Hostname?", JOptionPane.QUESTION_MESSAGE);
        try {
            int port = Integer.parseInt(portString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid port number.");
        }





//        JFrame welcome = new JFrame("Purdue University Flight Reservation System");
//        welcome.setResizable(false);
//        welcome.setLocationRelativeTo(null);                                    //placing JFrame in the middle
//        welcome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        welcome.setSize(500,300);
//        welcome.pack();



//        try {
//            t.wait(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }
}
