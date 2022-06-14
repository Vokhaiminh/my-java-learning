package src.practice;

public class findValueInArray {

    public static boolean contain(int[] arr, int num) {
        for(int i : arr){
         if(i == num){
             return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] myArr = {1, 2, 3};
        System.out.println(contain(myArr, 1));
        System.out.println(contain(myArr, 4));
    }
}
