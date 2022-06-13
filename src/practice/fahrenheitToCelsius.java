package src.practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class fahrenheitToCelsius {
    //(50°F - 32) x .5556 = 10°C
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in fahrenheit: ");
        int fahrenheit = scanner.nextInt();

        double celsius = (fahrenheit - 32) * 0.5556;

        System.out.println(celsius);

    }
}
