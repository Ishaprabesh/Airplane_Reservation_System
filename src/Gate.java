import java.io.Serializable;
import java.util.Random;

public class Gate implements Serializable {
    public boolean available; // I don't think we'd define it here
    private String terminal;
    private int gateNo;
    private String gate;

    public Gate() {
        Random random = new Random();

        String[] terminalArray = {"A", "B", "C"};
        int terminalIndex = random.nextInt(3);
        terminal = terminalArray[terminalIndex];

        int[] gateNoArray = new int[18];
        for (int i = 0; i <= 17; i++) {
            gateNoArray[i] = i + 1;
        }
        int gateNoIndex = random.nextInt(18);
        gateNo = gateNoArray[gateNoIndex];

        gate = "<html><b>Gate " + terminal + gateNo + "</b></html>";
    }

    public String getGate() {
        return gate;
    }

}