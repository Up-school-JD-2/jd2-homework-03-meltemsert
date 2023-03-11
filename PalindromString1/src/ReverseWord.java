import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Word: ");
		String str = scan.next();
		String reverseWord="";
	
		
		for(int i=(str.length()-1); i>=0; i--) {
			reverseWord+=str.charAt(i);
	
		} 
		
		if(reverseWord.equals(str)) { 
		
			System.out.println("Palindrom String: " + reverseWord);
		
		}
		
		else
			System.out.println("Reverse word: " + reverseWord);
	

	}

}
