public class Factorio {
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial


    public static void main(String args[]){
        int fact;
        int number = 3; //It is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }

    public static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
}

