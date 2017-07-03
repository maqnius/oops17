/**
 * Created by jaap on 03.07.17.
 */
public abstract class RundeFigur extends GeometryBase {
    private float[] mittelpunkt;
    private float radius;

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
}
