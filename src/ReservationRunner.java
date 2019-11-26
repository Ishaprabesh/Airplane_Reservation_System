

public class ReservationRunner {
    public static void main(String[] args) {
        ReservationServer server;

        try {
            server = new ReservationServer();
        } catch (Exception e) {
            e.printStackTrace();

            return;
        } //end try catch

        server.serveClients();
    } //main
}
