package src.practice;


import java.util.Scanner;

public class inchToMeter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your inches lol: ");
        int inches = scanner.nextInt();
        double meters = inches * 0.0254;

        System.out.println(meters);
    }
}
