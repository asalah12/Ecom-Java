package homeTasks;

public class WhileLoopTask {
    public static void main(String[] args) {
       int counter=0;
        int i=0;
        while (i<500){

            if (i==100) {
                System.out.println(counter);
                break;
            }
             if (i%4==0) {
                i++;
                continue;
            }
            if(i%7==0) {
                counter += i;
                System.out.println(i);
            }
            i++;
            }
        }
    }

