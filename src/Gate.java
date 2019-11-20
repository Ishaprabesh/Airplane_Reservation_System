import java.io.Serializable;
import java.util.Random;

public class Gate implements Serializable {
    private String terminal;
    private int gateNo;
    private String gate;
    public boolean available; // I don't think we'd define it here

    public Gate () {
        Random random = new Random();

        String [] terminalArray = {"A", "B", "C"};
        int terminalIndex = random.nextInt(3);
        terminal = terminalArray[terminalIndex];

        int [] gateNoArray = new int[18];
        for (int i = 0; i <= 17; i++) {
            gateNoArray[i] = i + 1;
        }
        int gateNoIndex = random.nextInt(18);
        gateNo = gateNoArray[gateNoIndex];

        gate = "Gate " + terminal + gateNo;
    }

    public String getGate() {
        return gate;
    }

}