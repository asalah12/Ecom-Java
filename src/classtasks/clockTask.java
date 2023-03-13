package classtasks;

import java.util.Scanner;

public class clockTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("what time is it now");
        int time = scanner.nextInt();

        System.out.println("the time is");
        System.out.println((time / 100) + ":" + (time%100));


    }
}
