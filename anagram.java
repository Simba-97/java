import java.util.Arrays;

public class anagram{
    public static void main(String[]args){

        String x = "He Is SilEnt";
        String y = "is HE LisTeN";

        x = x.replace(" ", "");
        y = y.replace(" ", "");

        x = x.toLowerCase();
        y = y.toLowerCase();
        
        char a[] = x.toCharArray();
        char b[] = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        Boolean result = Arrays.equals(a, b);
         if (result == true){
             System.out.println("The Strings are anagrams");
         }
         else{
             System.out.println("The Strings are not anagrams");
         }


    }
}