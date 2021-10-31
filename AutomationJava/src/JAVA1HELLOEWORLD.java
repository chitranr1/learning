import java.util.Scanner;

public class JAVA1HELLOEWORLD {

	public static void main(String[] args) {
		System.out.println("Hello world");  // to print hello world
		//to take input from user and print the output
		Scanner obj1= new Scanner(System.in);//create a scanner object,to take user input
		System.out.println("Enter username");
		String username = obj1.nextLine();//Read user input
		System.out.println("Entered name is : " +username);
		

	}

}
