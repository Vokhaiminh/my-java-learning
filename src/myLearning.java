package src;

import javax.swing.plaf.synth.SynthSpinnerUI;
import java.util.Scanner;


public class myLearning {

    public static void main(String[] args){
//     double myFloat = 122.123
//     System.out.println(myFloat);
//        boolean myLoop = 1 > 2;
//        System.out.println(myLoop);
//
//        while(myLoop){
//            System.out.println("Hello World");
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter something dumbass:");
//        String str = input.nextLine();
//        System.out.println("You really wrote this? -> " + str);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter some numbers dumbass:");
//        int n = scanner.nextInt();
//        while(n != 5){
//            System.out.println("That is not the correct number dumbass:");
//            n = scanner.nextInt();
//        }
//        System.out.println("That is the correct number");

//        Scanner scanner = new Scanner(System.in);
//        int n = 0;
//        do {
//            System.out.println("Enter some numbers dumbass:");
//            n = scanner.nextInt();
//        } while (n != 5);
//        System.out.println("That is the correct number");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a command:");
//        String str = scanner.nextLine();
//        switch (str){
//            case "start":
//                System.out.println("Machine started!");
//                break;
//            case "stop":
//                System.out.println("Machine stopped");
//                break;
//            default:
//                System.out.println("Wtf wrong command");
//        }
        

//        int n;
//        System.out.println("Enter a number:");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//
//        for(int i = 1; i <= 10; i++){
//            n = a * i;
//            System.out.println("%2d ");
//        }


        // String[] strings = new String[3];
        // strings[0] = "Dit";
        // strings[1] = "me";
        // strings[2] = "may";
        // System.out.println(strings[1]);
        // String[] newString = {"Dot", "me", "m"};
        // System.out.println(newString[1]);

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){ 
                System.out.println(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // System.out.println(arr[1][1]);

    }
}





