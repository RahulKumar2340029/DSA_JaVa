package RecursionCN;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[]arr = {9,8,10,8,5,8,8,8,9};
//        System.out.println("Sum of array: "+sum(arr,0));
//        System.out.println(isPresent(arr,0,101));
//        System.out.println(returnindex(arr,0,8));
//        allindices(arr,8,arr.length);
//        System.out.println(returnlastindex(arr,8,arr.length-1));
//        System.out.println(returnfirstindex(arr,8,0));
        allindices(arr,8,0);
    }
    public static void allindices(int[] arr,int target,int s){
        if (s==arr.length) return;
        if (arr[s]==target){
            System.out.print(s+" ");
        }
        allindices(arr,target,s+1);

    }
    public static int returnlastindex(int[] arr,int target,int end){
        if (end==0&&arr[end]!=target) return -1;
        if (arr[end]==target) return end;
        return returnlastindex(arr,target,end-1);
    }

//    public static int returnlastindex(int[] arr,int end,int x){
//        if (end==arr[0]) return -1;
//        if (arr[end]==x) return end;
//        return returnlastindex(arr,end-1,x);
//    }
    public static int sum(int[] arr,int start){
        if (start==arr.length-1){
            return arr[start];
        }
        int sums=0;
        int ans = sums+arr[start];
        return ans+sum(arr,start+1);

    }
    public static boolean isPresent(int[] arr,int start,int target){
        if (start==arr.length-1) return false;
        if (arr[start]==target) return true;
        return isPresent(arr,start+1,target);
    }
    public static int returnfirstindex(int[] arr,int target,int start){
        if (start==arr.length-1&&arr[start]!=target) return -1;
        if (arr[start]==target) return start;
        return returnfirstindex(arr,target,start+1);
    }

//    public static int returnindex(int[]arr,int start,int x){
//        if (start==arr.length-1) return -1;
//        if (arr[start]==x) return start;
//        return returnindex(arr,start+1,x);
//    }
}
