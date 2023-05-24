package src.main.java;

public class RotateByd {
    public static void main(String[] args) {
   int[] arr = {1, 2, 3, 4, 5, 6, 7};
   int d = 5;
      rotate(arr,d,arr.length);
      rintArray(arr);
    }

    private static void rintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void rotate(int[] arr, int d, int length) {

     d = d%length;
     reverseArray(arr, 0, d-1);
        reverseArray(arr, d, length-1);
        reverseArray(arr, 0, length-1);

    }

    private static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
