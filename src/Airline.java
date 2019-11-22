import java.io.Serializable;
import java.util.ArrayList;

public abstract class Airline implements Serializable {
    String name;
    ArrayList<Passenger> passengers;
    private double flightNo;
    private double totalPassengers;
    //is it 100?
    private Gate gate;

    public Airline(String name) {
        this.name = name;
        flightNo = 18000;
        passengers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getFlightNo() {
        return flightNo;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public void setTotalPassengers(double tots) {
        totalPassengers = tots;
    }
}
