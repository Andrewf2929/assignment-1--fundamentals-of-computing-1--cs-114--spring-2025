// Import libraries here

import java.util.Random;
import java.util.Scanner;
  
public class Assignment1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    

    System.out.println("RRRRRRRRR      VVV         VVV");
        System.out.println("RRR     RRR     VVV       VVV");
        System.out.println("RRR     RRR      VVV     VVV");
        System.out.println("RR  RRR           VVV   VVV");
        System.out.println("RRR     RRR        VVV VVV");
        System.out.println("RRR     RRR         VVVVV");
        System.out.println("RRR     RRR          VVV");
        
      System.out.println("Please enter a number in Farenheit: ");
        int farenheit = scanner.nextInt();

      System.out.println("Please enter a 5-character string: ");
        String inputString = scanner.next();

      System.out.println("Generating random number. Continuing... ");
        double randomNumber = random.nextDouble();

      System.out.println("Your new string is" + randomNumber + inputString);
    
  }
}
