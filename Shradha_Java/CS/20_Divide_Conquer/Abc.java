public class Abc {

    public static void printS(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printI(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mgst(String arr[], int si, int ei) {
        if (si >= ei)
            return;

        int mid = si + (ei - si) / 2;
        mgst(arr, si, mid);
        mgst(arr, mid + 1, ei);
        mg(arr, si, mid, ei);
    }

    public static void mg(String arr[], int si, int mid, int ei) {
        // temp and then copy this in ori arr
        String temp[] = new String[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            // if(arr[i]<arr[j]){
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }

        }

        // when one is left and another is compplete
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    //quicksort
    public static void quickSort(int arr[],int si,int ei){
        int pivi=partition(arr,si,ei);
        quickSort(arr, si, pivi-1);
        quickSort(arr, pivi+1, ei);
    }
    public static int partition(int arr[],int si,int ei){
        int piv=arr[ei];
        int i = si-1;

        for(int j =si; j<ei; j++){
            if(arr[j]<=piv){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

        i++;
        int temp=piv;
        arr[ei]=arr[i];
        arr[i]=temp;

        return i;
    }

    public static void main(String args[]) {
        String arr[] = { "xun", "barth", "ars", "zoon" };
        mgst(arr, 0, arr.length - 1);
        printS(arr);
    }
}