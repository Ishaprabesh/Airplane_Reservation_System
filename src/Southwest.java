public class Southwest extends Airline {
    public Southwest(double totalPass, Gate gate) {
        super("Southwest");
        setGate(gate);
        setTotalPassengers(totalPass);
    }

    public String description() {
        String ret = "Southwest Airlines is proud to offer flights to Purdue University.\n" +
                "We are happy to offer free WiFi, as well as our amazing snacks.\n" +
                "In addition, we offer flights for much cheaper than other airlines, and offer two free checked bags.\n" +
                "\nWe hope you choose Southwest for your next flight";
        return ret;
    }
}
