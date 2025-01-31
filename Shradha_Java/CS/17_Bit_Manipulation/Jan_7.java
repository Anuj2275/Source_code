/*
 some know about binary digits
 bit wise operators
 AND - &
 OR - |
 ONES COMPLEMENT - ~  tilde  ~0 is always -1
 BINARY LEFT SHIFT - <<    ||**a<<b = a*2^b**||
 BINARY RIGHT SHIFT - >>    a>>b=a/2^b
 */
public class Jan_7{
    //
    public static void oddEven(int n ){
        int bitmask=1;
        if((n & bitmask) == 0) System.out.println("Even number");
        else System.out.println("Odd number");
    }

    public static int getIthBit(int n ,int i){
        int bitmask=1<<i;
        if((n&bitmask) == 0 ) return 0;
        else return 1;
    }

    public static int setIthBit(int n ,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    
    public static int clearIthBit(int n ,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
        
    }
    public static int updateIthBit(int n ,int i,int newbit){
        if(newbit==0){
            return clearIthBit(n, i);
        }
        else{
            return setIthBit(n, i);
        }
        /*
         or
         n= clearIthBit(n,i);
         int bitMask=newBit<<i;
         return n|bitMask;
         */
        
    }

    public static int clearIBits(int n , int i ){
        int bitMask=(~0)<<i;
        return n & bitMask;
    }
    public static int clearBitsInRange(int n , int i,int j ){
        int a = ((~0)<<(j+1));
        int b = (1<<i) -1;
        int bitMask=a|b;
        return n & bitMask;
    }
    public static boolean isPowerOfTwo(int n ) {
        return (n&(n-1)) ==0;
    }

    public static int countSetBits(int n )  {
        //O(log n)
        int cnt=0;
        while(n>0){
            if((n&1)!=0) cnt++;
             n=n>>1;
        }
        
        return cnt;
    }

    //as it takes O(n) but from this it becomes O(log n)
    public static int fastExpo(int a, int n ){
        int ans=1;
        while(n>0){
            if((n&1)!=0) ans=ans*a;
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // /3-------------------------
        //check if a number is power of 2 or  not
        // System.out.println(isPowerOfTwo(12));
        
        //Count set bits in a number
        // System.out.println(countSetBits(15));
        
        //fast exponentiation
        System.out.println(fastExpo(5, 3));


        //2----------------------
        // Operations
        // Get ith bit
        /*
        System.out.println(getIthBit(10,3));  //otpt 1
        
        // Set ith bit
        System.out.println(setIthBit(10,2));  //otpt 14
        
        // Clear ith bit
        System.out.println(clearIthBit(10,1));  //otpt 8
        
        // update ith bit
        System.out.println(updateIthBit(7, 2, 0));  //otpt 3
        
        // clear last ith bit
        System.out.println(clearIBits(15, 2));  //otpt 12
        
        //clear range of ith bits
        System.out.println(clearBitsInRange(10, 2,4));  //otpt 2
        
        */
        

        //1----------------------
        // for odd and even for the binary numbers if the   LSB = 0 even and if 1 the odd
        // oddEven(12);
        // oddEven(11);
        // oddEven(77);

    }
}