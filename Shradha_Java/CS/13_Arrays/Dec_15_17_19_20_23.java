
// package CS;
/*
 1 Arrays
 2 
 */
// import java.util.*;

public class Dec_15_17_19_20_23 {
    public static void display(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }

    public static int linearS(int nums[], int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static void largestAndSmallestNum(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smallest > arr[i])
                smallest = arr[i];
        }
        System.out.println("The largest element is: " + largest);
        System.out.println("The smallest element is: " + smallest);
    }

    // ----------------------------------------------17-DEC---------------------------------

    public static int binarySearch(int arr[], int k) {
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            // int mid = (st + end) / 2;
            int mid = st + (end - st) / 2;

            // if element is = to mid value
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid]<k) {
                st = mid + 1; // right area
            } else {
                end = mid - 1; // left area

            }
        }
        return -1;
    }
    public static void swap(int arr[],int f, int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
        
    }

    public static void reverse(int arr[]){
        if(arr.length==0 || arr==null){return;}
        int st=0, end=arr.length-1;
        while(st<end){
            swap(arr,st,end);
            st++;
            end--;
        }
        // return 0;
        // return -1;
    }
    public static void pair(int arr[]){
        // int st=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                // if(arr[i]!=arr[j])
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }
    public static void printSubarray(int nums[]){
        for(int i =0 ; i < nums.length;i++){
            for (int j = i; j < nums.length; j++) {
                for (int k = i; k <=j; k++) {
                        System.out.print(nums[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void maxSubarraySumUsingPrefix(int nums[]){
        //before we used three loops in which one is commented out and in replace i used prefix method
        int cur=0;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i =0 ; i < nums.length;i++){
            int start=i;
            for (int j = i; j < nums.length; j++) {
                int end=j;
                cur=start==0 ? prefix[end]:prefix[end]-prefix[start-1];
                // for (int k = i; k <=j; k++) {
                //         // System.out.print(nums[k]+" ");
                //         cur+=nums[k];
                // }
                // System.out.println(cur);
                if(max<cur){
                    max=cur;
                }
            }
            // System.out.println();
        }
        System.out.print("The maximum sum is "+max);
    }
    public static void maxSubarraySumUsingKadanes(int nums[]){
       int ms= Integer.MIN_VALUE;
       int cs=0;
    for (int i = 0; i < nums.length; i++) {
        cs+=nums[i];
        if(cs<0){
            cs=0;
        }
        ms=Math.max(cs,ms);
}
System.out.println("The max subarray sum is: "+ms);

    }
    //mine way
    public static void trappingRainwater(int bars[]){
        int store=0,waterLevel=0,width=1;
        int maxRight=0,maxLeft=0;
        
        for (int i = 0; i < bars.length-1; i++) {
            //  waterLevel=Math.min(Math.max(waterLevel, i))  
            //max right
            for (int j = 0; j < bars.length; j++) {
                if(bars[j]>bars[j+1]){
                    maxRight=bars[j];
                }
            }
            //max left
            for (int j = i; j >=1; j--) {
                if(bars[j]<bars[j-1]){
                    maxLeft=bars[j];
                }
            }
            waterLevel=Math.min(maxLeft,maxRight);
            store+=(waterLevel-bars[i])*width;
            
        }
        System.out.println("The total volume is "+store);

    }

    public static void rainwater(int height[]){
        int n = height.length;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];

        //calc left max boundary - array 
        for (int i = 1; i < n; i++) {
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        //calc left max boundary - array 
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i = n-2; i>=0;i--){  //here n-1 will give last ele but n-2 second last this value will be checked with its next value that is n-1 which is also the i+1th value
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        int trappedWater=0;
        for (int i = 0; i <n; i++) {
            int waterLevel=Math.min(leftMax[i],rightmax[i]);
            trappedWater+=waterLevel-height[i];
        }
        System.out.println("The total volume is : "+trappedWater);
    }

    public static int buyAndSellStocks(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int mxPro=0;
        for (int i = 0; i < prices.length; i++) {
            if(buyPrice<prices[i]) {
                int profit=prices[i]-buyPrice;  //todays profit
                mxPro=Math.max(mxPro,profit);  // all days max profit value
            }
            else{
                buyPrice=prices[i];
            }
        }
        return mxPro;
    }

    public static void rem(int arr[]){
        int bp=Integer.MAX_VALUE;
        int mp=0;
        for(int i =0;i<arr.length;i++ ){
            if(bp<arr[i]){
                int pr=arr[i]-bp;
                mp=Math.max(mp, pr);
            }
            else{
                bp=arr[i];
            }
        }
        System.out.println("the max profit is: "+mp);
    }
    public static void main(String[] args) {

        // --------------------23 DEC------------------------------
        /*
         BUY AND SELL STOCKS
         // the time complexity is O(n)
         */
        int prices[]={7,1,5,3,6,4};  //output will be five because of the 6-1(smallest) 
        // System.out.println(buyAndSellStocks(prices)); 
        rem(prices);
        



        // --------------------20 DEC------------------------------
        /*
        TRAPPING RAINWATER***********IMP
        GIVEN A N Non-negative int representing an elevation map whrre the width of each bar  is 1 compute how much water it can trap after raining
        AND WILL ALSO LEARN ABOUT AUXILIARY ARRAYS
        
        (water level - bar height )* width , widht is given 1 and bar heights is also given but how the water level will be founded???
        water level will be the  min(max(left,right))
        // int arr[]={4,2,0,6,3,2,5};
        // trappingRainwater(arr);
        // rainwater(arr);
        */


        // maxSubarraySumUsingPrefix(arr);
        // int arr[]={-2,-3,4,-1,-2,1,5};
        //this KADANE'S  algo is mainly used for when the array contains the negative values and making them as intialize as 0
        //if the array containes the nums which all are -ive use the condition
        /*
         if(arr[i]<0) then print largest -ive number like -1,-4,-2,-3  it should print the -1
         */
        // maxSubarraySumUsingKadanes(arr);


        // --------------------19 DEC------------------------------
        //Max SUBARRAYS sum
        // int arr[]={2,4,6,8,10};
        // maxSubarraySum(arr);


        //SUBARRAYS IN AN ARRAYq
        // printSubarray(arr);

        
        
        // --------------------17 DEC------------------------------
        //PAIRS IN AN ARRAY
        // for n(n-1)/2
        //int arr[]={2,4,6,8,10};
       // pair(arr);





        //---------------------------------------------
        //Rerversin the array
        // int arr[] = { 1,4,6,9,12,45,77 };
        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // reverse(arr);
        // System.out.println("After reverse");
        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }
        // System.out.println(reverse(arr));

        
        // /---------------------------------
        // BINARY SEARCH  O(Log n)
        // ARRAY SHOULD ALWAYS BE IN SORTED ORDER
        // int arr[] = { 1,4,6,9,12,45,77 };
        // int k = 77;
        // System.out.println(binarySearch(arr, k));




        
        // --------------------15 DEC------------------------------
        /*
         * --------------------------------------
         * // LARGEST AND THE SMALLEST NUMBER IN THE ARRAY
         * int[] arr = { 7, 53, 6, 7, 41, 4 };
         * 
         * largestAndSmallestNum(arr);
         */

        /*
         * -----------------------
         * //LINEAR SEARCH
         * int ns[]={4,3,66,73,12,65,33};
         * int k=73;
         * System.out.println(linearS(ns, k));
         * 
         */

        // simple delcaring arrays and how to put value and can be updated
        // int marks[]={1,2,4,5};
        // OR
        // int[] m= new int[20];

        // passing arrays as arguments
        // this below one this way if by the void function LEARNT FROM GPT
        // display(new int[] {10, 20, 30});

    }

}