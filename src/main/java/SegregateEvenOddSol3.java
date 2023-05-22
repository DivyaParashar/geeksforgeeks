package src.main.java;

public class SegregateEvenOddSol3 {

    public static void main(String[] args) {
        int[] arr = {1, 9, 5, 3, 2, 6, 7, 11};
        int n = arr.length;
        segregateBest(arr, n);
    }

    private static void segregateBest(int[] arr, int n) {
        int[] finalArray = new int[n];
        int temp;
        int end = n-1;
        int start = 0;

        for(int i=0; i< n; i++){
            if(arr[i] %2 == 0 ){
                finalArray[start] = arr[i];
                start++;
            } else {
                //need to swap both the value, arr[i] value in final[i] and final[i] in arr[i]

                temp =arr[i];
                arr[i] = finalArray[end];
                finalArray[end] = temp;
                end --;
            }
        }
        for(int i = 0; i< n; i++)
        System.out.println(finalArray[i]);
    }
}
