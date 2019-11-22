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
        return "BOARDING PASS FOR FLIGHT 18000 WITH " + airline.getName().toUpperCase() +
                "\nPASSENGER FIRST NAME : " + passenger.getFirstName().toUpperCase() +
                "\nPASSENGER LAST NAME : " + passenger.getLastName().toUpperCase() +
                "PASSENGER AGE : " + passenger.getAge() +
                "You can now begin boarding at gate " + gate.getGate();

    }
}