public class SumElements {

    // - Create an array variable named `r`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element

    public static void main(String[] args) {
        int[] r = {54, 23, 66, 12};
        sum(r);
    }

    public static void sum (int[] a) {
        System.out.println(a[2] + a[3]);
    }

}
