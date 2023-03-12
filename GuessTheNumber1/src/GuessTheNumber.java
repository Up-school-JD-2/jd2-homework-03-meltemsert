import java.util.Scanner;
public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = (int)(Math.random()*100);
		int counter=1;
		int[] table = new int [2];
		
		
		for(int j=0;j<2;j++) {        
			counter=1;         
		for(int i=0; i<=counter; i++) {
			System.out.print("Guess: ");
			int guess = sc.nextInt();
			
			if(num==guess) {
				System.out.println("Right guess :) ");
				break;
			}
			
			if(guess<num) {
				System.out.println("Too low, try again :( ");
				counter++;
			}
			
			if(guess>num) {
				System.out.println("Too high, try again :/ ");
				counter++;
				}
			
		
	     	}
		
			table[j]=counter;
		
			}
		
		System.out.println("1. player guess number: " + table[0]);
		System.out.println("2. player guess number: " + table[1]);
		
      	}
	

	}


