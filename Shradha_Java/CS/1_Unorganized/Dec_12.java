// package CS;
//inverted and rotated hald-pyramid
public class Dec_12 {
    public static void main(String[] args) {
        //Dec 11
        int m=7;
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=m-i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = m-1; i>=1; i--) {
            for (int j = 1; j <=m-i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        /*
         
        //Rhombus pattern + hollow rhombus
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=m-i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=m; j++) {

                if(i==1 || i==m || j==1 || j==m){

                System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
        */
        
        /*
        --------------------------------
        int n=7;
        //butterfly pattern
        
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = i+1; j <=n-i+n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = n-1; i>=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = i+1; j <=n-i+n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /*
         --------------------------------
        //0 1 half triangle
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=i; j++) {
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else System.out.print(0+" ");
            }
            System.out.println();
        }
        */

        /*
         ----------------------------
        //Floyd's half triangle 1 2 3 4 5
        int num=1;
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        
        */

        /*
        =------------------------------ 
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=m-i+1; j++) {
                System.out.print(j);
            }
            
            System.out.println();
        }
        */

        /*
         -----------------------------------
        //inverted and rotated hald-pyramid
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=m-i; j++) {
                    System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            */

    }
    
}
