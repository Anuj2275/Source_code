// import java.util.Scanner;

// import java.util.*;
class FirstClass {
    public static void main(String args[]) {
        // ----------------------------------
        // Lect-1
        // print will simply print the content but the println will print but add new
        // line automatically
        // System.out.println("Arigatou");
        // System.out.print( "YOyo\n");

        /*---------------LECT-2------------- */

        // String name="YO yo boi";
        // int x= 22;
        // System.out.println(x);
        // System.out.println(name);
        // variables, +,-,*,/,()
        // inputs
        // Scanner s = new Scanner(System.in);
        // String n = s.next(); // takes only single word

        // String n = s.nextLine(); // takes full string
        // System.out.println(n);
        // nextInt for taking integers from user
        // nextFloat for taking floats from user
        // nextDouble, ...
        // int n1 = s.nextInt();
        // int n2 = s.nextInt();
        // int sum = n1 + n2;
        // System.out.println(sum);

        // --------------LECT-3--------------
        // conditional statements
        // but actually for importing this scanner this importation is used called-
        // import java.util.*
        // Scanner sc= new Scanner(System.in);
        // int age= sc.nextInt();
        // if(age>18){
        // System.out.println("Adult");
        // }
        // else if(age==18){
        // System.out.println("A year left");
        // }
        // else{
        // System.out.println("Not Adult");
        // }
        // switch(age){
        // case 10: System.out.println("You are only 10"); break;
        // case 15: System.out.println("Still not "); break;
        // case 19: System.out.println("Ye bat!"); break;
        // default: System.out.println("Ye kya kr ra"); break;
        // }

        // -----------------------------LECT-4------------------------------------
        // Date 29/11/2024
        // LOOPS

        // for, while, do-while
        // for (int i = 1; i < 11; i++) {
        // // System.out.print(i +" Acha ");
        // System.out.print(i +" ");
        // }

        // int c=10;
        // while(c!=0){
        // System.out.print(c+" ");
        // c--;
        // }

        // and do while
        // do {
        // System.out.println(c);
        // c--;
        // } while (c!=0);

        // ----------------------------LECT-5------------------------------
        // Patterns
        // solid rectangle

        // for(int i = 1 ; i<=5 ; i++){
        // for(int j= 1; j<=5;j++){
        // System.out.print("* ");
        // }
        // System.err.println();
        // }

        // hollow rectangle
        // int n=4;
        // int m =5;
        // for (int i = 1; i <=n; i++) {
        // for (int j = 1; j <=m; j++) {
        // if(i==1 || i==n || j==1 || j==m){
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // half pyramid
        // for (int i = 1; i <=n; i++) {
        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // inverted half pyramid
        // for (int i = 1; i <=n; i++) {
        // for (int j = n; j>=i; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 180deg half pyramid
        // for (int i = 1; i <=n; i++) {
        // for (int j = 1; j<=n-i; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }
        // number half pyramid
        // for(int i = 1 ; i <=n;i++){
        // for(int j = 1 ; j<=i;j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // -------------------------------------
        // inverted number half pyramid
        // Date 1 Dec 2024
        // for(int i = 1 ; i <=m;i++){
        // for(int j = 1 ; j<=m-i+1;j++){
        // System.out.print(j);
        // }

        // System.out.println();
        // }

        // Floyd's triangle
        // int nn=1;
        // for(int i = 1 ; i <=m;i++){
        // for(int j = 1 ; j<=i;j++){
        // System.out.print(nn+" ");
        // nn++;
        // }

        // System.out.println();
        // }

        // using indexs sum if even 1 and odd 0
        // 0-1 triangle starting with 1
        // for(int i = 1 ; i <=m;i++){
        // for(int j =1 ; j<=i;j++){
        // if((i+j)%2==0){
        // System.out.print(1+" ");
        // }
        // else{
        // System.out.print(0+" ");
        // }
        // }
        // System.out.println();
        // }

        // lect-6
        // Butterfly pattern/ i just read the concept or the DRY run

        // upper portion
        // for (int i = 1; i <=n; i++) {
        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }
        // int spaces=2*(n-i);
        // for (int j = 1; j <=spaces; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // for lower portion just start the loop from n to 1
        // for (int i = n; i >=1; i--) {
        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }
        // int spaces=2*(n-i);
        // for (int j = 1; j <=spaces; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }



        // /date 6 dec
        // solid rhombus along with the hollow rhombus
        // int m=5;
        // for (int i = 1; i <=m; i++) {
        // for (int j = 1; j <=m-i; j++) {
        // System.out.print(" ");

        // }
        // for (int j = 1; j <=m; j++) {
        // if(i==1 || i==m || j==1 || j==m)
        // System.out.print("*");
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // NUMBER PYRAMID
        // int m=5;
        // for (int i = 1; i <=m; i++) {
        // for (int j = 1; j <=m-i; j++) {
        // System.out.print(" ");

        // }
        // for (int j = 1; j <=i; j++) {
        // System.out.print(i+" ");
        // }
        // System.out.println();
        // }

        // PALINDROMIC PATTERN
        // int m=5;
        // for (int i = 1; i <=m; i++) {
        // for (int j = 1; j <=m-i; j++) {
        // System.out.print(" ");

        // }
        // for (int j = i; j >=1; j--) {
        // System.out.print(j);
        // }
        // for (int j = 1; j<=i; j++) {
        // System.out.print(j);
        // }

        // System.out.println();
        // }

        // DIAMOND PATTERN
        // int m = 5;
        // for (int i = 1; i <= m; i++) {
        //     for (int j = 1; j <= m - i; j++) {
        //         System.out.print(" ");

        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int i = m; i>= 1; i--) {
        //     for (int j = 1; j <= m - i; j++) {
        //         System.out.print(" ");

        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

    }
}

/*
 * 
 * class first{
 * public static void main(String args[]){
 * system.out.println or print
 * scanner sc= new Scanner(system.in)
 * int x= sc.nextInt();
 * string s= sc.next() for single word and nextLine()
 * nextFloat nextDouble ...
 * }
 * }
 * 
 */

/*
 * class f{
 * public static void main( String args[]){\
 * }
 * }
 * 
 */