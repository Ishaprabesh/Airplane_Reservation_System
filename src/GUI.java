//import javax.swing.*;
//import javax.swing.border.Border;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.ObjectInputStream;
//
//public class GUI {
//    public static JPanel mainJP = new JPanel();
//    public static JButton exit = new JButton("Exit");
//
//    ///////////////START of PURDUEP FRAME/////////////
//    public static void main(String[] args) {
//
//
//        mainJP.setSize(400, 400);
//        JPanel jPanel = new JPanel();
//        JPanel jPanel1 = new JPanel();
//        JPanel jPanel2 = new JPanel();
//
//        //start of image
//        ImageIcon purdueP = new ImageIcon("PurdueP.png");
//        Image purdueP1 = purdueP.getImage();
//        Image newPurdueP = purdueP1.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
//        purdueP = new ImageIcon(newPurdueP);                                    //resizing PurdueP
//        jPanel.add(new JLabel(purdueP));                                        //adding PurdueP to JPanel
//        mainJP.add(jPanel, BorderLayout.CENTER);                               //adding JPanel to JFrame
//        //end of image
//
//        //start of welcome message
//        jPanel1.add(new JLabel("<html><b>Welcome to the Purdue University Airline Reservation " +
//                "Management System!</b><html>"));
//        mainJP.add(jPanel1, BorderLayout.NORTH);
//        //end of welcome message
//
//        //start of exit button
//        exit.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                mainJP.setVisible(false);
//            }
//        });
//        jPanel2.add(exit, BorderLayout.WEST);
//        mainJP.add(jPanel2, BorderLayout.SOUTH);
//        //end of exit button
//
//        //start of book button
//        JButton book = new JButton("Book a Flight");
//        book.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                mainJP.setVisible(false);
//            }
//        });
//        jPanel2.add(book, BorderLayout.EAST);
//        mainJP.add(jPanel2, BorderLayout.SOUTH);
//        //end of book button
//
//        mainJP.setVisible(true);
//
//        ////TESTING
//        JFrame welcome = new JFrame("Purdue University Flight Reservation System");
//        welcome.setResizable(false);
//        welcome.setLocationRelativeTo(null);                                    //placing JFrame in the middle
//        welcome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        welcome.setSize(500,300);
//        welcome.add(mainJP, BorderLayout.CENTER);
//        welcome.pack();
//        welcome.setVisible(true);
//        ////TESTING
//
//////////////////END OF PURDUEP FRAME///////////////////
//    }
//
//}
