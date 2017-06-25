public class Street {
  // Attributes
  public int numberOfHouses;
  public int totalProperty;
  public House[] houses;
  // Constructor
  public Street(int numberOfHouses, int totalProperty){
    this.numberOfHouses = numberOfHouses;
    this.totalProperty = totalProperty;
    this.houses = new House[this.numberOfHouses];
  }
  // Methods
  public House buildHouse(){
    House h1 = new House(1);
    return h1;
  }
  public void breakHouse(int houseNumber){
    this.houses[houseNumber] = null;
  }

}
