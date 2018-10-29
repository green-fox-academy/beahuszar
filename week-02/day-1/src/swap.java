public class swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping : a, b = "+a+", "+ + b);

    }
}
