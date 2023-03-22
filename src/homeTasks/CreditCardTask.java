package homeTasks;
import java.util.Scanner;
public class CreditCardTask {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your username please:");
        int username = scanner.nextInt();
        System.out.println("enter your password please:");
        String password = scanner.nextLine();
        for (int counter = 1; counter >= 5; counter++) {
           // if ((username.equals(password)) && (password.equals(username))) {
                System.out.println("wellcome" + username);
                break;
            }
          //  else {
                System.out.println("Try Again");
            }
            }

      //  }
 //   }