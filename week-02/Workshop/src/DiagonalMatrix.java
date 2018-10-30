public class DiagonalMatrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    public static void main(String[] args) {
        int[][] multiDArray = new int[3][3];

        for (int i = 0; i < multiDArray.length; i++) {
            for (int j = 0; j < multiDArray.length; j++) {
                if (i == j) {
                    System.out.print(1);
                }
            }
        }
    }
}