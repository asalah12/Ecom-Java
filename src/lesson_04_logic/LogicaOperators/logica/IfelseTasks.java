package lesson_04_logic.LogicaOperators.logica;

import java.util.Scanner;

public class IfelseTasks {
    public static void main(String[] args) {

        Scanner sccaner = new Scanner(System.in);

        System.out.println("x=");
        int x = sccaner.nextInt();
        if( x %2 == 0) {
            System.out.println(x + "=> even");
        }
        else {
            System.out.println(x + "=> odd");
        }
        }
    }

