package assignments;

import java.util.Scanner;

public class patternrevision1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //Diamond
//          *
//        * * *
//          *
//        int n1=(n+1)/2;int n2 = n1-1;
//        for (int i = 1; i <= n1; i++) {
//            for (int j = 1; j <=n1-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <2*i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <=n2 ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=n-2*i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //* * * * *
//         * * * *
//          * * *
//           * *
//            *
//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <i+1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();

        }
        for (int i =1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
//        Parallelogram
//        * * *
//          * * *
//            * * *
//
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i-1 ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=n ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
