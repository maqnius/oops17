import java.util.Scanner;
public class A1 {
  // Attributes
  // Main
  public static void main(String[] args) {
      boolean goOn = true;
      int year = 2017;
      Street street = new Street(10);
      while (goOn == true){
          showStreet(street);
          street.breakHouses();
          System.out.println(year);
          street.setYear(year);
          Scanner reader = new Scanner(System.in);
          System.out.println("How many families are moving out?: ");
          int movingOut = reader.nextInt();
          for (int family = 0; family < movingOut; family++){
            street.familyMovesAway();
          }
          System.out.println("How many families are moving in?: ");
          int movingIn = reader.nextInt();
          for (int family = 0; family < movingIn; family++){
            street.newFamilyMovesToStreet();
          }
          String quit = reader.nextLine();
          System.out.println("Type 'END' to stop the simulation. Press 'ENTER' to continue to the next year.");
          year++;
          if (quit == "END"){
            goOn = false;
          }

      }
  }
  // Methods
  public static void showStreet(Street street){
    System.out.println("");
    int size = street.totalProperty;
    for (int property = 0; property < size; property++){
      if (street.houses[property] != null){
        System.out.print(street.houses[property].occupiedRooms);
      }
      if (street.houses[property] == null){
        System.out.print("X");
      }
      System.out.print("   ");
    }
    System.out.println("");
    for (int property = 0; property < size; property++){
      System.out.print("----");
    }
    System.out.println("");
    for (int property = 0; property < size; property++){
      System.out.print(" - -");
    }
    System.out.println("");
    for (int property = 0; property < size; property++){
      System.out.print("----");
    }
  }
}
