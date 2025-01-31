public class Jan_20_21_22_23{
    public static void print(int arr[]){
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i]+" ");
      }
        System.out.println();
    }

    public static void changeArr(int arr[],int i ,int val){
        if(i==arr.length){
            print(arr);
            return;
        }

        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }

    public static void findSubsets(String str, int i, String ans){

        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        // yes
        findSubsets(str, i+1, ans+str.charAt(i));
        // no
        findSubsets(str, i+1, ans);
    }

    public static void findPermutation(String str, String ans){

        if(str.length()==0){
            System.err.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr= str.charAt(i);

            //"abcde" => "ab"+"de"= abde  using substr for exlcuding that one char
            String NewStr= str.substring(0, i)+str.substring(i+1);
            findPermutation(NewStr, ans+curr);  // this is important to add the answer in the empty string to get the answer
        }
    }

    // Date 21 Jan
    public static void nQeens(char board[][], int row){

        if(row == board.length){
            printBoard(board);
            return;
        }

        for(int j=0; j<board.length;j++){
            board[row][j]='Q';
            nQeens(board, row+1); //function call
            board[row][j]='x'; //backtracking
            
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("--------- chess ---------");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int gridWays(int i , int j , int n , int m){

        if(i==n-1  && j==m-1){
            return 1;
        }
        else if(i==n || j==n){
            return 0;
        }
        
        return gridWays(i+1, j, n, m)+gridWays(i, j+1, n, m);
    }


    //sudoko
    public static boolean sudokoSolver(int sudoko[][],int row, int col){

        if(row==9 ){
            return true;
        }
      

        int nextrow= row, nextCol=col+1;

        if(col+1==9){
            nextrow=row+1;  // jump to nxt row
            nextCol=0; // we have to start from 1st col
        }

        if(sudoko[row][col]!=0){
            return sudokoSolver(sudoko, nextrow, nextCol);  // bc their is already a fixed number their and we can't place any number there
        }


        for(int dig=1;dig<=9;dig++){
            if(isSafe(sudoko,row,col,dig)){
                sudoko[row][col]=dig;
                if(sudokoSolver(sudoko, nextrow, nextCol)){
                    return true;
                }
                sudoko[row][col]=0;
            }
        }
        return false;
    }

    public static boolean isSafe(int sudoko[][],int row, int col,int dig){
        
            //for col
            for (int i = 0; i <=8; i++) {
                    if(sudoko[i][col]==dig) return false;
            }

            //for row
            for (int j = 0; j <=8; j++) {
                if(sudoko[row][j]==dig) return false;
            }

            //grid calculation
            int sr=(row/3)*3;
            int sc=(col/3)*3;

            for (int i = sr; i <sr+3; i++) {
                for (int j = sc; j < sc+3; j++) {
                    if(sudoko[i][j]==dig){
                        return false;
                    }   
                }
            }
        
        return true;
    }

    public static void printSudoko(int s[][]){
        for (int i = 0; i <9; i++) {
            for (int j = 0; j <9; j++) {
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        //-------------------- Date 23 Jan

        //Sudoko solve
        int sudoko[][]={
        {0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}
    };
if(sudokoSolver(sudoko, 0, 0)){
    System.out.println("Solution exists");
printSudoko(sudoko);
}
else{
    System.out.println("Solution doesn't exist");
}



        //grid ways
        // int n=4,m=4;
        // System.out.println(gridWays(0, 0, n, m));   // exponential time complexity  O(2^n+m)

        
        
        //-------------------- Date 21 Jan
        //-------------------- Date 22 Jan
        // N-Queens
        /*place n queens on a an NxN chessboard such that no 2 queens can attack each other*/

        // int n =2;
        // char board[][]=new char[n][n];

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <n; j++) {
        //         board[i][j]='x';
        //     }
        // }
        // nQeens(board, 0);
        // printBoard(board);

        //-------------------- Date 20 Jan
        // int arr[]= new int[6];
        // changeArr(arr, 0, 1);  //TC:O(n), SC:O(n)
        // print(arr);

        // String s= "abcd";
        // findSubsets(s, 0, "");  //TC O(n*2^n)    SC O(n)
        
        //finding permutations
        // String s= "abc";
        // findPermutation(s, "");   //tc O(n*n!)
    }
}