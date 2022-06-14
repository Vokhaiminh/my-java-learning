package src.practice;

public class averageOfArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, -2};
        double total = 0;
        double avg = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        avg = total / arr.length;
        System.out.println(total);
        System.out.println(arr.length);
        System.out.println(avg);
    }
}
