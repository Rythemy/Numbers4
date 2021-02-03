import java.util.Scanner;

public class Main {
	 public static void main(String[] args) throws InterruptedException {
		 
		 System.out.println("Hello. Welcome to Numbers 4.");
		 
		 
		 Scanner scan = new Scanner(System.in);
		 Numbers4 n = new Numbers4();
		 
		 n.askForDecision(scan);
		 Thread.sleep(1000);
		 System.out.println("Now's the time for the drawing!");
		 Thread.sleep(1000);
		 System.out.println("3");
		 Thread.sleep(1000);
		 System.out.println("2");
		 Thread.sleep(1000);
		 System.out.println("1");
		 Thread.sleep(1000);
		 
		 n.draw();
		 n.match();
	 }
}
