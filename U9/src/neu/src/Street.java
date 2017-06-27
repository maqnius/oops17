package neu.src;

/**
 * Created by mark on 27.06.17.
 */
public class Street {
    private House[] houses;
    private int MaxHouses;

    /**
     * Initialize empty Street with space for MaxHouse houses
     * @param MaxHouses Maximum number houses
     */
    public Street(int MaxHouses) {
        houses = new House[MaxHouses];
        this.MaxHouses = MaxHouses;
    }

    public void moveOut(int numberOfPeople) {
        for(int i = 0; i < numberOfPeople; i++){
            if(!moveOut()){
                // Street empty
                System.out.println("Street empty.");
                break;
                }
            }
        }

    public boolean moveOut(){
        for (House h: houses){
            if(!h.equals(null)){
                if(h.moveOutHouse())
                    return true;
            }
        }
        return false;
    }

    /**
     * Several people want to move in
     * @param numberOfPeople
     * @return
     */
    public boolean moveIn(int numberOfPeople, int currentYear){
        for(int i = 0; i < numberOfPeople; i++){
            if(!moveIn()){
                // Try to build new House
                if(!buildNewHouse(currentYear)){
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
     * @return
     */
    public boolean moveIn(){
        // Try to find free Slot in existing House
        for(House h: houses) {
            if(!h.equals(null) && h.moveInHouse()){
                return true;
            }
        }
        return false;
    }

    public boolean buildNewHouse(int buildYear, int totalRooms, int lifeSpan){
        // Look for free slot
        for(House h: houses){
            if(h.equals(null)){
                h = new House(buildYear, totalRooms, lifeSpan);
                return true;
            }
        }
        // Street full
        return false;
    }

    public boolean buildNewHouse(int buildYear) {
        return buildNewHouse(buildYear, 10, 3);
    }

    /**
     * Looks for empty buildings that are over due
     */
    public void cleanStreet(int currentYear){
        for(House h: houses) {
            if(!h.equals(null) && h.isEmpty() && h.isOverdue(currentYear)){
                h = null;
            }
        }
    }

    /**
     * Creates print of the street
     * @param currentYear
     */
    public void printStreet(int currentYear){
        System.out.println("");
        for (House h: houses) {
            if (!h.equals(null)) {
                System.out.print(h.getOccupiedRooms());
            }
            else {
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
