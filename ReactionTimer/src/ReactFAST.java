import java.util.Scanner;

public class ReactFAST {

	public static void main(String[] args) throws InterruptedException {
		//Print 3,2,1 to console
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		
		//Print "Go" and start the timer(set current time in ms" to "startTime")
		System.out.println("GO!!!");
		long startTime = System.currentTimeMillis();
		
		//Get input by user and stop the timer(set current time in ms" to "stopTime")
		Scanner sc = new Scanner(System.in);
		sc.next();
		long stopTime = System.currentTimeMillis();
		
		//calculate the result of the reaction
		long reactionTime = stopTime - startTime;
		
		//print the result to console
		System.out.println(reactionTime + "ms");
	}
}