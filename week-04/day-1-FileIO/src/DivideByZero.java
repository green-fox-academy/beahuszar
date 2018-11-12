public class DivideByZero {
    // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

    public static void main(String[] args) {
        int myNumber = 0;
        try {
            System.out.println(takeTheNumber(myNumber));
        } catch (Exception e) {
            System.out.println("fail");
        }
    }

    public static int takeTheNumber (int myNumber) {
        int newNumber = myNumber / 10;

        return newNumber;
    }
}
