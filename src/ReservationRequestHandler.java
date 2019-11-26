import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;

public final class ReservationRequestHandler implements Runnable{
    private Socket clientSocket;
    public ReservationRequestHandler(Socket clientSocket) throws NullPointerException {
        Objects.requireNonNull(clientSocket, "the specified client socket is null");
        this.clientSocket = clientSocket;

    }
    @Override
    public void run() {
        try{

            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Open BufferedWriter to send responses to the client.
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            String message ;

            writer.flush();  // ensure data is sent to the client

            // Read client message.
            ;
           /* if(message!=null){
                break;
            }*/
            while((message = reader.readLine()) != null) {
                System.out.printf("received from client:\n%s\n", message);
                //String response = "";




                // Send response to the client.
                writer.write(message);
                writer.newLine();
                writer.flush();
            }

        }catch(IOException e){}

    }
}
