import java.util.Scanner;

public class hellow {

	public static void main(String[] args) {
		System.out.println("hello World");
        System.out.println("Welcome To JAVA");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
 
        String userName = myObj.nextLine();  // Read user input

        System.out.println("You Entered : "+userName);
	}

}
