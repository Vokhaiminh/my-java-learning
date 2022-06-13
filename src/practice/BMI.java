package src.practice;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        int weight = scanner.nextInt();
        System.out.println("Enter your height in inches: ");
        int height = scanner.nextInt();

        double BMI = (weight * 703) / (height *  height);
        System.out.println(BMI);
    }
}
