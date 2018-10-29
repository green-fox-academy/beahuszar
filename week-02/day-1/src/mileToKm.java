import java.util.Scanner;

public class mileToKm {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner input = new Scanner(System.in);
        System.out.println("Define the distance in km");
        double distance = input.nextDouble();
        double inMiles = distance*0.62137;
        System.out.println("Distance in miles: "+inMiles);


    }
}
