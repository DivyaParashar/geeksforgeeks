package src.main.java;

public class SegregateEvenOddSol1 {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
        int n = arr.length;
        segregate(arr, n);
    }

    private static void segregate(int[] arr, int n) {
        int index = 0;
        int ans[] = new int[n];

        for(int i = 0; i < n ;i++){
            if(arr[i] % 2 == 0){
                ans[index] = arr[i];
                index ++;
            }
        }
        for(int i = 0; i <n ;i++){
            if(arr[i] % 2 != 0){
                ans[index] = arr[i];
                index ++;
            }
        }

        for (int i =0; i< n; i++){
            System.out.println("Solution is --> "+ ans[i]);
        }
    }
}
