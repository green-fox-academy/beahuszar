public class JosephusProblem {

    public static void main(String[] args) {
        int participants = 5643;
        System.out.println(getSafePosition(participants));
    }

    public static int getSafePosition(int n) {

        int valueOfL = n - Integer.highestOneBit(n);
        int safePosition = 2 * valueOfL  + 1;

        return safePosition;
    }
}
