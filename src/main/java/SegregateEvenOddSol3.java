package src.main.java;

public class SegregateEvenOddSol3 {

    public static void main(String[] args) {
        int[] arr = {1, 9, 4, 10, 7, 5, 3, 2, 6, 7, 11}; //
        int n = arr.length;
        segregateBest(arr, n);
        for (int j : arr) {
            System.out.println(j);
        }
    }

    private static void segregateBest(int[] arr, int n) {
        int temp;
        int end = n-1;
        int start = 0;
        while(start < end){
            if(!isEven(arr[start]) && isEven(arr[end])){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } else if(isEven(arr[start])){
                start++;
            } else if(!isEven(arr[end])){
                end--;
            }
        }

    }
    private static boolean isEven(int k){
        return k%2 ==0;
    }
}
