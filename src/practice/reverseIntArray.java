package src.practice;

import java.util.Arrays;

public class reverseIntArray {
    public static void  main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] newArr = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            newArr[arr.length - i - 1] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
