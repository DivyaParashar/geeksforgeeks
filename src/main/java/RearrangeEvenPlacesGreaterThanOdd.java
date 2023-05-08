package src.main.java;

public class RearrangeEvenPlacesGreaterThanOdd {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 2, 5 };
        int n = arr.length;
        rearrange(arr, n);
    }

    private static void rearrange(int[] arr, int n) {
        if(n<2){
            System.out.println("Invalid array");
            return;
        }
        for (int i = 1; i < n; i++) {

            // if index is even
            if (i % 2 == 0) {
                if (arr[i] > arr[i - 1]) {

                    // swap two elements
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }

            // if index is odd
            else {
                if (arr[i] < arr[i - 1]) {

                    // swap two elements
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
        for(int i =0; i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
