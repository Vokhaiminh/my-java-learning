package src.practice;

import java.util.Scanner;

public class sumOfNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single number from 0 to 1000 yo dumbass:");

        int number = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i < 4; i++){
            int n = number % 10;
            number = number / 10;
            sum += n;

        }
        System.out.println(sum);
    }
}
