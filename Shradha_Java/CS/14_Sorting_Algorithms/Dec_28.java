/*
//but started at 23 dec but lacked and then started on 28 dec
 BUBBLE SORT
 SELECTION SORT
 INSERTION SORT
 INBUILT SORT
 COUNTING SORT(ADVANCE)

 //***************DONE***********
 */
// import java.util.Arrays;
// import java.util.Collections;
public class Dec_28 {
    //this var im using swap is for the optimized way for the this sorting told by the shradha but done from the gpt 
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) { //this loop is going to arr.length - 2
            // boolean swap =false; // or
            int swapp =0;
            for (int j = 0; j < arr.length-1-i; j++) { // this loop is going to arr.length-2-i   
                if(arr[j]>arr[j+1]){
                    //swapping kro
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    // swap=true;
                    
                    swapp++;
                }
            }
            // if(!swap){
                //     break;
                // }
            if(swapp==0){
                break;
            }
        }
    }
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp= arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i =1 ; i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;

            while(prev>=0 && arr[prev]>curr){ // for descending arr[prev]<curr
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    //COUNTING SORT//this is like the frequence counter
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest=Math.max(largest,arr[i]);
        }

        int count[]=new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //Main sorting
        int j=0;
        for (int i = count.length-1; i>=0; i--) { // for reverse order make loop start start from last index
        // for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }


    

    // public static void print(Integer arr[]){ // this is for the collections.reverseOrder() 
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        //COUNTING SORT
        int arr[]={4,4,1,1,2,7,3,3,3};
        countingSort(arr);
        print(arr);
        
        // import java.util.Arrays;
        // import java.util.Collections;
        //Inbuilt sort
        // Integer arr[]={5,4,7,3,10,9,2,6,1}; 
        // Arrays.sort(arr);
        // Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr,0,5);
        // print(arr);

        //INSERTION
        // int arr[]={5,4,7,3,10,9,2,6,1}; 
        // insertionSort(arr);
        // print(arr);

        //SELECTION
        // int arr[]={5,4,7,3,10,9,2,6,1}; 
        // selectionSort(arr);
        // print(arr);
    

        //BUBBLE
        // int arr[]={5,4,7,3,10,9,2,6,1}; // O(n^2) but with another optimized way O(n)
        // bubbleSort(arr);
        // print(arr);
    }
}
