/*
 RECURSION
 A method of slving a computational problem where the solution depends on solutions to smaller instances of the same problem

 when a function calls another function it makes call stack

 STACK OVERFLOW
    always have a base to prevent stack overflow
 */

public class Jan_10_11_13_14 {
    
    //p-1
    public static void printDec(int n) {
        //n to 1
        // mine way
        // if(n>0){
            // System.out.println(n);
        // printDec(n-1);
        // }
        
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n - 1);
    }
    
    //p-2
    public static void printInc(int n) {
        //1 to n
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    //p-3
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);

    }
    
    //p-4
    public static int sumNn(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNn(n - 1);
    }
    
    //p-5
    public static int fibo(int n) {
        if(n==0 || n==1){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }
    
    //p-6
    public static boolean isSorted(int arr[], int i ){
        if(i==arr.length-1) return true;
        if(arr[i]>arr[i+1]) return false;

        return isSorted(arr, i+1);
        // return true;
    }
    
    //p-7
    public static int firstOccur(int arr[],int i,int k ){
        if(i==arr.length-1 && arr[i]!=k){
            return -1;
        }
        if(arr[i]==k) return i;
        return firstOccur(arr,i+1,k);
    }

    //p-8
    public static int lastOccur(int arr[],int i,int k ){
        if(i==0 && arr[i]!=k){
            return -1;
        }
        if(arr[i]==k) return i;
        return lastOccur(arr,i-1,k);
    }
    
    //p-9
    public static int power(int n,int p){
        if(p==0) return 1;        
        return n*power(n,p-1);
    }
    
    //p-10 
    public static int optiPower(int n,int p){
        if(p==0) return 1;        

        int po=optiPower(n,p/2);

        if(p%2!=0) 
        return n*po*po;
        
        return po*po;
    }
    
    //p-11
    public static int tilingP(int n){

        if(n==0 || n==1){ return 1;}
        return tilingP(n-1)+tilingP(n-2);

        //vertical
        // int vertical = tilingP(n-1);
        // //horizontal
        // int horizontal = tilingP(n-2);

        // int totalWays=vertical+horizontal;
        // return totalWays;
        
    }
    // mine method of this problem not by recursion but i thought i tried and i will fix this too
    // public static String(String s){
    //     String em="";
    //     int count=0;
    //     for (int i = 0; i < s.length(); i++) {
    //         if(count>1){
    //             count =0;
    //             continue;
    //         }
    //         else{
    //             em.charAt(i)=s.charAt(i);
    //         }
    //     }
    // }
    
    //p-12
    public static void removeDuplicates(String str, int indx, StringBuilder newStr,boolean map[]){
        if(indx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar= str.charAt(indx);
        if(map[currChar-'a']==true){
            removeDuplicates(str, indx+1, newStr, map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicates(str, indx+1, newStr.append(currChar), map);
        }
    }
    //p-13
    public static int friendsPairing(int n){
        //in this we are finding the number of ways in which given n can make number of pairs 
        // we are finding the total ways

        if(n==1 || n==2){
            return n;
        }
        return friendsPairing(n-1)+((n-1)*friendsPairing(n-2));

        //choice 
        // single
        // int fnm1=friendsPairing(n-1);

        // // pair
        // int fnm2 = friendsPairing(n-2);
        // int pairWays=(n-1) * fnm2;

        // // totways
        // int totalWays=fnm1+pairWays;
        // return totalWays;
    }

    public static void printBinaryStrings(int n ,int lastpPlace,String str)
{
    if(n==0){
        System.out.println(str);
        return;
    }
    printBinaryStrings(n-1, 0, str+"0");
    if(lastpPlace==0){
        printBinaryStrings(n-1, 1, str+"1");
    }

}   

//------------------------------
// PDF Q's

// 1 print number to string  like 12 to"one two"
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int n){
        if(n==0) return;

        int lstdig=n%10;
        printDigits(n/10);
        System.out.print(digits[lstdig]+" ");
    }

    // 2 count length of the string
public static int length(String s){
    if(s.length()==0) return 0;

    return length(s.substring(1 ))+1;

}

// 3 towerOfHanoi
public static void towerOfHanoi(int n , String src,String helper, String dest){
    if(n==1){
        System.out.println("tranfer disk "+n+" from "+src+" to "+dest);
        return;
    }

    towerOfHanoi(n-1, src, dest, helper);

    System.out.println("tranfer disk "+n+" from "+src+" to "+helper);

    towerOfHanoi(n-1, helper, src, dest);
}

   public static void main(String[] args) {
        //date 14 Jan
        //pdf q 3
        int n =3;
        towerOfHanoi(n, "A", "B", "C");

        //pdf q 2
        // String ss= "uqoks aa";
        // System.out.println(length(ss));

        // pdf q 1
        // int n=728;
        // printDigits(n);

        // Problem-14 Binary String Problem
        // a string where their should be no consecutive ones like 110001, 10101101, two one's can't be together in the string
        // we have print the ways(not no of ways) like for 3 it would be 101 100 000 010 001     
        // printBinaryStrings(3, 0, "");
        // DRY run this
        
        //--------------------------------------------------
        //date 13 Jan

        // Problem-13 Friend pairing problem
        // System.out.println(friendsPairing(3));
        
        // Problem-12 To remove duplicates in a string
        // String n="hheellothisopbutseem";
        // removeDuplicates(n, 0, new StringBuilder(""), new boolean[26]);

        //------------------------------------

        //date 11 Jan

        // int n = 10;
        // int arr[]={4,2,1,5,3,5,3,2,1};

        // Problem-11 Tiling problem
        // System.out.println(tilingP(3));


        // /----------------------------------/
        
        //date 10 Jan

        // Problem-10 x^n in O(logn) 
        // System.out.println(power(2,10));

        // Problem-9 x^n 
        // System.out.println(power(2,5));

        // Problem-8 find the last occurence of the ele
        // int sz= arr.length-1;
        // System.out.println(lastOccur(arr,sz,3));
        
        // Problem-7 find the first occurence of the ele
        // System.out.println(firstOccur(arr,0,33));

        // Problem-6 check whether the array is sorted or not
        // int arr[]={1,2,3,4,5};
        // System.out.println(isSorted(arr, 0));
        
        // Problem-5 Nth fibonacci number
        // n=26;
        // System.out.println(fibo(n));

        // Problem-4 in sum of n natural nums
        // n=5;
        // System.out.println(sumNn(n));

        // Problem-3 in factorial of number n
        // n=5;
        // System.out.print(fact(n));

        // Problem-2 in increasing order
        // printInc(n);

        // Problem-1 in decreasing order
        // printDec(n);

    }
}
