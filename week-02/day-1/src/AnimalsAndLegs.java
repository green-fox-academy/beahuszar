import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner input = new Scanner(System.in);
        System.out.println("How many chickens does the farm have?");
        int chickenLeg = input.nextInt()*2;
        System.out.println("How many pigs does the farm have?");
        int pigLeg = input.nextInt()*4;
        int allLegs = chickenLeg+pigLeg;
        System.out.println("The farm has "+ allLegs +" legs");



    }
}
