public class Delta extends Airline {

    public Delta(double totalPass, Gate gate) {
        super("Delta");
        setGate(gate);
        setTotalPassengers(totalPass);
    }

    public String description() {
        String ret = "Delta Airlines is proud to be one of the five " +
                "premier Airlines at Purdue University.\n" +
                "We offer exceptional services, with free limited WiFi for all customers\n" +
                "Passengers who use T-Mobile as a cell phone carrier get additional benefits.\nWe are also happy to offer power outlets in each seat " +
                "for passenger use.\nWe hope you choose to fly Delta as your next Airline";
        return ret;
    }
}
