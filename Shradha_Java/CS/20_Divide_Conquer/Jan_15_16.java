public class Jan_15_16 {
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    //Merge Sort
    public static void mergeSort(int arr[],int si,int ei){
        
        // base case
        if(si>=ei){
            return;
        }

        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);  // left
        mergeSort(arr, mid+1, ei);  // right
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        // imp while making the size for this temp array
        int temp[]=new int[ei-si+1]; //**imp**
        // iterators
        int i = si; //left
        int j = mid+1 ; //right
        int k=0; //temp arr

        //here value of i go from si->mid
        //then mid+1 -> ei
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }

        // if left portion is finished and the right portion is left (and vice-versa) that' why we are doing this 

        //for both left and right
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        while (j<=ei) {
            temp[k++]=arr[j++];
        }
        //copy temp to ori arr
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }




    //Quick Sort
    public static void quickSort(int arr[],int si, int ei){
        // we are taking the last ele
        int pivIndex=partition(arr,si,ei);
        quickSort(arr, si, pivIndex-1);
        quickSort(arr, pivIndex+1,ei);
    }
    public static int partition(int arr[],int si ,int ei){
        int piv= arr[ei];  // we are taking the last ele as the piv we can take any of the val as well
        int i = si-1; //initializing as -1

        for (int j = si; j <ei; j++) {
            if(arr[j]<=piv){  // agr j ele shota hai piv ele se to i++ krdo (-1 to 0 position)

                i++;
                //swap krdo
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        
        i++;
        int temp = piv;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }
    
    
    // Search in a rotated sorted array  --  distinct number but It is roated at a pivot point and we have to find the index of given element
    // its just like the advance way of binary search
    public static int search(int arr[],int si, int ei ,int tar){
        
        // base case
        if(si>ei){
            return -1;
        }

        int mid = si+(ei-si)/2;

        if(arr[mid]==tar){
            return mid;
        }
        
        // mid on  L1
        if(arr[si] <= arr[mid]){
            // l1 left
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, si, mid-1, tar);
            }
            //l1 right
            else{
               return search(arr, mid+1, ei, tar);
            }
        }
        // mid l2
        else{
            // l1 right
            if(arr[mid] <=tar && tar<=arr[ei]){
                return search(arr, mid+1, ei, tar);
            }
            else{
                return search(arr, si, mid-1, tar);
                
            }
        }

    }


    public static void main(String[] args) {
        // Jan 16
        // PRACTICE QUESTIONS
        /*
         Question 1 : Apply Merge sort to sort an array of Strings. (Assume that all the characters in all the Strings are in lowercase). (EASY)
         Sample Input 1 : arr = { "sun", "earth", "mars", "mercury" }
         Sample Output 1 : arr = { "earth", "mars", "mercury", "sun"}
         */

         //DONE ON ABC FILE





//---------------------------------------------------------------
        // quick sort worst case  (when pivot is always the smallest or th largst ele)
        // Search in a rotated sorted array
    //     int arr[]={4,5,6,7,0,1,2};
    //    int index = search(arr, 0, arr.length-1, 7);
    //    System.out.println(index);

        // Jan 15
        // Quick Sort  (by the pivot and partition )
        // int arr[]={6,3,9,2,5};
        // quickSort(arr, 0, arr.length-1);     
        // Merge Sort
        // int arr[]={6,3,9,5,2,8,-2,1,4};
        // mergeSort(arr, 0, arr.length-1);
        // print(arr);


    }    
}
