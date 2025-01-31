// import java.util.ArrayList;
import java.util.*;

public class Jan_24_25_26 {
    public static void main(String[] args) {
        //date 26 Jan

        /*
         Java collection framework

         Operations that we can do on arraylist
         ops        time complexity
         add ele    O(1)
         get ele    1
         remove     n
         set ele at index   n
         containes ele      n
         */


        //date 25 Jan
        //Nothing

        //date 24 Jan
        ArrayList<Integer> list=new ArrayList<>();              
        
        list.add(42);
        list.add(1);
        list.add(1112);
        list.add(2);
        list.add(33);
        // list.add(0,222); //O(n)
        // System.out.println(list);

        // find
        // int ele=list.get(2);
        // System.out.println(ele);

        // delete  here pass index
    // list.remove(1);
    // System.out.println(list);

    //set ele
    // list.set(1,77);
    // System.out.println(list);

    // contains  T/F
    // System.out.println(list.contains(1112));
    // System.out.println(list.contains(10));
    
        // list.get() 

        // Size of AL
        // System.out.println(list.size());


        // in for loop
        // for(int i = 0 ; i < list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }

        // reverse array list
        // for (int i = list.size()-1; i>=0; i--) {
        //     System.out.print(list.get(i)+" ");
        // }
        
        //maximum number
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i<list.size(); i++) {
        //     // if(max<list.get(i)){
        //     //     max=list.get(i);
        //     // }
        //     max=Math.max(max,list.get(i));
        // }
        // System.out.println(max);


        // swapping 2 nums
        // int idx=1,idx2=3;
        // System.out.println(list);
        // swap(list, idx, idx2);
        // System.out.println(list);

        //sorting an arraylist
        // System.out.println(list); 
        // Collections.sort(list);  // ascending order
        // System.out.println(list); 
        // Collections.sort(list,Collections.reverseOrder());  //descending order
        // System.out.println(list); 


        // multidimensional arraylist
    //     ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();

    // ArrayList<Integer> L1= new ArrayList<>();
    // L1.add(1);
    // L1.add(2);
    // L1.add(3);
    // mainList.add(L1);
    // ArrayList<Integer> L2= new ArrayList<>();
    // L2.add(4);
    // L2.add(5);
    // L2.add(6);
    // mainList.add(L2);


    // for(int i = 0 ; i < mainList.size();i++){
    //     ArrayList<Integer> currList= mainList.get(i);
    //     for (int j = 0; j <currList.size(); j++) {
        //         System.out.print(currList.get(j)+" ");
    //     }
    //     System.out.println();
    // }

    // System.out.println(mainList);
    

    // container with most water
        // ArrayList<Integer> height=new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        // System.out.println(storeWater(height));
        // System.out.println(storeWaterModified(height));

        // pair sum 
        // these were for sorted array
        ArrayList<Integer> pairs=new ArrayList<>();
        // pairs.add(1);
        // pairs.add(2);
        // pairs.add(3);
        // pairs.add(4);
        // pairs.add(5);
        // int tg=5;
        
        // System.out.println(pairSum1(pairs, tg));
        // System.out.println(pairSum2(pairs, tg));
        pairs.add(11);
        pairs.add(15);
        pairs.add(6);
        pairs.add(8);
        pairs.add(9);
        pairs.add(10);
        int tg=26;
        
        // these are for sorted and rotated array
        System.out.println(pairSum3(pairs, tg));

    }    


    //these are for sorted and rotated array
    public static boolean pairSum3(ArrayList<Integer> ls, int tg){

        // break point
        int bp =-1;
        int n = ls.size();

        for (int i = 0; i <ls.size(); i++) {
            if(ls.get(i)>ls.get(i+1) ){
                bp=i;
                break;
            }
        }

       int lp=bp+1;
       int rp=bp;

       while (lp!=rp) {

        if((ls.get(lp)+ls.get(rp))==tg){
            return true;
        }

        if(ls.get(lp)+ls.get(rp) < tg){
            lp= (lp+1) % n;
        }
        else {
            rp= (n+rp-1) % n ;
        }

       }
        return false;
    }

    //these were for sorted array
    //2 pointer approach
    public static boolean pairSum2(ArrayList<Integer> ls, int tg){
       int lp=0;
       int rp=ls.size()-1;

       while (lp<rp) {

        if((ls.get(lp)+ls.get(rp))==tg){
            return true;
        }

        if(ls.get(lp)+ls.get(rp) < tg){
            lp++;
        }
        else rp-- ;

       }
        return false;
    }

    //brute force
    public static boolean pairSum1(ArrayList<Integer> ls, int tg){
        for (int i = 0; i <ls.size(); i++) {
            for (int j = i+1; j <ls.size(); j++) {
                if((ls.get(i)+ls.get(j))== tg ){
                    return true;
                }
            }
        }
        return false;
    }

    
    // 2 pointer appraoch  O(n)
    public static int storeWaterModified(ArrayList<Integer> h){
        int maxWater=0;
        int lp=0;
        int rp=h.size()-1;
        
        while (lp<rp) {
            // calc water area
            int ht = Math.min(h.get(lp),h.get(rp));
            int wid=rp-lp;
            int currWater=ht*wid;
            maxWater=Math.max(maxWater,currWater);
            
            //update ptr;
            if(h.get(lp) < h.get(rp)){
                lp++;
            }
            else rp--;
        }
        return maxWater;
    }
    // brutre force O(n^2)
    public static int storeWater(ArrayList<Integer> h){
        int maxWater=0;

        for (int i = 0; i <h.size(); i++) {
            for (int j = i+1; j <h.size(); j++) {
                int ht = Math.min(h.get(i),h.get(j));
                int width= j-i;
                int currWater= ht*width;
                maxWater=Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }

    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }

}

