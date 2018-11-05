public class ChangeElement {

    // - Create an array variable named `s`
//   with the following content: `[1, 2, 3, 8, 5, 6]`
// - Change the 8 to 4
// - Print the fourth element

    public static void main(String[] args) {
        int[] s = {1, 2, 3, 8, 5, 6};
        change(s);
    }

    public static void change(int[] a) {
        a[4] = 8;
        System.out.println(a[4]);

    }



}
