package src.practice;

import java.util.Scanner;

public class currentTimeInGMT {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much of offset do you want to set?");
        int GMTOffset = scanner.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        System.out.println(totalMilliseconds);
        long totalSecound = totalMilliseconds / 1000;
        long currentSecond = totalSecound % 60;
        long totalMinute = totalSecound / 60;
        long currentMinute = totalMinute % 60;
        long totalHours = totalMinute / 60;
        long currentHour = ((totalHours + GMTOffset) % 24);

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);

    }
}
