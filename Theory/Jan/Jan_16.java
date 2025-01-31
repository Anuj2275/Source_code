public class Jan_16 {
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4, 9, 8};
        
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("The maximum element is: " + max);
    }
}
