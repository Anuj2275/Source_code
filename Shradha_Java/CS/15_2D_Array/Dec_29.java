// import java.util.*;

// basics about 2d array
// memory of 2d array
// SPIRAL MATRIX
// DIGONAL SUM
// SEARCH IN SORTED MATRIX

//DONE
public class Dec_29 {

    // search
    public static boolean search(int mat[][], int k) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == k) {
                    System.out.println("(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void printSpiralMat(int matrix[][]) {
            int startRow=0, startCol=0;
            int endRow=matrix.length-1, endCol=matrix[0].length-1;
            while(startRow<=endRow && startCol<=endCol){
                //J as Col       and  I as Row

                //top
                for(int j=startCol ;j<=endCol;j++){
                    System.out.print(matrix[startRow][j]+" ");
                }

                //right
                for(int i =startRow+1; i<=endRow;i++){
                    System.out.print(matrix[i][endCol]+" ");
                }

                //bottom
                for(int j= endCol-1;j>=startCol;j--){
                    if(startRow==endRow) break;
                    System.out.print(matrix[endRow][j]+" ");
                }
                
                //left
                for(int i = endRow-1;i>=startRow+1;i--){
                    if(startCol==endCol) break;
                    System.out.print(matrix[i][startCol]+" ");
                }
                startCol++;
                startRow++;
                endCol--;
                endRow--;
            }
            System.out.println();
    }

    public static int digonalMatrixSum(int matrix[][]){
        
        int sum=0;
//high time compexity and it was a brute way
/*
 
for(int i = 0 ; i< matrix.length;i++){
    for(int j =0 ; j<matrix[0].length;j++){
        //for primary diagonal
        if(i==j) sum+=matrix[i][j];
        //for secondary diagonal
        else if (i+j==matrix.length-1) sum+=matrix[i][j];
    }
}
*/

//easier and less time complexity way
        for(int i =0 ; i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-i-1)
            sum+=matrix[i][matrix.length-i-1];
        }
        return sum;

    }

    public static boolean staircaseSearch(int mat[][],int key){
        int row=0,
        col=mat[0].length-1;
        while(row < mat.length && col>=0){
            if(mat[row][col]==key){
                System.out.println("Key founded at "+"("+row+","+col+")");
                return true;
            }
            else if(key<mat[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String args[]) {

        // search key in sorted matrix
        int mat[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=33;
        staircaseSearch(mat,key);

        //Diagonal sum
        // int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // System.out.println(digonalMatrixSum(mat));

        //Spiral matrix print 
        // int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // printSpiralMat(mat);

        /*
         
        int mat[][] = new int[3][3];
        // int n = 3, m = n;
        // if i want size acc to mat
        // for row
        int n = mat.length;
        // for cols
        int m = mat[0].length;
        
        Scanner sc = new Scanner(System.in); 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        //
        // System.out.println("The matrix is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.err.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        search(mat, 6);
        sc.close();
        */

        // ----------------------------
    }
}
