import java.util.Scanner;
import java.util.Random;

public class Numbers4 {
	public int yourNumber[] = {0, 0, 0, 0};
	public int houseNumber[] = {0, 0, 0, 0};
	Random rand = new Random();
	int upperbound = 9;
	
	public void askForDecision (Scanner scan) {
		System.out.println("Do you want to choose 4 numbers manually or automatically?");
		System.out.println("1. Manually");
		System.out.println("2. Automatically");
		int answer = scan.nextInt();
		 switch (answer) {
			 case 1:
				 System.out.println("Enter your own 4 numbers");
				 this.inputNumbers(scan);
				 this.outputNumbers();
				 break;
			 case 2:
				 System.out.println("Here are your generated numbers: ");
				 this.generateNumbers();
				 this.outputNumbers();
				 break;
		 }
	}
	
	public void inputNumbers(Scanner scan) {
		for (int i = 0; i < yourNumber.length; i++) {
			yourNumber[i] = scan.nextInt();
		}
	}
	
	
	public void generateNumbers() {
		for (int i = 0; i < yourNumber.length; i++) {
			yourNumber[i] = rand.nextInt(upperbound);
		}
	}
	
	public void outputNumbers() {
		System.out.printf("Your lottery numbers are: %d, %d, %d, %d\n", yourNumber[0], yourNumber[1], yourNumber[2], yourNumber[3]);
	}
	
	public void draw() {
		for (int i = 0; i < houseNumber.length; i++) {
			houseNumber[i] = rand.nextInt(upperbound);
		}
		
		System.out.printf("The winner numbers are: %d, %d, %d, %d\n", houseNumber[0], houseNumber[1], houseNumber[2], houseNumber[3]);
	}
	
	public void match() {
		if (yourNumber[0] == houseNumber[0] && yourNumber[1] == houseNumber[1] && yourNumber[2] == houseNumber[2] && yourNumber[3] == houseNumber[3]) {
			System.out.println("Congratulations! You won!");
		}
		else {
			System.out.println("Sorry! Better luck next time!");
		}
	
	}
}
