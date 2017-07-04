/**
 * Basic testing shit
 */
public class Test {
    public static void main(String[] args) {
        FigureHandler fgh = new FigureHandler();

        // Create some Objects
        float[][] coordinates = {{1,1}, {2,1}, {3,4}};
        fgh.erstelleDreieick(coordinates);

        coordinates = new float[][] {{1,1}, {2,1}, {3,4}, {5,6}};
        fgh.erstelleViereck(coordinates);

        float[] mittelpunkt = {3,3};
        fgh.erstelleKreis(mittelpunkt, 2);

        float[] punkt = {8,8};
        fgh.erstellePunkt(punkt);

        // Print List
        fgh.printList();

        // Check if something overlaps
        fgh.overlaps();
    }
}
