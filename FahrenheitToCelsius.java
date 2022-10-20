// Java Program to convert the input temperature value in Fahrenheit to Celsius.

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);

        //Read user input in fahrenheit.
        System.out.println("Enter the Celsius value: ");
        double fahrenheitValue = sc.nextDouble();

        //convert fahrenheit to celsius.
        double celsiusValue = (fahrenheitValue - 32) * 5/9;

        System.out.println(String.format("%.2f\u00B0 Fahrenheit is %.2f\u00B0 Celsius.", fahrenheitValue, celsiusValue));
    }
}
