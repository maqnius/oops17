public class Street {
  // Attributes
  public int numberOfHouses;
  public int totalProperty;
  public House[] houses;
  // Constructor
  public Street(int totalProperty){
    this.numberOfHouses = numberOfHouses;
    this.totalProperty = totalProperty;
    this.houses = new House[this.totalProperty];
    for (int i = 0; i<this.totalProperty; i++){
      this.houses[i] = new House(i);
    }
  }
  // Methods
  public void buildHouse(int houseNumber){
    if (this.houses[houseNumber] != null){
      this.houses[houseNumber] = new House(houseNumber);
      this.numberOfHouses++;
    }
    else {
      System.out.println("Can not build, because the property is occupied with
      another house!");
    }
  }
  public void breakHouse(int houseNumber){
    this.houses[houseNumber].updateCanBreak();
    if (this.houses[houseNumber].canBreak){
        this.houses[houseNumber] = null;
        this.numberOfHouses--;
    }
    else {
      System.out.println("House must be empty and old enough! Can not break.");
    }
  }
  private int findEmptyRoom(){
    for (int houseNumber = 0; houseNumber++; this.totalProperty){
      if (this.houses[houseNumber] != null &
      this.houses[houseNumber].unoccupiedRooms > 0){
        return houseNumber;
      }
      return -1;
    }
  }
  private int findEmptyProperty(){
    for (int houseNumber = 0; houseNumber++; totalProperty){
      if (this.houses[houseNumber] = null){
        return houseNumber;
      }
      return -1
    }
  }
  public void newFamilyMovesToStreet(){
    int houseNumber = this.findEmptyRoom();
    if (houseNumber != -1){
      this.houses[houseNumber].occupyRoom;
    }
    if (houseNumber == -1){
      int freeProperty = this.findEmptyProperty();
      if (freeProperty != -1){
        this.buildHouse(freeProperty);
      }
      if (freeProperty == -1){
        System.out.println("No more rooms and no free properties for new houses.
        Move to another street!");
      }
    }

  }
}
