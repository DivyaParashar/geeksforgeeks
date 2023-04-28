package src.main.java;

public class LargestThree {

    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90};
        printLargestThree(arr);
    }

    private static void printLargestThree(int[] arr) {
        int i, first, second, third;
        if(arr.length <3 ){
            System.out.println("Invalid input");
        }
        first=second=third = Integer.MIN_VALUE;
        for(i=0;i<arr.length;i++){
            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second ) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];

            }
        }
        System.out.println("Parameters are "+ first +"\n"+ second +"\n"+ third);
    }
}
