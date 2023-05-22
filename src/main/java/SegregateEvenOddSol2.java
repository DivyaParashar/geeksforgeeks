package src.main.java;

public class SegregateEvenOddSol2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 7, 6, 9, 10}; //2,4,6,10,9,7,3,1
        int n = arr.length;
        segregate(arr, n);
    }

    private static void segregate(int[] arr, int n) {
        int finalArray[] = new int[n];
        int start = 0;
        int end = n-1;
        for(int i = 0; i < n ;i ++){
            if(arr[i] % 2 == 0){
                finalArray[start] = arr[i];
                start++;
            } else {
                finalArray[end] = arr[i];
                end--;
            }
        }
        for(int i =0;i < n; i++){
            System.out.println(finalArray[i]);
        }
    }

}
