/**
 * Created by jaap on 03.07.17.
 */
public class Dreieck extends EckigeFigur {
    public Dreieck(float[][] coordinates) {
        super(coordinates);
    }

    @Override
    boolean ueberlapp(GeometryBase figure) {
        return false;
    }
}
