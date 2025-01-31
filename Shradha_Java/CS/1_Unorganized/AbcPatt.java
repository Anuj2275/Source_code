package CS;

public class AbcPatt {
    public static void main(String[] args) {
        char x='A';
        int v=4;
        
        for (int i = 1; i <= v; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }
    
}
