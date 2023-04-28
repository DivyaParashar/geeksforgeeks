package src.main.java;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr ={1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        moveAllZeros(n, arr);
        for(int i =0; i<n;i++)
            System.out.println(arr[i] +" ");
    }

    private static void moveAllZeros(int n, int[] arr) {
        if(n == 0){
            System.out.println("Invalid input");
            return;
        }
        int count = 0;
        for(int i =0;i<n;i++){
            if(arr[i] != 0){
                arr[count++] = arr[i]; //a[1] = a[0]
                System.out.println(arr[i] +" count is "+ count);
            }
        }
        while (count < n) {
            arr[count++] = 0;
       // System.out.println(arr[count] + " Count is"+ count);
        }
    }
}
