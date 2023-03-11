package homeTasks;

import java.util.Scanner;

public class ScannerHomeTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your first name? ");


        String MyFirstName = input.nextLine();
        System.out.println("MyFirstName = " + MyFirstName);

        System.out.println("what is your last name? ");

        String MyLastName = input.nextLine();
        System.out.println("MyLastName = " + MyLastName);

        System.out.println("where are you from? ");
        String IliveIn = input.nextLine();
        System.out.println("IliveIn = " + IliveIn);

        System.out.println("what is your course average? ");
        String MyAverage = input.nextLine();
        System.out.println("MyAverage = " + MyAverage);

        System.out.println("how old are you? ");
        String MyAge = input.nextLine();
        System.out.print("MyAge = " + MyAge);
        System.out.println("years old");


    }
}
