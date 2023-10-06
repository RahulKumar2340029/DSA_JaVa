package assignments;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();

//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <n-i+1 ; j++) {
//                System.out.print(" ");
//            }
//            int counter=1;
//            for (int j = n-i+1; j <=n ; j++) {
//                System.out.print(counter);
//                counter++;
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <=n ; i++) {
//            for (int j = n-i+1; j >=1 ; j--) {
//                System.out.print(n-i+1);
//            }
//            System.out.println();
//        }
//        int i=1;
//        while (i<=n){
//            int j=n-i+1;
//            while (j>=1){
//                System.out.print(n-i+1);
//                j--;
//            }
//            System.out.println();
//            i++;
//        }
//        for (int i = 1; i <=n ; i++) {
//                for (int j = 1; j <=n-i ; j++) {
//                    System.out.print(" ");
//                }
//                for (int j = 1; j <=i ; j++) {
//                    System.out.print(j);
//                }
//                for (int j = i-1; j >=1 ; j--) {
//                    System.out.print(j);
//                }
//                System.out.println();
//        }
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=2*(n-i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j <=2*i-1 ; j++) {
//                System.out.print(j);
//            }
//            for (int j = 2*i-2; j >=i ; j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        int firsthalf = (n+1)/2;
        int sechalf = firsthalf-1;
        if (n%2!=0) {
            for (int i = 1; i <= firsthalf; i++) {
                for (int j = 1; j <= firsthalf - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
//                for (int j = 2 * n - i - 1; j >= 1; j--) {
//                    System.out.print("*");
//                }
                System.out.println();
            }
                for (int i = 1; i <=sechalf ; i++) {
                    for (int j = 1; j <=i ; j++) {
                        System.out.print("s");
                    }

                    System.out.println();
                }

        }else{
            System.out.println("\nEven value of n not allowed");
        }


    }
}
