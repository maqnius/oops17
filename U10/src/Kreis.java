/**
 * Created by jaap on 03.07.17.
 */
public class Kreis extends RundeFigur {
    //constructor
    public Kreis(float[] mittelpunkt, float radius) {
        super(mittelpunkt, radius);
    }

    public void bewegefigur(float[] neuermittelpunkt) {
        setMittelpunkt(neuermittelpunkt);
    }

    public boolean ueberlapp(GeometryBase figure) {
        // TO DO
        return true;
    }
}
