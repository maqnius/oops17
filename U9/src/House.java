public class House{
  // Attributes
  int buildYear;
  int lifeSpan;
  int totalRooms;
  int occupiedRooms;
  int houseNumber;
  boolean canBreak;
  // Constructor
  public House(int houseNumber){
    this.buildYear = 1960;
    this.lifeSpan = 60;
    this.totalRooms = 5;
    this.occupiedRooms = 0;
    this.houseNumber = houseNumber;
    this.canBreak = false;
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
  public void updateCanBreak(){
    if (this.buildYear-this.lifeSpan < 0 & this.occupiedRooms == 0){
      this.canBreak = true;
    }
  }
  public void unoccupyRoom(){
    if (this.occupiedRooms > 0){
      this.occupiedRooms--;
      this.unoccupyRoom++;
    }
    else {System.out.println("there is no occupied room in this house");
    }
  }
  public void occupyRoom(){
    if (this.occupiedRooms < this.totalRooms){
      this.occupiedRooms++;
      this.unoccupiedRooms--;
    }
    else {"all rooms are allready occupied!"}
  }

}
