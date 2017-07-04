/**
 * Created by jaap on 03.07.17.
 */
public abstract class RundeFigur extends GeometryBase {
    public float[] mittelpunkt;
    public float radius;

    public float[] getMittelpunkt() {
        return mittelpunkt;
    }

    public void setMittelpunkt(float mittelpunkt[]) {
        this.mittelpunkt = mittelpunkt;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    //Konstruktor
    public RundeFigur(float[] mittelpunkt, float radius){
        this.mittelpunkt = mittelpunkt;
        this.radius = radius;
    }

    public void bewegefigur(float[] neuermittelpunkt) {
        setMittelpunkt(neuermittelpunkt);
    }

    public boolean ueberlapp(GeometryBase figure) {
        // TO DO
        return true;
    }
}
