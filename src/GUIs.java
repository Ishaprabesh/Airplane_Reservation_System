import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIs {
    static JFrame frame;
    static JButton exit;
    public static void main(String[] args) {
        //Thread t = new Thread();
        String host = JOptionPane.showInputDialog(null,
                "What is the hostname you'd like to connect to?",
                "Hostname?", JOptionPane.QUESTION_MESSAGE);
        if (host == null) {
            return;
        }

        //put while loop to keep showing the dialog box as long as there is invalid input
        String portString = JOptionPane.showInputDialog(null,
                "What is the port you'd like to connect to?",
                "Hostname?", JOptionPane.QUESTION_MESSAGE);
        try {
            int port = Integer.parseInt(portString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid port number.");
        }

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                PurdueP();
            }
        });




    }

    public static void PurdueP() {
        frame = new JFrame("Purdue University Flight Reservation System");
        frame.setSize(500, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);                                    //placing JFrame in the middle
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel jPanel = new JPanel();
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();

        //start of image
        ImageIcon purdueP = new ImageIcon("PurdueP.png");
        Image purdueP1 = purdueP.getImage();
        Image newPurdueP = purdueP1.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        purdueP = new ImageIcon(newPurdueP);                                     //resizing PurdueP
        jPanel.add(new JLabel(purdueP));                                        //adding PurdueP to JPanel
        frame.add(jPanel, BorderLayout.CENTER);                                 //adding JPanel to JFrame
        //end of image

        //start of welcome message
        jPanel1.add(new JLabel("<html><b>Welcome to the Purdue University Airline Reservation " +
                "Management System!</b><html>"));
        frame.add(jPanel1, BorderLayout.NORTH);
        //end of welcome message

        //start of exit button
        exit = new JButton("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
            }
        });
        jPanel2.add(exit, BorderLayout.WEST);
        frame.add(jPanel2, BorderLayout.SOUTH);
        //end of exit button

        //start of book button
        JButton book = new JButton("Book a Flight");
        book.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                bookAFlight();
                //Place call to next frame here
            }
        });
        jPanel2.add(book, BorderLayout.EAST);
        frame.add(jPanel2, BorderLayout.SOUTH);
        //end of book button

        frame.pack();
        frame.setVisible(true);
    }

    public static void bookAFlight() {
        frame.removeAll();

        frame = new JFrame("Purdue University Flight Reservation System");
        frame.setSize(500, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);                                    //placing JFrame in the middle
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel jPanel3 = new JPanel();
        JPanel jPanel4 = new JPanel();

        jPanel3.add(new JLabel("<html><b>Do you want to book a flight today?</b><html>"), BorderLayout.NORTH);
        frame.add(jPanel3, BorderLayout.NORTH);

        frame.add(Box.createRigidArea(new Dimension(500, 300)));


        //start of exit button
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
            }
        });
        //end of exit button

        //start of book button
        JButton bookFlight = new JButton("Yes, I want to book a flight.");
        bookFlight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });
        jPanel4.add(exit);
        jPanel4.add(bookFlight);
        frame.add(jPanel4, BorderLayout.SOUTH);
        //end of book button

        frame.pack();
        frame.setVisible(true);
    }
}
