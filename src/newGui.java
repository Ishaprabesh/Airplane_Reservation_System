import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Purdue University Flight Reservation System");
        frame.setSize(500, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);                                    //placing JFrame in the middle
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton exit = new JButton("Exit");

        JPanel jPanel = new JPanel();
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        BoxLayout boxLayout = new BoxLayout(jPanel, BoxLayout.Y_AXIS);
        jPanel.setLayout(boxLayout);
        JLabel myLabel = new JLabel("<html><b>Choose a flight from the drop down menu.</b><html>");
        JLabel bigText = new JLabel("<html><div style= 'text-align: center;'>" + "Delta Airlines is proud " +
                "to be one of the five premier Airlines at Purdue University.<br>We are extremely proud to offer " +
                "exceptional services, with free limited Wifi for all customers.<br>Passengers who use T-Mobile " +
                "as a cell phone carrier get additional benefits.<br>We are also happy to offer power outlets in " +
                "each seat for passenger use.<br>We hope you choose to fly Delta as your next " +
                "Airline.</div></html>");


        jPanel1.add(myLabel, BorderLayout.NORTH);
//        frame.add(jPanel, BorderLayout.NORTH);

        JComboBox <String> myBox = new JComboBox<>();
        myBox.addItem("Delta");
        myBox.addItem("Southwest");
        myBox.addItem("Alaska");
//        jPanel1.add(myBox, BorderLayout.SOUTH);

        frame.add(jPanel1, BorderLayout.NORTH);
//        frame.add(jPanel2, BorderLayout.CENTER);


        Font myFont = myLabel.getFont();
        jPanel2.add(myBox, BorderLayout.NORTH);
        jPanel2.add(bigText, BorderLayout.SOUTH);
        bigText.setFont(new Font (myLabel.getFont().getName(), Font.PLAIN, 10));
        frame.add(jPanel2, BorderLayout.CENTER);
        frame.setVisible(true);

    }
}
