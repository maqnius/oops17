package neu.src;

/**
 * Created by mark on 27.06.17.
 */
public class House {
    // Attributes
    private int buildYear;
    private int lifeSpan;
    private int freeRooms, occupiedRooms;

    /**
     * Constructor for the House Class with individual lifespan and number of rooms
     * @param buildYear Year in which the house was build
     * @param totalRooms Number of rooms in the house
     * @param lifeSpan Lifespan of the building after which it gets destroyed
     */
    public House(int buildYear, int totalRooms, int lifeSpan){
        this.buildYear = buildYear;
        this.lifeSpan = lifeSpan;

        freeRooms = totalRooms;
        occupiedRooms = 0;
    }

    public boolean moveInHouse(){
        if(freeRooms > 0){
            freeRooms--;
            occupiedRooms++;

            return true;
        } else {
            // House full
            return false;
        }
    }

    public boolean moveOutHouse(){
        if(occupiedRooms > 0) {
            freeRooms++;
            occupiedRooms--;

            return true;
        } else {
            // House empty
            return false;
        }
    }

    public boolean isEmpty(){
        if(occupiedRooms == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOverdue(int currentYear){
        if((currentYear - buildYear) > lifeSpan) {
            return true;
        } else {
            return false;
        }
    }

    public int getOccupiedRooms() {
        return occupiedRooms;
    }
}
