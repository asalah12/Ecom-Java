import java.util.Scanner;

public class ScannerClassWork {
    public static void main(String[] args) {
      // type name= value
       int age =100;

       //Type name =new Type(..)
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name? ");

       String myname = input.nextLine();
        System.out.println("myname = " + myname);
    }
}
