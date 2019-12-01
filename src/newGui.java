import javax.security.auth.kerberos.KerberosTicket;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.nio.ByteOrder;

public class newGui {
//    private static void setKeyBindings(Container comp, int keyCode, String id, ActionListener actionListener) {
//        JPanel jp =  (JPanel) comp;
//        InputMap inMap = jp.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
//        ActionMap aMap = jp.getActionMap();
//        KeyStroke ks = KeyStroke.getKeyStroke(keyCode, 0, true);
//        inMap.put(ks, id);
//        AbstractAction abstractAction = new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                actionListener.actionPerformed(e);
//            }
//        };
//        aMap.put(id, abstractAction);
//    }
//    private static void resetKeyBindings(KeyStroke ks, Container comp) {
//        JPanel cp = ((JPanel) comp);
//        ActionMap aMap = cp.getActionMap();
//        InputMap inMap = cp.getInputMap();
//        inMap.put(ks, null);
//        aMap.put(ks, null);
//    }

//    private static Action openPassengerList= new AbstractAction() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            //call the method which creates the scrollpane thingie
//        }
//
//    };

    public static void main(String[] args) {
        JFrame frame = new JFrame("Purdue University Flight Reservation System");
        frame.setSize(500, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);                                    //placing JFrame in the middle
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton exit = new JButton("Exit");

        JPanel mainPanel = new JPanel();
        BorderLayout borderLayout = new BorderLayout();
        mainPanel.setLayout(borderLayout);
        JPanel topJPanel = new JPanel();
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(borderLayout);
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();

        Gate gate = new Gate();
//        jPanel1.add(new JLabel("<html><b>Flight data displaying for " + "\nEnjoy your flight!\n" +
//                "Flight is now boarding at " + gate.getGate()));
//        jPanel2.add(new JLabel("<html><b>Enjoy your flight!"));
//        jPanel3.add(new JLabel("Flight is now boarding at " + gate.getGate()));
//
//        topJPanel.add(jPanel1, BorderLayout.PAGE_START);
//        topJPanel.add(jPanel2, BorderLayout.CENTER);
//        topJPanel.add(jPanel3, BorderLayout.PAGE_END);
//        mainPanel.add(topJPanel, BorderLayout.PAGE_START);
//        frame.add(mainPanel);
//
//        frame.setVisible(true);


//        JPanel jPanel1a = new JPanel();
//        JPanel jPanel1b = new JPanel();
//        JPanel jPanel1c = new JPanel();
//        jPanel1a.add(new JLabel("<html><b>Flight data displaying for  </b></html>"));
//        jPanel1b.add(new JLabel("<html><b>Enjoy your flight!</b></html>"));
//        jPanel1c.add(new JLabel("<html><b>Flight is now boarding at " + gate.getGate() + "</b></html>"));
//        jPanel1.add(jPanel1a, BorderLayout.PAGE_START);
//        jPanel1.add(jPanel1b, BorderLayout.CENTER);
//        jPanel1.add(jPanel1c, BorderLayout.PAGE_END);
//
//
//        jPanel2.add(new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
//        BoardingPass boardingPass = new BoardingPass(passenger, airline, gate);
//        jPanel3.add(boardingPass.toString());
//        frame.add(jPanel1, BorderLayout.NORTH);
//        frame.add(jPanel2, BorderLayout.CENTER);
//        frame.add(jPanel3, BorderLayout.SOUTH);

        frame.pack();

        frame.setVisible(true);



    }

}
