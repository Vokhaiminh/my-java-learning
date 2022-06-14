package src.practice;

import java.util.Arrays;

public class duplicateStringArray {
    public static void main(String[] args){
        String[] arr = {"abc", "cab", "cab", "bca", "acb", "abc", "cba", "abc"};
        Arrays.sort(arr);
        int[] dup;
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i].equals(arr[i+1])){
                System.out.println(arr[i+1]);
            }
        }
    }
}
