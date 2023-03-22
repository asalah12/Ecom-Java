package homeTasks;
import java.util.ArrayList;
import java.util.List;
public class CountriesTask {

        public static void main(String[] args) {

            List<String> countrieslist = new ArrayList<>();
           countrieslist.add("Australia");
           countrieslist.add("Yemen");
           countrieslist.add("United Kingdom");
           countrieslist.add("Canada");
           countrieslist.add("Japan");
           countrieslist.add("Denmark");
           countrieslist.add("Egypt");
           countrieslist.add("Jordan");
           countrieslist.add("lebanon");
           countrieslist.add("India");

            System.out.println("========== option1 - for loop ============");
            for (int i = 0; i <countrieslist.size(); i++) {
                System.out.print(countrieslist.get(i) + " ");
            }
            System.out.println();
            System.out.println("========== option2 - while loop ============");

            int i = 0;
            while (i <countrieslist.size()) {
                System.out.print(countrieslist.get(i) + " ");
                i++;
            }
            System.out.println();
            System.out.println("========== option3 - For-Each loop ============");


            for (String name :countrieslist) {
                System.out.print(name + " ");
            }
            System.out.println();

            System.out.println("========== option4 - forEach loop ============");

           countrieslist.forEach((name) -> System.out.print(name + " "));

        }
    }

