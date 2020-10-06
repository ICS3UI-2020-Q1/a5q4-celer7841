import java.util.Scanner;
/**
 *
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a starting balance");
    double balance = sc.nextDouble();
    System.out.println("Please enter your interest rate");
    int rate = sc.nextInt();
    System.out.println("Please enter the number of years you will invest for");
    int years = sc.nextInt();
    for (int i= 1; i<= years; i++){
      balance = balance + balance * rate/100;
    }
      System.out.println("Your final balance would be $" + balance);
    
  }
}
