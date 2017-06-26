import java.util.Scanner;
public class A1 {
  // Attributes
  // Main
  public static void main(String[] args) {
      boolean goOn = true;
      int year = 2017;
      Street street = new Street(10);
      while (goOn == true){
          System.out.println(year);
          street.setYear(year);
          Scanner reader = new Scanner(System.in);
          System.out.println("How many families are moving out?: ");
          int movingOut = reader.nextInt();
          System.out.println("How many families are moving in?: ");
          int movingIn = reader.nextInt();
          String quit = reader.nextLine();
          System.out.println("Type 'END' to stop the simulation. Press 'ENTER' to continue to the next year.");
          year++;
          if (quit == "END"){
            goOn = false;
          }

      }
  }
}
