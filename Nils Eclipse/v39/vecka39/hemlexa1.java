package vecka39;

import java.util.Scanner;

public class hemlexa1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("skriv ett X värde");
        int x = input.nextInt();

        System.out.println("skriv ett Y värde");
        int y = input.nextInt();

        if ((x>0)&&(y>0)){
        System.out.println("Quarant 1");
        }
        if ((x<0)&&(y>0)){
            System.out.println("Quarant 2");
        }
        if ((x<0)&&(y<0)){
            System.out.println("Quarant 3");
        }
        if ((x>0)&&(y<0)){
            System.out.println("Quarant 4");

        }

	}

}
