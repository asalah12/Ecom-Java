package lesson_03_math;

public class mathLesson {
    public static void main(String[] args) {
        int a=20;
        int b=6;

        double c=20;
        double d=6;
        System.out.println(a + " + " + b + " = "+ (a + b) );
        System.out.println(a + "-" + b +" = "+ (a - b) );
        System.out.println(a + " * " + b + " = "+ (a * b) );
        System.out.println(3 + " * " + 4 + " = "+ (Math.pow(3,4)) );
        System.out.println(a + " / " + b + " = "+ (a / b) );
        System.out.println(c + " / " + d + " = "+ (c / d) );
        System.out.println(a + " % " + b + " = "+ (a % b) );
        System.out.println(c + " / " + 0 + " = "+ (c / 0) );

    }
}
