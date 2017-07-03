/**
 * Created by jaap on 03.07.17.
 */
public class Punkt extends RundeFigur {
    public Punkt(float[] mittelpunkt){
        super(mittelpunkt, 0);
    }
    public void bewegefigur(float[] neuermittelpunkt){
        setMittelpunkt(neuermittelpunkt);
    }
    public boolean ueberlapp(GeometryBase figure){
        // TO DO
        return true;
    }
}
