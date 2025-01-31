// FUNCTIONS AND METHODS
// 6 dec   but didn't do
// 7 dec
//9- dec dammm

// and lect 8 was a practice where we have to make some function i tried the fibonaci series only and their is *******8another gcd which i didn't tried

import java.util.Scanner;

public class Lect_7 {
    public static void printName(String name){
        System.out.println("Ok your name is "+name);
    }

    public static int summy(int a, int b){  // here these are the formal parameters or the parameters
        int sum = a+b;
        return sum;
    }

    public static int fact(int num){
    if(num== 0) return 1;
        return num*fact(num-1);
    }

    // fibonacci series
    public static void fibo(int n){
        int a =0 , b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");

        for (int i = 2; i <=n; i++) {
            //my approach
            // a= a+b;
            // System.out.print(a+" ");
            // b=b+a;
            // System.out.print(b+" ");

            int nxt= a+b;
            System.out.print(nxt+" ");
            a=b;
            b=nxt;
        }
        return;
    }
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        // String name = ss.nextLine();
        // printName(name);
        // System.out.print("Enter two numbers with a space: ");
        int a = ss.nextInt();
        // int b = ss.nextInt();
        // System.out.println(summy(a, b));  // here these a and b are the arguments or the actual parameters
        // System.out.println(fact(a));
        fibo(a);

    }
}
