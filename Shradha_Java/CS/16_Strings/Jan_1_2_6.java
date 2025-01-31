//


public class Jan_1_2_6 {

    public static boolean inPlaindrome(String str){
        for(int i = 0 ; i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String st){
        int x=0,y=0;
        for (int i = 0; i < st.length(); i++) {
            char dir = st.charAt(i);
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int X2=x*x;
        int Y2= y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static String subStringMaker(String str, int si,int ei){
        String subs="";
        for(int i = si; i<ei;i++){
            subs+=str.charAt(i);
        }
        return subs;
    }

    public static String toUpperCase(String str){
        StringBuilder sb= new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString(); // sb is not a string and for converting any object to string we use toString function
    }

    public static String compressString(String str){
        String newStr="";
        for (int i = 0; i < str.length(); i++) {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;  
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        //Jan 6

        String s = "aaabbbccdd";
        System.out.println(compressString(s));
        
        //JAN 2
        // Done Nothing

        //Substr
        // String st="HelloHell";
        // // System.out.println(subStringMaker(st, 5, 9));
        // System.out.println(st.substring(5,9));

        //-------
        //find largest string from set of strings in LEXIGRAPHIC MANNER where the letter size matter than the string length like the abc abd both the ab are same but the c is samller than the d so the abd wons
        // Compare to function is used
        //-------
        /*
        str1.compareTo(str2)
        0 : is equal
        <0 : -ve value     means str1<str2
         >0 : +ve value     means str1>str2
         
         their is  compareToIgnoreCase   which ignore the cases of to letters  a and A create huge diff.
         */
        //-------
        // String fruits[]={"Apple","mango","banana","avacado"};
        // String largest=fruits[0];
        // for (int i = 1; i < fruits.length; i++) {
        //         if(largest.compareTo(fruits[i]) <0) largest=fruits[i];  
        //         // because this gives that the fruits at i mango is greatest than the str1 
        // }
        // System.out.println(largest);
        
        
        //-------
        //As the whenver we have to some changes in the string using loop or other ways it takes too much time complexity and space and make code slow 
        // so we are going to user StringBuilder
        //to convert any object to string we use  .toString
        // .append is adding the thing at the end always
        
        // StringBuilder sb= new StringBuilder("");
        // for(char c='A';c<='a';c++){
            //     sb.append(c);
            // }
            
        // //time complexity O(26) for a-z ______as if we have used thesimple string it take 26*sb.length or like O(n^2)_____
        // System.out.println(sb);
            
        //-------
        //convert each words first letter to upper case
        // String h= "hello this is me ";
        // System.out.println(toUpperCase(h));



        //----------------------------------------------------------------------------------
        //JAN 1
        // Strings are immutable
        // Scanner sc= new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println("So, your name is : "+name);

        //length 
        // System.out.println("The length of the name is "+name.length());

        //concatenation   using +
        
        // extracting each char from the string using   CHARAT FUNCTION
        // System.out.println(name.charAt(4));  // character at index 


        //plindrome string
        // String s= "raceca";
        // System.out.println(inPlaindrome(s));


        // getting shortest path and using the coordinates with the NSEW directions
        // String d="WNEENESENNN";
        // String d2="NS";
        // System.out.println(getShortestPath(d2));


        //two similar strings are not always same
        // String s1="Tony";
        // String s2="Tony";
        // String s3=new String("Tony");

        // if(s1==s2) System.out.println("Same");
        // else System.out.println("Not Same");
        // this Concept is called Interning   which we will discuss tomorrow
        // Same will printed because at computer level the s1 and s2 both are actually pointing to one tony


        // if(s1==s3) System.out.println("Same");
        // else System.out.println("Not Same");
        //Not Same    because the new keyword will make another tony which is not same as the s1




    }
}
