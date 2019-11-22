import javax.swing.*;
import java.util.ArrayList;

public class Flight {
    Airline aeroplane;
    Gate g;
    ArrayList<Passenger> passengers;
    double totalPass;
    double currentPass;

    public Flight(String name) {
        g = new Gate();
        passengers = new ArrayList<>();
        currentPass = 0;
        if (name.equals("Delta")) {
            Delta d = new Delta(200, g);
            aeroplane = d;
            totalPass = 200;
            //passengers = new Passenger[200];
        }
        if (name.equals("Alaska")) {
            Alaska a = new Alaska(100, g);
            aeroplane = a;
            totalPass = 100;
            //passengers = new Passenger[100];
        }
        if (name.equals("Southwest")) {
            Southwest sw = new Southwest(100, g);
            aeroplane = sw;
            totalPass = 100;
            //passengers = new Passenger[100];
        }
        //handle error case
    }

    public void addPassenger(Passenger p) {
        if (passengers.size() < totalPass) {
            passengers.add(p);
            currentPass++;
        } else {
            g = null;
            JOptionPane.showMessageDialog(null,
                    "Sorry the flight is full"
                    , "Flight is full", JOptionPane.ERROR_MESSAGE);
        }
    }


}
