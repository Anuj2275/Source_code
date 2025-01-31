// package CS;
//functions, functions overloading, some methods
// prime or not , all prime number to n 
// binary to decimal and vice-versa


//advance patterns-part-2

public class Dec_11 {

    public static boolean isPrime(int x) {
        if (x == 2)
            return true;
        // boolean isPrime=true; //can be used like if you want to use extra var
        // for (int i = 2; i <=x-1; i++) {
        for (int i = 2; i <= Math.sqrt(x); i++) { // this is an optimized approach
            if (x % i == 0) {
                // isPrime=false;
                // break;// or return false
                return false;
            }
        }
        // return isPrime;
        return true;
    }

    public static void primeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void bToD(int n){
        int i =0,sum=0;
  
        while (n!=0) {
            int dig= n%10; // extracting last dig

            //if i dont use this dig==1 then we have to do this below one-->
            // sum=sum+(dig*(int)Math.pow(2, i));

            if(dig==1) // binary number is 1 then the pow will come if 0 we don't have to do anything
            sum+=Math.pow(2, i);
            n/=10; //updating value 
            i++; // 2pow0 2pow1 2pow2...
        }
        System.out.println("The Decimal value is "+sum);
    }

    public static void dToB(int n ){
        int bin=0,i=0; 
        while (n>0) {
            int rem= n%2;
            bin=bin+(rem*(int)Math.pow(10, i));
            i++;
            n/=2;
         }
         System.out.println("The binary number will be "+bin);
    }

        public static void hollow_rect(int r, int c){
            for (int i = 1; i <=r; i++) {
                for (int j = 1; j <=c; j++) {
                    if(i==1 || i==r || j==1 || j==c){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        
        //hollow rectangle
        hollow_rect(5, 5);
        /*
         ----------------------------
         Patterns
         ----------------------------
         */

        
        
        /*
        0------------------------------
          //convert binary to decimal
          // bToD(101);
          // dToB(7);
          -----------------------------
          */


        /*
          ------------------------
          // Check whether the number is prime or not
          // Scanner sc= new Scanner(Ste)
          // int n =25;
          // System.out.println(isPrime(n));
          // primeRange(n);
          -----------------------
         */

        /*
          Function Overloading -- functions with same name but with ___different parameters___
          Overloading using parameters and also it doesn't depend on return type for Function overloading
         */

    }
}
