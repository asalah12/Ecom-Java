package homeTasks;

public class ComparisonTask {
    public static void main(String[] args) {
        System.out.println("10 > 6 = " + (10>6));
        System.out.println("5 >= 5 = " + (5>=5));
        System.out.println("20 < 10 = " + (20<10));
        System.out.println("35 <= 50 = " + (35<=50));
        System.out.println("25 = 25 = " + (25==25));
        System.out.println("50 != 50 = " + (50!=50));
        String string1 = "City";
        String string2 = "City";
        System.out.println("City == City = " + (string1.equals(string2)));
        String string3 = "citY";
        System.out.println("City == citY = " + (string1.equals(string3)));
    }
}
