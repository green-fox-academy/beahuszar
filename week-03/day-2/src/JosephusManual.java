import java.util.Arrays;

public class JosephusManual {
    public static void main(String[] args) {
        int nOfParts = 5643;
        System.out.println("The safe position is: " + getTheSafePosition(nOfParts));
    }

    public static int getTheSafePosition (int nOfParts) {
        int maxPower = 1;
        for (int i = 0; i < nOfParts ; i++) {
            maxPower *= 2;
            if (nOfParts - maxPower * 2 < 0) {
                break;
            }
        }

        int l = nOfParts - maxPower;
        int safeSpot = (l * 2) + 1;

        return safeSpot;
    }
}
