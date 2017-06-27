package u9.src;

/**
 * Class represents a house that can hold a specific amount of people and
 * will be demolished when the lifespan is exceeded and nobody is living
 * int the building anymore
 */
public class House {
    // Attributes
    private int buildYear;
    private int lifeSpan;
    private int freeRooms, occupiedRooms;

    /**
     * Constructor for the House Class with individual lifespan and number of rooms     *
     *
     * @param buildYear  Year in which the house was build
     * @param totalRooms Number of rooms in the house
     * @param lifeSpan   Lifespan of the building after which it gets destroyed
     */
    public House(int buildYear, int totalRooms, int lifeSpan) {
        this.buildYear = buildYear;
        this.lifeSpan = lifeSpan;

        // All rooms empty
        freeRooms = totalRooms;
        occupiedRooms = 0;
    }

    /**
     * Trying to move into the house
     *
     * @return True if success, False if house is full
     */
    public boolean moveInHouse() {
        if (freeRooms > 0) {
            // Free room available
            freeRooms--;
            occupiedRooms++;

            return true;
        } else {
            // House full
            return false;
        }
    }

    /**
     * Trying to move out of the house
     *
     * @return True if successful, False if house is empty
     */
    public boolean moveOutHouse() {
        if (occupiedRooms > 0) {
            freeRooms++;
            occupiedRooms--;

            return true;
        } else {
            // House empty
            return false;
        }
    }

    /**
     * @return True if house is empty, False if not
     */
    public boolean isEmpty() {
        return occupiedRooms == 0;
    }

    /**
     * @param currentYear The current year to compute how old the building is
     * @return True if house is older than its lifespan
     */
    public boolean isOverdue(int currentYear) {
        return (currentYear - buildYear) >= lifeSpan;
    }

    /**
     * @return Number of occupied rooms
     */
    public int getOccupiedRooms() {
        return occupiedRooms;
    }
    /**
     * @return Number of free rooms
     */
    public int getFreeRooms(){
        return freeRooms;
    }
}
