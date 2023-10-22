package assignments;

import java.util.Scanner;

public class patternrevision1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        {
            n = in.nextInt();
        }
//        pattern4(n);
//        char c = 'A';
//        System.out.println((char)(c));

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
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <i+1 ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=n-i+1 ; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//
//        }
//        for (int i =1; i <=n ; i++) {
//            for (int j = 1; j <=n-i+1 ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
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
        System.out.println(skipChar("baccad"," ",'a'));
//        pattern20(n);
    }

    public static void pattern20(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <2*(n-i)+1 ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 2; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=2*i-2 ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static String skipChar(String str,String ans,char ch){
        if (str.isEmpty()){
            return " ";
        }
        if (str.charAt(0)!=ch){
            ans = ans+str.charAt(0);
        }
        String smallAns = skipChar(str.substring(1),ans,ch);
        return ans+smallAns;
    }

    public static void pattern4(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <2*(n-i)+1 ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();


        }


    }
    public static void pattern19(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("*  ");
            }
            for (int j = 1; j <=2*i-2 ; j++) {
                System.out.print("   ");
            }
            for (int j = n; j >i-1 ; j--) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*  ");
            }
            for (int j = 1; j <2*(n-i)+1 ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void pattern18(int n){
        char c=  (char)('A'+n-1);
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(c-(i-j))+" ");
            }
            System.out.println();
        }
    }
    public static void pattern17(int n){
        char c= 'A';
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(c+j-1));
            }
            for (int j = i-1; j >=1 ; j--) {
                System.out.print((char)(c+j-1));
            }
            System.out.println();
        }
    }

}
