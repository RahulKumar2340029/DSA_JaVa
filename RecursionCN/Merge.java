package RecursionCN;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[] c = new int[6];
//        System.out.println(Arrays.toString(merge(a,b,c)));

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] arr3 = new int[8];
        merge2(arr1,arr2,arr3);
        System.out.println(Arrays.toString(arr3));
    }
//    public static void mergesort(int[]arr,int start,int end){
//        if (start<=end) return;
//        int mid = (start+end)/2;
//        mergesort(arr,start,mid);
//        mergesort(arr,mid+1,end);
//        merge()
//    }
    public static int[] merge(int[] arr1,int[] arr2,int[] output){
        for (int i = 0; i < arr1.length; i++) {
            output[i] = arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            output[arr1.length+i]=arr2[i];
        }
        return output;
    }
    public static void merge2(int[] arr1,int[] arr2,int[] arr3){
        int i=0,j=0,k=0;
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                k++;
                i++;
            }else{
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i<arr1.length){
            arr3[k]=arr1[i];
            k++;
            i++;
        }
        while (j<arr2.length){
            arr3[k] = arr2[j];
            k++;
            j++;
        }
    }
}
