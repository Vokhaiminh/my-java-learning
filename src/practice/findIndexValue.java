package src.practice;

public class findIndexValue {
    public static int findIndex(int[] arr, int num){
        int index;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == num) {
                index = i;
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] myArr = {1, 2, 3, 25};
        System.out.println(findIndex(myArr, 25));
    }
}
