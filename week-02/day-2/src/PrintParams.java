import java.util.Arrays;

public class PrintParams {

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...

    public static void main(String[] args) {
        printParamss("jaj", "juj", "hinnye");
    }
    public static void printParamss (String... parameters) {

        for (int i = 0; i < parameters.length; i++) {
            System.out.print(parameters[i] + " ");
        }
    }

}
