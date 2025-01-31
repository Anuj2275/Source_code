import java.util.*;
public class Date_13_Functions {

    public static void nNums(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        nNums(n-1);
    }
    public static void main(String[] args) {
        /*
        //FUNCTIONS
        // TYPES
         1. that doesn't take args, doesn't return anything
         2.-    -   -   --  -   -   does    -   something
         3.- -  - does -----    -   -dsn't -    -   -anything
         3.- -  - does -----    -   -ds -    -   - something

         */
        int n=10;
        nNums(n);
    }
}
