package src.practice;

import java.util.Scanner;

public class minutesToYearsAndDays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of minutes you want to convert: ");
        int minutes = scanner.nextInt();

        int toYears = minutes / (60 * 24 * 365);
        int toDays = minutes / (60 * 24) - (toYears * 365);
        System.out.println("Years: " + toYears + ", " + "days: " + toDays);
    }
}
