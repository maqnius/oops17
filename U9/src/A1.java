import java.util.Scanner;

public class A1 {
    // Attributes
    // Main
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean goOn = true;
        int year = 2017;
        Street street = new Street(10, year);
        showStreet(street);
        System.out.println(year);
        while (goOn == true) {
            year++;
            street.setYear(year);
            System.out.println("How many families are moving out?: ");
            int movingOut = reader.nextInt();
            for (int family = 0; family < movingOut; family++) {
                street.familyMovesAway();
            }
            street.breakHouses();

            System.out.println("How many families are moving in?: ");
            int movingIn = reader.nextInt();
            for (int family = 0; family < movingIn; family++) {
                street.newFamilyMovesToStreet();
            }

            showStreet(street);
            System.out.println(year);
            System.out.println("\nType 'END' to stop the simulation. Press 'ENTER' to continue to the next year.");
            String quit = reader.next();
            if (quit.equals("END")) {
                System.out.println("The simulation is terminated!!!");
                goOn = false;
            }

        }
    }

    // Methods
    public static void showStreet(Street street) {
        System.out.println("");
        int size = street.getTotalProperty();
        for (int property = 0; property < size; property++) {
            if (street.getHouses()[property] != null) {
                System.out.print(street.getHouses()[property].getOccupiedRooms());
            }
            if (street.getHouses()[property] == null) {
                System.out.print("X");
            }
            System.out.print("   ");
        }
        System.out.println("");
        for (int property = 0; property < size; property++) {
            System.out.print("----");
        }
        System.out.println("");
        for (int property = 0; property < size; property++) {
            System.out.print(" - -");
        }
        System.out.println("");
        for (int property = 0; property < size; property++) {
            System.out.print("----");
        }
    }
}
