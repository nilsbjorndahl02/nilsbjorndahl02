package hemläxa;

import java.util.Scanner;

public class vecka38 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("skriv in ett heltal?");
		int a = input.nextInt();
		int max = a;
		int min = a;
		System.out.println("skriv in ett till heltal");
		int b =input.nextInt();
		if(b>max) {
			max = b;
		}
		if (b<min) {
			min = b;
		}
		System.out.println("skriv in ett till heltal?");
		int c = input.nextInt();
		if (c>max) {
			max = c;
		}
		if (c<min) {
			
		} 
		
		
	}
	
}
