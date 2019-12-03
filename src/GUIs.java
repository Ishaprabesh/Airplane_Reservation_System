import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class GUIs {
    static JFrame frame;
    static JButton exit;
    static JFrame tinyFrame;
    static JTextArea jtextArea;
    static JTextArea jtextArea1;
    static JTextArea jtextArea2;
    static boolean b;
    static Passenger passenger;
    static Airline airline;
    static Gate gate;

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
            JOptionPane.showMessageDialog(null, "Invalid port number.",
                    "Invalid Port", JOptionPane.ERROR_MESSAGE);
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
                dropDownDialog();
            }
        });
        jPanel4.add(exit);
        jPanel4.add(bookFlight);
        frame.add(jPanel4, BorderLayout.SOUTH);
        //end of book button

        frame.pack();
        frame.setVisible(true);
    }


    public static void dropDownDialog() {
        frame.removeAll();
        frame = new JFrame("Purdue University Flight Reservation System");
        frame.setSize(500, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);                                    //placing JFrame in the middle
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //start of components
        JPanel jPanel = new JPanel();
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();

        JButton chooseFlight = new JButton("Choose this flight");

        BoxLayout boxLayout = new BoxLayout(jPanel, BoxLayout.Y_AXIS);
        jPanel.setLayout(boxLayout);                            //selecting the layout for jPanel

        JLabel intro = new JLabel("<html><b>Choose a flight from the drop down menu.</b><html>");
        JLabel bigText = new JLabel();
        String bigTextDelta = "<html><div style= 'text-align: center;'>" + "Delta Airlines is proud " +
                "to be one of the five premier Airlines at Purdue University.<br>We are extremely proud to offer " +
                "exceptional services, with free limited Wifi for all customers.<br>Passengers who use T-Mobile " +
                "as a cell phone carrier get additional benefits.<br>We are also happy to offer power outlets in " +
                "each seat for passenger use.<br>We hope you choose to fly Delta as your next " +
                "Airline.</div></html>";
        String bigTextSouthwest = "<html><div style= 'text-align: center;'>" +
                "Southwest Airlines is proud to offer flights to Purdue University.<br>We are happy to offer " +
                "free in flight wifi, as well as our amazing snacks.<br>In addition, we offer flights for " +
                "much cheaper than other airlines, and offer two free checked bags.<br>We hope you choose Southwest" +
                "for your next flight.</div></html>";
        String bigTextAlaska = "<html><div style= 'text-align: center;'>" +
                "Alaska Airlines is proud to serve the strong and knowledgeable Boilermakers from Purdue University." +
                "<br>We primarily fly westward, and often have stops in Alaska and California.<br>" +
                "We have first class amenities, even in coach class.<br>We provide fun snacks, such as pretzels " +
                "and goldfish.<br>We also have comfortable seats, and free WiFi<br>We hope you choose Alaska " +
                "Airlines for your next itinerary!</div></html>";
        //end of components


        //JPanel1 start
        jPanel1.add(intro, BorderLayout.NORTH);
        frame.add(jPanel1, BorderLayout.NORTH);
        //JPanel1 end

        //JPanel2 start
        JComboBox<String> myBox = new JComboBox<>();
        myBox.addItem("Delta");
        myBox.addItem("Southwest");
        myBox.addItem("Alaska");
        bigText.setFont(new Font(intro.getFont().getName(), Font.PLAIN, 10));
        bigText.setText(bigTextDelta);
        myBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String airline = myBox.getSelectedItem().toString();
                if (airline != null && airline.equals("Delta")) {
                    bigText.setText(bigTextDelta);
                } else if (airline != null && airline.equals("Southwest")) {
                    bigText.setText(bigTextSouthwest);
                } else if (airline != null && airline.equals("Alaska")) {
                    bigText.setText(bigTextAlaska);
                }
                frame.getContentPane().requestFocus();
            }
        });

        jPanel2.add(myBox, BorderLayout.NORTH);
        jPanel2.add(bigText, BorderLayout.SOUTH);
        frame.add(jPanel2, BorderLayout.CENTER);
        //JPanel2 end

        //JPanel3 start
        ////start of exit button
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
            }
        });
        ////end of exit button

        ////start of chooseFlight button
        chooseFlight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String myAirline = myBox.getSelectedItem().toString();
                if (myAirline.equals("Delta")) {
                    gate = new Gate();
                    airline = new Delta(200, gate);
                    airline.setName("Delta");
                } else if (myAirline.equals("Southwest")) {
                    gate = new Gate();
                    airline = new Southwest(100, gate);
                    airline.setName("Southwest");
                } else {
                    gate = new Gate();
                    airline = new Alaska(100, gate);
                    airline.setName("Alaska");
                }
                frame.setVisible(false);
                flightConfirmation();
            }
        });
        jPanel3.add(exit);
        jPanel3.add(chooseFlight);
        frame.add(jPanel3, BorderLayout.SOUTH);
        ////end of chooseFlight button
        //JPanel3 end


        //Start of KeyBinding
        JPanel contentPane = (JPanel) frame.getContentPane();
        ActionMap aMap = contentPane.getActionMap();
        InputMap inMap = contentPane.getInputMap();

        KeyStroke backSlash = KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SLASH, 0, true);
        inMap.put(backSlash, "openPassengerList");

        AbstractAction abstractAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myBox.requestFocus();
                myBox.revalidate();
                contentPane.revalidate();
                createTinyFrame(myBox.getSelectedItem().toString());

                JPanel tinyContentPane = (JPanel) tinyFrame.getContentPane();
                ActionMap aMap2 = tinyContentPane.getActionMap();
                InputMap inMap2 = tinyContentPane.getInputMap();

                KeyStroke escape = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, true);
                inMap2.put(escape, "closePassengerList");

                AbstractAction abstractAction1 = new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tinyFrame.dispose();
                        contentPane.requestFocus();
                    }
                };
                aMap2.put("closePassengerList", abstractAction1);
            }
        };
        aMap.put("openPassengerList", abstractAction);
        //End of KeyBinding


        frame.setVisible(true);
    }


    public static void createTinyFrame(String airline) {
        ArrayList<String> deltaPassengers = new ArrayList<>();
        ArrayList<String> southwestPassengers = new ArrayList<>();
        ArrayList<String> alaskaPassengers = new ArrayList<>();

        tinyFrame = new JFrame("Purdue University Flight Reservation System");
        tinyFrame.setSize(300, 200);
        tinyFrame.setResizable(false);
        tinyFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton exit = new JButton("Exit");
        JLabel title = new JLabel("");
        if (airline.equals("Delta")) {
            title = new JLabel("<html><b>Delta Airlines. " + deltaPassengers.size() + " : 200" + "</html></b>");
        } else if (airline.equals("Southwest")) {
            title = new JLabel("<html><b>Southwest Airlines. " + southwestPassengers.size() + " : 100"
                    + "</html></b>");
        } else {
            title = new JLabel("<html><b>Alaska Airlines. " + alaskaPassengers.size() + " : 100" + "</html></b>");
        }
        title.setFont(new Font(title.getFont().getName(), Font.BOLD, 17));

        //JPanel jPanel = new JPanel();
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();

        //JPanel1 Start
        jPanel1.add(title, BorderLayout.NORTH);
        tinyFrame.add(jPanel1, BorderLayout.NORTH);
        //JPanel1 End

        //JPanel2 Start
        BoxLayout boxLayout = new BoxLayout(jPanel2, BoxLayout.Y_AXIS);
        jPanel2.setLayout(boxLayout);
        String passengers = "";
        if (airline.equals("Delta")) {
            for (int i = 0; i < deltaPassengers.size(); i++) {
                passengers += deltaPassengers.get(i);
                passengers += "\n";
            }
            JTextArea myArea = new JTextArea(passengers);
            myArea.setEditable(false);
            jPanel2.add(myArea);
            JScrollPane jsp = new JScrollPane(myArea);
            jPanel2.add(jsp);
        } else if (airline.equals("Southwest")) {
            for (int i = 0; i < southwestPassengers.size(); i++) {
                passengers += southwestPassengers.get(i);
                passengers += "\n";
            }
            JTextArea myArea = new JTextArea(passengers);
            myArea.setEditable(false);
            jPanel2.add(myArea);
            JScrollPane jsp = new JScrollPane(myArea);
            jPanel2.add(jsp);
        } else {
            for (int i = 0; i < alaskaPassengers.size(); i++) {
                passengers += alaskaPassengers.get(i);
                passengers += "\n";
            }
            JTextArea myArea = new JTextArea(passengers);
            myArea.setEditable(false);
            jPanel2.add(myArea);
            JScrollPane jsp = new JScrollPane(myArea);
            jPanel2.add(jsp);
        }
        //JPanel2 End

        //JPanel3 Start
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tinyFrame.setVisible(false);
                tinyFrame.dispose();
            }
        });
        jPanel3.add(exit);
        //JPanel3 End

        tinyFrame.add(jPanel1, BorderLayout.NORTH);
        tinyFrame.add(jPanel2, BorderLayout.CENTER);
        tinyFrame.add(jPanel3, BorderLayout.SOUTH);


        tinyFrame.setVisible(true);
    }

    public static void flightConfirmation() {
        frame.removeAll();
        JFrame frame = new JFrame("Purdue University Flight Reservation System");
        frame.setSize(500, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);                                    //placing JFrame in the middle
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton exit = new JButton("Exit");

        JPanel jPanel3 = new JPanel();
        JPanel jPanel4 = new JPanel();

        jPanel3.add(new JLabel("<html><b>Are you sure that you want to book a flight on " + airline.getName() +
                " Airlines?</b><html>"), BorderLayout.NORTH);
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

        //start of notBook button
        JButton notBookFlight = new JButton("No, I want a different flight.");
        notBookFlight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                dropDownDialog();
            }
        });
        //end of notBook button

        //start of book button
        JButton bookFlight = new JButton("Yes, I want this flight.");
        bookFlight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                inputYourInfo();
            }
        });
        //end of book button

        jPanel4.add(exit, BorderLayout.NORTH);
        jPanel4.add(notBookFlight, BorderLayout.CENTER);
        jPanel4.add(bookFlight, BorderLayout.SOUTH);
        frame.add(jPanel4, BorderLayout.SOUTH);


        frame.pack();
        frame.setVisible(true);
    }

    public static void inputYourInfo() {
        frame.removeAll();
        frame = new JFrame("Purdue University Flight Reservation System");
        frame.setSize(500, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);                                    //placing JFrame in the middle
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel jPanel = new JPanel();
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();

        BoxLayout boxLayout = new BoxLayout(jPanel, BoxLayout.Y_AXIS);
        jPanel.setLayout(boxLayout);

        jPanel2.add(new JLabel("<html><b><center>Please input your information below.</center></b></html>")
                , BorderLayout.NORTH);
        jPanel.add(jPanel2);

        //TODO- figure out how to keep the size of the jtextarea constant, ask Pranjal which one is better
        // (specifying the size or not specifying). Not specifying gives horizontal freedom, specifying gives a
        // little vertical freedom
        JLabel firstName = new JLabel("What is your first name?");
        firstName.setAlignmentX(Component.LEFT_ALIGNMENT);
        jPanel.add(firstName);
        jtextArea = new JTextArea(3, 15);
        jPanel.add(jtextArea);

        jPanel.add(new JLabel("What is your last name?"));
        jtextArea1 = new JTextArea(3, 15);
        jPanel.add(jtextArea1);

        jPanel.add(new JLabel("What is your age?"));
        jtextArea2 = new JTextArea(3, 15);
        jPanel.add(jtextArea2);

        JButton next = new JButton("Next");
        jPanel1.add(exit);
        jPanel1.add(next);


        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
            }
        });
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputValidation();
                if (b == true) {
                    passenger = new Passenger(jtextArea.getText(), jtextArea1.getText(),
                            Integer.parseInt(jtextArea2.getText()));
                    int confirm = JOptionPane.showConfirmDialog(null, "Are all the details you " +
                            "entered correct?\nThe passenger's name is " + passenger.getFirstName() + " " +
                            passenger.getLastName() + " and their age is " + passenger.getAge() + ".\n" +
                            "If all the information shown is correct,\nselect the Yes button below,\notherwise, " +
                            "select the No button.", "Confirm Info", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        frame.setVisible(false);
                        lastDialog();
                    }
                }
            }
        });
        jPanel.add(jPanel1);


        frame.add(jPanel);
        frame.setVisible(true);
    }

    public static void inputValidation() {
        b = true;
        if (jtextArea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter first name.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            b = false;
        } else {
            String jtextAreaLower = jtextArea.getText().toLowerCase();
            for (int i = 0; i < jtextArea.getText().length(); i++) {
                char c = jtextAreaLower.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    b = true;
                } else {
                    b = false;
                    break;
                }
            }
            if (b == false) {
                JOptionPane.showMessageDialog(null, "Please enter a valid first name.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (jtextArea1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter last name.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            b = false;
        } else {
            String jtextArea1Lower = jtextArea1.getText().toLowerCase();
            for (int i = 0; i < jtextArea1.getText().length(); i++) {
                char c = jtextArea1Lower.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    b = true;
                } else {
                    b = false;
                    break;
                }
            }
            if (b == false) {
                JOptionPane.showMessageDialog(null, "Please enter a valid last name.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (jtextArea2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter age.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            b = false;
        } else {
            try {
                int ageInt = Integer.parseInt(jtextArea2.getText());
                if (ageInt < 0) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid age.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    b = false;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid age.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                b = false;
            }
        }
    }

    public static void lastDialog() {
        frame.removeAll();
        frame = new JFrame("Purdue University Flight Reservation System");
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);                                    //placing JFrame in the middle
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        BorderLayout borderLayout = new BorderLayout();
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(borderLayout);
        JPanel jPanel3 = new JPanel();

        //jPanel1 start
        jPanel1.add(new JLabel("<html><b><center>Flight data displaying for " + airline.getName()
                        + " Airlines<br>Enjoy your flight!<br>Flight is now boarding at " + gate.getGate()
                        + "</center></b></html>")
                , BorderLayout.CENTER);
        //jPanel1 end

        //jPanel2 start
        ArrayList<String> arrayList = new ArrayList<>();
        String passengers = "";
        for (int i = -1; i < arrayList.size(); i++) {
            if (i == -1) {
                if (airline.equals("Delta")) {
                    String ratio = arrayList.size() + " : 200";
                    passengers += "                                                     ";
                    passengers += ratio;
                    passengers += "\n";
                } else if (airline.equals("Southwest")) {
                    String ratio = arrayList.size() + " : 100";
                    passengers += "                                                     ";
                    passengers += ratio;
                    passengers += "\n";
                } else {
                    String ratio = arrayList.size() + " : 100";
                    passengers += "                                                     ";
                    passengers += ratio;
                    passengers += "\n";
                }
            } else {
                passengers += arrayList.get(i);
                passengers += "\n";
            }
        }
        JTextArea myArea = new JTextArea(passengers);
        myArea.setEditable(false);
        jPanel2.add(myArea);
        JScrollPane jsp = new JScrollPane(myArea);
        jPanel2.add(jsp);

        BoardingPass boardingPass = new BoardingPass(passenger, airline, gate);
        jPanel2.add(new JLabel(boardingPass.toString()), BorderLayout.SOUTH);
        //jPanel2 end

        //jPanel3 start
        ////end button start
        jPanel3.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "<html>Thank you for using the Purdue " +
                                "University<br>Airline Management System!<html>", "Thank You!",
                        JOptionPane.PLAIN_MESSAGE);
            }
        });
        ////end button end

        ////refreshStatus button start
        JButton refreshStatus = new JButton("Refresh Flight Status");
        refreshStatus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> arrayList = new ArrayList<>();
                String passengers = "";
                for (int i = -1; i < arrayList.size(); i++) {
                    if (i == -1) {
                        if (airline.equals("Delta")) {
                            String ratio = arrayList.size() + " : 200";
                            passengers += "                                                     ";
                            passengers += ratio;
                            passengers += "\n";
                        } else if (airline.equals("Southwest")) {
                            String ratio = arrayList.size() + " : 100";
                            passengers += "                                                     ";
                            passengers += ratio;
                            passengers += "\n";
                        } else {
                            String ratio = arrayList.size() + " : 100";
                            passengers += "                                                     ";
                            passengers += ratio;
                            passengers += "\n";
                        }
                    } else {
                        passengers += arrayList.get(i);
                        passengers += "\n";
                    }
                }
                JTextArea myArea = new JTextArea(passengers);
                myArea.setEditable(false);
                jPanel2.remove(myArea);
                jPanel2.remove(jsp);
                jPanel2.add(myArea);
                JScrollPane jsp = new JScrollPane(myArea);
                jPanel2.add(jsp);
                jPanel2.revalidate();
                jPanel2.repaint();

            }
        });
        jPanel3.add(refreshStatus);
        ////refreshStatus button end
        //jPanel3 end

        frame.add(jPanel1, BorderLayout.NORTH);
        frame.add(jPanel2, BorderLayout.CENTER);
        frame.add(jPanel3, BorderLayout.SOUTH);


        frame.setVisible(true);
    }
}
