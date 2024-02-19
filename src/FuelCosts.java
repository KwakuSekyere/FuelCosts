import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons, efficiency, price, costPer100Miles, distance;

        System.out.println("Enter the number of gallons of gas in the tank:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number of gallons:");
            scanner.next(); //
        }
        gallons = scanner.nextDouble();

        System.out.println("Enter the fuel efficiency in miles per gallon:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid fuel efficiency:");
            scanner.next(); //
        }
        efficiency = scanner.nextDouble();

        System.out.println("Enter the price of gas per gallon:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid price per gallon:");
            scanner.next(); //
        }
        price = scanner.nextDouble();

        costPer100Miles = price * 100 / efficiency;
        distance = gallons * efficiency;
        System.out.println("Cost per 100 miles: " + costPer100Miles);
        System.out.println("Distance with the gas in the tank: " + distance + " miles");
    }
}
