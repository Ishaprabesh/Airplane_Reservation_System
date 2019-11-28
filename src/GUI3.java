import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;


public class GUI3 {
    public static void main(String[] args) {
        GUI.mainJP.removeAll();

        JPanel jPanel3 = new JPanel();
        JPanel jPanel4 = new JPanel();
        JPanel jPanel5 = new JPanel();

        jPanel3.add(new JLabel("<html><b>Do you want to book a flight today?</b><html>"));
        GUI.mainJP.add(jPanel3, BorderLayout.NORTH);

        //start of exit button
        GUI.exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.mainJP.setVisible(false);
            }
        });
        jPanel4.add(GUI.exit, BorderLayout.WEST);
        GUI.mainJP.add(jPanel4, BorderLayout.SOUTH);
        //end of exit button

        //start of book button
        JButton bookFlight = new JButton("Yes, I want to book a flight.");
        bookFlight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.mainJP.setVisible(false);
            }
        });
        jPanel5.add(bookFlight, BorderLayout.EAST);
        GUI.mainJP.add(jPanel5, BorderLayout.SOUTH);
        //end of book button

//        welcome.pack();
        GUI.mainJP.setVisible(true);

        ////TESTING
        JFrame welcome = new JFrame("Purdue University Flight Reservation System");
        welcome.setResizable(false);
        welcome.setLocationRelativeTo(null);                                    //placing JFrame in the middle
        welcome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        welcome.setSize(500,300);
        welcome.add(GUI.mainJP, BorderLayout.CENTER);
        welcome.pack();
        welcome.setVisible(true);
        ////TESTING
    }

}
