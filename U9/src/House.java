public class House {
    // Attributes
    private int buildYear;
    private int lifeSpan;
    private int totalRooms;
    private int occupiedRooms;
    private int houseNumber;
    boolean canBreak;

    /**
     * Constructor for the House Class with individual lifespan and number of rooms
     * @param houseNumber Adress
     * @param buildYear Year in which the house was build
     * @param totalRooms Number of rooms in the house
     * @param lifeSpan Lifespan of the building after which it gets destroyed
     */
    public House(int houseNumber, int buildYear, int totalRooms, int lifeSpan){
        this.buildYear = buildYear;
        this.houseNumber = houseNumber;
        this.totalRooms = totalRooms;
        this.lifeSpan = lifeSpan;

        occupiedRooms = 0;
        canBreak = false;
    }


    public House(int houseNumber, int buildYear) {
        this.buildYear = buildYear;
        this.houseNumber = houseNumber;
        lifeSpan = 10;
        totalRooms = 5;
        occupiedRooms = 0;
        canBreak = false;
    }

    public void setOccupiedRooms(int occupiedRooms) {
        this.occupiedRooms = occupiedRooms;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public int getHouseNumber() {
        return houseNumber;
    }


    public int getTotalRooms() {
        return totalRooms;
    }

    public int getOccupiedRooms() {
        return occupiedRooms;
    }

    public int getUnoccupiedRooms() {
        return totalRooms - occupiedRooms;
    }

    public void updateCanBreak(int theYear) {
        if (theYear - buildYear >= lifeSpan && occupiedRooms == 0) {
            canBreak = true;
        }
    }

    public void unoccupyRoom() {
        if (occupiedRooms > 0) {
            occupiedRooms--;
        } else {
            System.out.println("there is no occupied room in this house");
        }
    }

    public void occupyRoom() {
        if (occupiedRooms < totalRooms) {
            occupiedRooms++;
        } else {
            System.out.println("all rooms are allready occupied!");
        }
    }

}
