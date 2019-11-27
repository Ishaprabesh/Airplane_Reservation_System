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

    public void setName(String name) {
        this.name = name;
    }

    public double getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(double fl) {
        this.flightNo = fl;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public double getTotalPassengers() {
        return this.totalPassengers;
    }

    public void setTotalPassengers(double tots) {
        totalPassengers = tots;
    }
}
