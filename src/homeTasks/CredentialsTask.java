package homeTasks;
import java.util.Scanner;
public class CredentialsTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your username please:");
        String UserName= scanner.nextLine();
        System.out.println("enter your password please:");
        String Password= scanner.nextLine();
      //  String result;
        System.out.println( UserName.equals(Password)? "wellcome "+UserName : "there is not such user");
    }
}
