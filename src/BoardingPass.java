import java.io.Serializable;

public class BoardingPass implements Serializable {
    Passenger passenger;
    Airline airline;
    Gate gate;


    BoardingPass(Passenger passenger, Airline airline, Gate gate) {
        this.passenger = passenger;
        this.airline = airline;
        this.gate = gate;


    }

    public String toString() {
        return "<html>----------------------------------------------------------------------" +
                "<br>BOARDING PASS FOR FLIGHT 18000 WITH " + airline.getName().toUpperCase() + " AIRLINES" +
                "<br>PASSENGER FIRST NAME : " + passenger.getFirstName().toUpperCase() +
                "<br>PASSENGER LAST NAME : " + passenger.getLastName().toUpperCase() +
                "<br>PASSENGER AGE : " + passenger.getAge() +
                "<br>You can now begin boarding at " + gate.getGate() +
                "<br>----------------------------------------------------------------------</html>";

    }
}