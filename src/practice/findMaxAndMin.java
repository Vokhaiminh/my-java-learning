package src.practice;

public class findMaxAndMin {
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 2, 7, 6};
        int max = arr[0];
        int min = arr[0];
        for(int i : arr) {
            if (i > max) {
                max = i;
            } else if (min > i) {
                min = i;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
