public class Street {
    // Attributes
    private int numberOfHouses;
    private int totalProperty;
    private House[] houses;
    int year;

    // Getter and Setter

    public int getNumberOfHouses() {
        return numberOfHouses;
    }

    public void setNumberOfHouses(int numberOfHouses) {
        this.numberOfHouses = numberOfHouses;
    }

    public int getTotalProperty() {
        return totalProperty;
    }

    public void setTotalProperty(int totalProperty) {
        this.totalProperty = totalProperty;
    }

    public House[] getHouses() {
        return houses;
    }

    public void setHouses(House[] houses) {
        this.houses = houses;
    }

    // Constructor
    public Street(int totalProperty) {
        this.numberOfHouses = 1;
        this.totalProperty = totalProperty;
        this.houses = new House[this.totalProperty];
        for (int i = 0; i < this.numberOfHouses; i++) {
            this.houses[i] = new House(i, this.year);
        }
    }

    // Methods
    public void setYear(int theYear) {
        this.year = theYear;
    }

    public void buildHouse(int houseNumber) {
        if (this.houses[houseNumber] == null) {
            this.houses[houseNumber] = new House(houseNumber, this.year);
            this.numberOfHouses++;
        } else {
            System.out.println("Can not build, because the property is occupied with another house!");
        }
    }

    public void breakHouses() {
        for (int houseNumber = 0; houseNumber < this.totalProperty; houseNumber++) {
            if (this.houses[houseNumber] == null) {
                continue;
            }
            this.houses[houseNumber].updateCanBreak(this.year);
            if (this.houses[houseNumber].canBreak) {
                this.houses[houseNumber] = null;
                this.numberOfHouses--;
            }
        }
    }

    private int findEmptyRoom() {
        for (int houseNumber = 0; houseNumber < this.totalProperty; houseNumber++) {
            if (this.houses[houseNumber] != null && this.houses[houseNumber].getUnoccupiedRooms() > 0) {
                return houseNumber;
            }

        }

        for (int houseNumber = 0; houseNumber < this.totalProperty; houseNumber++) {
            if (houses[houseNumber] == null) {
                return houseNumber;
            }
        }
        return -1;
    }

    private int findEmptyProperty() {
        for (int houseNumber = 0; houseNumber < this.totalProperty; houseNumber++) {
            if (this.houses[houseNumber] == null) {
                return houseNumber;
            }
        }
        return -1;
    }

    public void newFamilyMovesToStreet() {
        int houseNumber = this.findEmptyRoom();
        if (houseNumber != -1) {
            if (houses[houseNumber] == null){
                this.buildHouse(houseNumber);
            }
            this.houses[houseNumber].occupyRoom();
        }
        if (houseNumber == -1) {
            int freeProperty = this.findEmptyProperty();
            if (freeProperty != -1) {
                this.buildHouse(freeProperty);
            }
            if (freeProperty == -1) {
                System.out.println("No more rooms and no free properties for new houses. Move to another street!");
            }
        }
    }

    private int findOccupiedHouse() {
        for (int houseNumber = 0; houseNumber < this.totalProperty; houseNumber++) {
            if (this.houses[houseNumber] != null &&
                    this.houses[houseNumber].getOccupiedRooms() > 0) {
                return houseNumber;
            }
        }
        return -1;
    }

    public void familyMovesAway() {
        int houseNumber = this.findOccupiedHouse();
        if (houseNumber == -1){
            System.out.println("Nobody lives here you stupid F**K!");
        } else{this.houses[houseNumber].unoccupyRoom();}

    }
}
