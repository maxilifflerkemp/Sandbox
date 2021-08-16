import java.util.Scanner;

public class dynamic {
    public static void main(String[] args) {
        System.out.println("How many rows?");
        Scanner input = new Scanner(System.in);
		    int rows = input.nextInt();
    
        for (int i = 1; i <= rows; ++i) {
          for (int j = 1; j <= i; ++j) {
            System.out.print("* ");
          }
          System.out.println();

          input.close();
        }
      }
}
