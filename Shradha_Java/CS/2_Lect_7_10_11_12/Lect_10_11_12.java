// time and space complexity in lect9 done on notebook 

// ARRAYS 
import java.util.*;
// import java.util.Scanner;

public class Lect_10_11_12 {
    public static void main(String[] args) {

        // int a[]={1,22,12};
        // // like a dynamic
        // int[] arr= new int[3];
        // arr[0]=11;
        // arr[1]=32;
        // arr[2]=53;
        // for (int i = 0; i < a.length; i++) {
        // System.out.print(a[i]+" ");
        // }

        // var take spave where their is null value 0 for int 0.0 float and false
        // boolean

        // print index for the number n;
        Scanner sc = new Scanner(System.in);
        // int sz = sc.nextInt();
        // int[] arr = new int[sz];

        // for (int i = 0; i < sz; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // int x= sc.nextInt();
        // for (int j = 0; j < arr.length; j++) {
        //     if(arr[j]==x){
        //         System.out.println("The number x is at index "+j);
        //     }
        // }


        // 2d array
        int[][] arr= new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]==x)
                System.out.print("Number at x index is ["+i+"]["+j+"] ");
            }
            System.out.println();
        }

        //strings 
        //charAt method
        // compareTo method where we compare two strings and this happens when:
        /*
         st1>st2  give +ive value
         st1==st2  give 0
         st1<st2  give -ive value

         -----------------------------
         SUBSTRING METHOD
         substring(begining index(position included), ending index(position excluded)) takes postions and extract the word that you want to in a given string ,**** the endig index is exclusive

         if i want to go to the last index you just write like this eg heloothier ,, printin the their
         substring(5)

         STRINGS ARE IMMUTABLE

         -----------------------------------
         */

        

    }
}
