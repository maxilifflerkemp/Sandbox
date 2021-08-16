import java.util.Scanner;

public class helloname {
    public static void main(String[] args) {

		System.out.println("What's your name?");

		Scanner input = new Scanner(System.in);
		String name = input.next();

		System.out.println("Hello " + name);
		
		input.close();
	}
}
