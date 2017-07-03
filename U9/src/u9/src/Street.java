
/**
 * The Street class holds houses and deals with incoming and leaving
 * neighbours. It also demolishes houses if they're overdue.
 */
public class Street {
    private House[] houses;

    /**
     * Initialize empty Street with space for MaxHouse houses
     *
     * @param maxHouses Maximum number houses
     */
    public Street(int maxHouses) {
        houses = new House[maxHouses];
    }

    /**
     * Several people try to move out. This method overloads
     * the moveOut() method.
     *
     * @param numberOfPeople Number of people that try to move out
     */
    public void moveOut(int numberOfPeople) {
        for (int i = 0; i < numberOfPeople; i++) {
            if (!moveOut()) {
                // Street is empty
                System.out.println("\nStreet is empty.");
                break;
            }
        }
    }

    /**
     * One Person trying to move out.
     *
     * @return Success or not
     */
    public boolean moveOut() {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                if (houses[i].moveOutHouse())
                    // Moving out was successful
                    return true;
            }
        }
        // Moving out wasn't successful since the street is empty
        return false;
    }

    /**
     * Several people try to move in. If there a less flats than people
     * that try to move in, new buildings are build.
     *
     * @param numberOfPeople Number of people that try to move in
     * @param currentYear    The current year
     * @param flat_per_house Number of flats every house holds
     * @param lifespan       Lifespan of the house
     * @return False if street is full during the move, True else
     */
    public boolean moveIn(int numberOfPeople, int currentYear, int flat_per_house, int lifespan) {
        for (int i = 0; i < numberOfPeople; i++) {
            if (!moveIn()) {
                // Try to build new House
                if (!buildNewHouse(currentYear, flat_per_house, lifespan)) {
                    // Failed, street full
                    return false;
                }
                i--; // Decrease by one because nothing was done this time
            }
        }
        // Everyone could move in
        return true;
    }

    /**
     * Someone wants to move in
     *
     * @return Successful or not
     */
    public boolean moveIn() {
        // Try to find free Slot in existing House
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null && houses[i].moveInHouse()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Looking for a free slot and building a new house there
     *
     * @param buildYear  The current year
     * @param totalRooms Number of flats the house holds
     * @param lifeSpan   Lifespan of the house
     * @return True if it was successful, False if the street is already full
     */
    public boolean buildNewHouse(int buildYear, int totalRooms, int lifeSpan) {
        // Look for free slot
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                houses[i] = new House(buildYear, totalRooms, lifeSpan);

                return true;
            }
        }
        // Street full
        return false;
    }

    /**
     * Looks for empty buildings that are overdue and deletes them. Also, if there are no
     * free flats anymore, a new house is build.
     */
    public void cleanStreet(int currentYear, int buildYear, int totalRooms, int lifeSpan) {
        for (int i = 0; i < houses.length; i++) {
            // Houses that are empty AND overdue should be removed
            if (houses[i] != null && houses[i].isEmpty() && houses[i].isOverdue(currentYear)) {
                houses[i] = null;
                System.out.println("\nHouse with housenumber: " + i + " was demolished");
            }
        }

        if (isFull()){
            // No free flats -> Build a new house if possible
            buildNewHouse(buildYear, totalRooms, lifeSpan);
        }
    }

    /**
     * @return The number of occupied flats in the street
     */
    public int NumberOccupiedFlats() {
        int sum = 0;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                sum += houses[i].getOccupiedRooms();
            }
        }
        return sum;
    }

    /**
     * @return Number of overall free Flats in the street
     */
    public int NumberFreeFlats(){
        int sum = 0;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                sum += houses[i].getFreeRooms();
            }
        }
        return sum;
    }

    /**
     * @return True street holds no empty flat
     */
    public boolean isFull(){
        return NumberFreeFlats() == 0;
    }

    /**
     * Creates print of the street
     *
     * @param currentYear
     */
    public void printStreet(int currentYear) {
        System.out.println("");
        for (House h : houses) {
            if (h != null) {
                System.out.print(h.getOccupiedRooms());
            } else {
                System.out.print("X");
            }
            System.out.print("   ");
        }
        System.out.println("");
        for (int i = 0; i < houses.length; i++) {
            System.out.print("----");
        }
        System.out.println("");

        for (int i = 0; i < houses.length; i++) {
            System.out.print(" - -");
        }
        System.out.println("");

        for (int i = 0; i < houses.length; i++) {
            System.out.print("----");
        }
    }
}
