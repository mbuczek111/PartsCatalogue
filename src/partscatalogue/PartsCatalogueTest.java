package partscatalogue;

import java.util.HashMap;
import java.util.Scanner;

public class PartsCatalogueTest {
    public static void main(String[] args) {
        var catalogue = new HashMap<Integer, Parts>();
        catalogue.put(10_000, new Parts("Opel", "Wheel"));
        catalogue.put(10_111, new Parts("Skoda", "Brake"));
        catalogue.put(10_222, new Parts("BMW", "Left front door"));
        catalogue.put(10_333, new Parts("Fiat", "Bumper"));

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the part number of the part you want: ");
        Integer number = in.nextInt();
        System.out.println("You chose: " + catalogue.get(number));
    }
}
