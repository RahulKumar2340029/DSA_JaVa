package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println(Arrays.toString(arrange2(arr)));
//        int arr[] = takeinput(5);
//        printarr(arr);
//        System.out.println(search(arr,4));
//        int ans = max(arr);
//        System.out.println(ans);
//        System.out.println(sumArr(arr));
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[]arr = new int[n];
//        for (int i = 0; i <=arr.length-1 ; i++) {
//            arr[i] = in.nextInt();
//        }
        //method 1 to print
//        for (int i = 0; i <=arr.length-1 ; i++) {
//            System.out.print(arr[i]+" ");
//        }
        //method 2 to print
//        System.out.println(Arrays.toString(arr));

    }
    public static int search(int[]arr,int target){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int[] takeinput(int n){
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i <=arr.length-1 ; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }
    public static void printarr(int arr[]){
        for (int i = 0; i <=arr.length-1 ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int max(int arr[]){
        int maximum = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (maximum<arr[i]){
                maximum = arr[i];
            }
        }
        return maximum;
    }
    public static int sumArr(int arr[]){
        int sum=0;
        for (int i = 0; i <=arr.length-1 ; i++) {
            sum = sum+i;
        }
        return sum;
    }
    public static int[] arrange(int arr[]){
        int i=0;int j =arr.length-1;
        int number=1;
        while (i<j){
            arr[i] = number;
            number++;
            i++;
            arr[j] = number;
            number++;
            j--;
        }
        return arr;
    }
    //Aman method [1 3 5 4 2]
    public static int[] arrange2(int arr[]){
        int size= arr.length;
        if (size%2!=0){//odd
            for (int i = 0; i <=size/2 ; i++) {
                arr[i] = 2*i+1;
            }
            for (int i = arr.length-1;i>=size/2+1;i--) {
                arr[i] = 2*(size-i);
            }
        }else{
            for (int i = 0; i <=(size/2)-1 ; i++) {
                arr[i] = 2*i+1;
            }
            for (int i = arr.length-1; i >=(size/2) ; i--) {
                arr[i] = 2*(size-i);
            }
        }
        return arr;
    }
}
