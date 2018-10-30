public class IncrementElement {


// Create an array variable named `t`
// with the following content: `[1, 2, 3, 4, 5]`
// Increment the third element
// Print the third element

    public static void main(String[] args) {
        int[] s = {1, 2, 3, 4, 5};
        incr(s);
    }

    public static void incr(int[] a) {
        int newVariable = a[2] + 5;
        System.out.println(newVariable);
    }
}
