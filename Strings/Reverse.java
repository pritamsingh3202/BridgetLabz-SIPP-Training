import java.util.*;

public class Reverse{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String ");
        String str = sc.nextLine();
        // String str= "Reverse";
        String st= reverse(str);
        System.out.print("Reverse Sring "+st);
        
    }
    public static String reverse(String str){
        if(str == null) return null;
        
        String rString= "";
        for(int i= str.length()-1; i>=0;i--){
            rString += str.charAt(i);
        }
        return rString;
    }
}