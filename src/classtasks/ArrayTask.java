package classtasks;
import java.util.Scanner;
public class ArrayTask {
    public static void main(String[] args) {
        int numbers[] = new int[3];
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value num 1 please");
        numbers[0]= scanner.nextInt();
        System.out.println("enter the  value num 2 please");
        numbers[1]= scanner.nextInt();
        System.out.println("enter the value num 3 please");
        numbers[2]= scanner.nextInt();
        if ((numbers[0] > numbers[1])&& (numbers[0] > numbers[2])) {
            System.out.println("max number "+ numbers[0]);
        }
        if ((numbers[1] > numbers[0])&& (numbers[1] > numbers[2])) {
            System.out.println("max number "+ numbers[1]);
        }
        else {
            System.out.println("max number "+ numbers[2]);
        }
        System.out.println("summary= "+ (numbers[0]+numbers[1]+numbers[2])/3.0);

    }
}
