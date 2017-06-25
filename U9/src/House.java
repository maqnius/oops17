public class House{
  // Attributes
  int buildYear;
  int lifeSpan;
  int totalRooms;
  int occupiedRooms;
  int houseNumber;
  boolean timeUp;
  // Constructor
  public House(int houseNumber){
    this.buildYear = 1960;
    this.lifeSpan = 60;
    this.totalRooms = 5;
    this.occupiedRooms = 4;
    this.houseNumber = houseNumber;
    this.timeUp = false;
  }
  // Methods
  public int getTotalRooms(){
    return this.totalRooms;
  }
  public int getOccupiedRooms(){
    return this.occupiedRooms;
  }
  public int getUnoccupiedRooms(){
    return this.totalRooms - this.occupiedRooms;
  }
  public void updateTimeUp(){
    if (this.buildYear-this.lifeSpan < 0 & this.occupiedRooms == 0){
      this.timeUp = true;
    }
  }

}
