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
			min = c;
		} 
		System.out.println("skriv in ett till heltal?");
		int d = input.nextInt();
		if (d>max){
			max = d;
		}
		if (d<min) {
			min= d;
		}
		System.out.println("skriv in ett till heltal?");
		int e = input.nextInt();
		if (e>max) {
			max = e;
		}
		if (e<min) {
			min = e;
		}
		System.out.println("skriv in ett till heltal?");
		int f = input.nextInt();
		if (f>max) {
			max = f;
		}
		if (f<min) {
			min = f;
		}
		System.out.println("skriv in ett till heltal?");
		int g = input.nextInt();
		if (g>max) {
			max = g;
		}
		if (g<min) {
			min = g;
		}
		System.out.println("skriv in ett till heltal?");
		int h = input.nextInt();
		if (h>max) {
			max = h;
		}
		if (h<min) {
			min = h;
		}
		System.out.println ("skriv in ett till heltal?");
		int i = input.nextInt();
		if (i>max) {
			max = i;
		}
		if (i<min) {
			min = i;
		}
		System.out.println("skriv in ett till heltal?");
		int j = input.nextInt();
		if (j>max) {
			max = j;
		}
		if (j<min) {
			min = j;
		}
		System.out.println("maxsummer = " + max);
			
		System.out.println("minstanummer" + min);
	
		System.out.println("medelvärde = " +((a+b+c+d+e+f+g+h+i+j)/10.f));
	}
	
}
