import java.util.StringTokenizer;

public class Jan_24 {
    public static void main(String[] args) {
        // StringBuilder s= new StringBuilder(10);
        String ss = "This is java class";

        StringTokenizer st = new StringTokenizer(ss);
        // System.out.println(st.countTokens());

        String[] words = ss.split(" ");
        String maxword="";
        int maxlen=0;

        for (String w : words) {
            if(w.length()>maxlen){
                maxlen=w.length();
                maxword=w;
            }
        }
        System.out.println(maxword);
        System.out.println(maxlen);
        // System.out.println( words.length);
    }
}
