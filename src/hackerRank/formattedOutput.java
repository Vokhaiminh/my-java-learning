package src.hackerRank;
import java.util.Scanner;

public class formattedOutput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s", s1);
            System.out.printf("%03d%n", x );
        }
        System.out.println("================================");
    }

    public static void Solution(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = 0;
        for(int i = 1; i < 11; i++){
            result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
