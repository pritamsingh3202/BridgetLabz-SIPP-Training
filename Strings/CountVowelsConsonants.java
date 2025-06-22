import java.util.*;
public class CountVowelsConsonants{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the String ");
	    String str = sc.nextLine();
// 		String str = "Substring";
		int vowels =0;
		int consonants =0;
		for(char c : str.toCharArray()){
		    if(Character.isLetter(c)){
		        char ch= Character.toLowerCase(c);
		         if(ch == 'a' || ch == 'e' || ch== 'i' || ch == 'o' || ch =='u'){
		        vowels++;
		        }
		        else{
		            consonants++;
		    
		             }
	    	}
	        }
		System.out.println("Number of Vowels in String " +vowels);
		System.out.println("Number of consonants in String "+consonants);
		
	}
}