import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ReservationServer {
    private ServerSocket serverSocket;
   public ReservationServer() throws NullPointerException, IOException{
       this.serverSocket = new ServerSocket(0);
   }



    public void serveClients() {
        Socket clientSocket;
        Thread handlerThread;
        int clientCount = 0;

        System.out.printf("<Now serving clients on port %d...>%n", this.serverSocket.getLocalPort());

        while (true) {
            try {
                clientSocket = this.serverSocket.accept();
            } catch (IOException e) {
                e.printStackTrace();

                return;
            } //end try catch

            handlerThread = new Thread(new ReservationRequestHandler( clientSocket));

            handlerThread.start();

            System.out.printf("<Client %d connected...>%n", clientCount);

            clientCount++;
        } //end while
    }
}
