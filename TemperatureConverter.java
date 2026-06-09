import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temperature;
        double celsius, fahrenheit, kelvin;
        char unit;

        System.out.println("=================================");
        System.out.println("   TEMPERATURE CONVERTER SYSTEM");
        System.out.println("=================================");

        System.out.print("Enter Temperature Value: ");
        temperature = sc.nextDouble();

        System.out.print("Enter Unit (C/F/K): ");
        unit = Character.toUpperCase(sc.next().charAt(0));

        switch (unit) {

            case 'C':
                celsius = temperature;
                fahrenheit = (celsius * 9 / 5) + 32;
                kelvin = celsius + 273.15;

                System.out.println("\nConverted Temperatures:");
                System.out.printf("Fahrenheit : %.2f °F\n", fahrenheit);
                System.out.printf("Kelvin     : %.2f K\n", kelvin);
                break;

            case 'F':
                fahrenheit = temperature;
                celsius = (fahrenheit - 32) * 5 / 9;
                kelvin = celsius + 273.15;

                System.out.println("\nConverted Temperatures:");
                System.out.printf("Celsius    : %.2f °C\n", celsius);
                System.out.printf("Kelvin     : %.2f K\n", kelvin);
                break;

            case 'K':
                kelvin = temperature;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 9 / 5) + 32;

                System.out.println("\nConverted Temperatures:");
                System.out.printf("Celsius    : %.2f °C\n", celsius);
                System.out.printf("Fahrenheit : %.2f °F\n", fahrenheit);
                break;

            default:
                System.out.println("Invalid Unit! Please enter C, F, or K.");
        }

        sc.close();
    }
}