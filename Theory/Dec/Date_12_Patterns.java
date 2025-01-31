// import java.util.*;
// import Scanner

public class Date_12_Patterns {
    public static void main(String[] args) {

        System.out.println();

        // int n = 3;
        // // n=4;
        // try another way
        // for (int i = 1; i <= n; i++) {
        // for (int j = i; j <= n; j++) {
        // if ((i + j) % 2 == 0) {
        // // System.out.println("first");
        // System.out.println("..\n..");

        // } else {
        // // System.out.println("sec");
        // System.out.println("##\n##");

        // }
        // // System.out.println();
        // // System.out.println();
        // }
        // }

        // --------------WRONG----------------------
        // for (int i = 1; i <=n-1; i++) {
        // // n*=2;
        // // int x=
        // for (int j = 1; j <=((2*n)/2)-1; j++) {
        // System.out.print(". ");
        // }
        // for (int j = 1; j <=((2*n)/2)-1; j++) {
        // System.out.print("# ");
        // }
        // for (int j = 1; j <=(n)-1; j++) {
        // System.out.print(". ");
        // }

        // System.out.println();
        // }
        // for (int i = 1; i <=n-1; i++) {
        // // n*=2;
        // // int x=
        // for (int j = 1; j <=((2*n)/2)-1; j++) {
        // System.out.print("# ");
        // }
        // for (int j = 1; j <=((2*n)/2)-1; j++) {
        // System.out.print(". ");
        // }
        // for (int j = 1; j <=(n)-1; j++) {
        // System.out.print("# ");
        // }

        // System.out.println();
        // }
        // for (int i = 1; i <=n-1; i++) {
        // // n*=2;
        // // int x=
        // for (int j = 1; j <=((2*n)/2)-1; j++) {
        // System.out.print(". ");
        // }
        // for (int j = 1; j <=((2*n)/2)-1; j++) {
        // System.out.print("# ");
        // }
        // for (int j = 1; j <=(n)-1; j++) {
        // System.out.print(". ");
        // }

        // System.out.println();
        // }

        /*
         * . . # # . . # # . .
         * . . # # . . # # . .
         * # # . . # #. . # #
         * # # . . # #. . # #
         * . . # # . . # # . .
         * . . # # . . # # . .
         */

        // for (int i = 1; i <=n; i++) {
        // n*=2;
        // int x=

        // for (int j = 1; j <=((2*n)/2); j++) {
        // System.out.print(".");
        // }

        // System.out.println();
        // }
        // for (int i = 1; i <=n; i++) {
        // // n*=2;
        // // int x=
        // for (int j = 1; j <=((2*n)/2); j++) {
        // System.out.print("#");
        // }
        // for (int j = 1; j <=((2*n)/2); j++) {
        // System.out.print(".");
        // }
        // System.out.println();
        // }

        // butterfly
        // for (int i = 1; i <=n; i++) {
        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }
        // for (int j = i+1; j <=n-i+n; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = n-1; i>=1; i--) {
        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }
        // for (int j = i+1; j <=n-i+n; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // ------------------------------------------------
        // ------------------------------------------------
        // for (int i = n; i >=1; i--) {
        // for (int j = 1; j <=n-i+1; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <=i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <=n; i++) {
        // for (int j = 1; j <=n-i+1; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <=i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // ------------------------------------------------

    }
}
