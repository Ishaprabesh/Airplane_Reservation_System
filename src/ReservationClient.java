import java.io.*;
import java.net.Socket;

public class ReservationClient {
    private static boolean isParsable(String string) {
        return string.chars()
                .mapToObj(Character::isDigit)
                .reduce(Boolean::logicalAnd)
                .orElse(Boolean.FALSE);
    }
    public static void main(String[] args) {
        BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
        String hostname;
        String portString;
        int port;
        Socket socket;
        BufferedWriter socketWriter = null;
        BufferedReader socketReader = null;
        String request;
        String response;

        try {
            System.out.print("Enter the sever's hostname: ");

            hostname = userInputReader.readLine();

            if (hostname == null) {
                System.out.println();

                System.out.println("Goodbye!");
            } else {
                System.out.print("Enter the sever's port: ");

                portString = userInputReader.readLine();

                if (portString == null) {
                    System.out.println();

                    System.out.println("Goodbye!");
                } else if (!isParsable(portString)) {
                    System.out.println();

                    System.out.println("The specified port must be a non-negative integer! Goodbye!");
                } else {
                    port = Integer.parseInt(portString);

                    socket = new Socket(hostname, port);

                    socketWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

                    socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                    System.out.println();

                    System.out.print("Enter your request: ");

                    request = userInputReader.readLine();

                    while (request != null) {
                        socketWriter.write(request);

                        socketWriter.newLine();

                        socketWriter.flush();

                        response = socketReader.readLine();

                        System.out.println();

                        System.out.printf("Response from server: %s%n", response);

                        System.out.println();

                        System.out.print("Enter your request: ");

                        request = userInputReader.readLine();
                    } //end while

                    System.out.println();

                    System.out.println("Goodbye!");
                } //end if
            } //end if
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                userInputReader.close();

                if (socketWriter != null) {
                    socketWriter.close();
                } //end if

                if (socketReader != null) {
                    socketReader.close();
                } //end if
            } catch (IOException e) {
                e.printStackTrace();
            } //end try catch
        } //end try catch finally
    } //main
}
