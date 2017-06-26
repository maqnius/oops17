public class House{
  // Attributes
  int buildYear;
  int lifeSpan;
  int totalRooms;
  int occupiedRooms;
  int houseNumber;
  boolean canBreak;
  // Constructor
  public House(int houseNumber, int buildYear){
    this.buildYear = buildYear;
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
  public void updateCanBreak(int theYear){
    if (this.buildYear-theYear < 0 & this.occupiedRooms == 0){
      this.canBreak = true;
    }
  }
  public void unoccupyRoom(){
    if (this.occupiedRooms > 0){
      this.occupiedRooms--;
    }
    else {System.out.println("there is no occupied room in this house");
    }
  }
  public void occupyRoom(){
    if (this.occupiedRooms < this.totalRooms){
      this.occupiedRooms++;
    }
    else {System.out.println("all rooms are allready occupied!");}
  }

}
