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
        int[][] multiDArray = new int[4][4];

        for (int i = 0; i < multiDArray.length; i++) {
            for (int j = 0; j <= multiDArray.length; j++) {
                if (j == i) {
                    System.out.print("1 ");
                }
                else if (j != i && j == multiDArray.length) {
                        System.out.println("");
                    }
                else if (j != i) {
                    System.out.print("0 ");;
                }
            }
        }
    }
}
