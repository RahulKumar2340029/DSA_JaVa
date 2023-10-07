package Arrays;


import java.util.Arrays;

public class Assignments {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};

        int[]arr2 = {2,4,5,8,9,7,6};
//        int[] ans = swapAlt(arr);
//        System.out.println(Arrays.toString(ans));
//        System.out.println(duplicate(arr));
//        intersection(arr,arr2);
//        System.out.println(triplesum(arr,12));
//        System.out.println(sumright(arr,3));
//        unique(arr);
        intersection(arr,arr2);
//        System.out.println(Arrays.toString(arr2));
//        System.out.println("Equilibrium index: "+atEquilibrium(arr2));
    }

    public static void intersection(int[] arr, int[] arr2) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if (arr[i]==arr2[j]){
                    System.out.print(arr[i]+" ");
                    arr2[j] = Integer.MIN_VALUE;
                }
            }
        }
    }

    //    public static void unique(int[] arr){
//        int count=0;
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <arr.length ; j++) {
//                if (arr[i]==arr[j]){
//                    count++;
//                }
//                if (count==1){
//                    System.out.println(arr[i]);
//                }
//            }
//        }
//    }
    public static int atEquilibrium(int[] arr){
        for (int i = 1; i <arr.length-1 ; i++) {
            if (sumleft(arr,i)==sumright(arr,i)){
                return i;

            }
        }
        return -1;

    }
    public static int sumleft(int[]arr,int i){
        int sum=0;
        if (i>arr.length-2){
            return -1;
        }
        for (int j = 0; j <=i-1; j++) {
            sum+=arr[j];
        }
        return sum;
    }
    public static int sumright(int[]arr,int i){
        int sum=0;
        if (i>arr.length-2){
            return -1;
        }
        for (int j = i+1; j <arr.length; j++) {
            sum+=arr[j];
        }
        return sum;
    }





    public static int pairsum(int[] arr,int n){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]+arr[j]==n){
                    count++;
                    System.out.print(arr[i]+" "+arr[j]+" ; ");

                }
            }
        }
        System.out.print("\nTotal: ");
        return count;
    }
    public static int triplesum(int[] arr,int n){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                for (int k = j+1; k <arr.length ; k++) {
                    if (arr[i]+arr[j]+arr[k]==n){
                        count++;
                        System.out.print(arr[i]+" "+arr[j]+" "+arr[k]+" ; ");
                    }
                }
            }
        }
        System.out.print("\nTotal: ");
        return count;
    }
    public static int duplicate(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j <arr.length ; j++) {
                if (i!=j&&arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static int[] swapAlt(int[] arr){
        for (int i = 0; i <arr.length-1 ; i+=2) {
            int c =arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = c;
        }
        return arr;
    }

//    public static void swapAlt(int arr[]){
//        int i=0;
//        while (i<arr.length-1){
//            int t = arr[i];
//            arr[i] =  arr[i+1];
//            arr[i+1] = t;
//            i+=2;
//        }
//    }
}
