import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Receive grau in Celsius
        System.out.print("°C: ");
        double celsius = scanner.nextDouble();
        scanner.close();

        // Converter to Fahrenheit
        double fahrenheit = ( celsius * 9/5 ) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
    }
}
