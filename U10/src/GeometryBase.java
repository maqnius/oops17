/**
 * Created by jaap on 03.07.17.
 */
public abstract class GeometryBase {
    public String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void bewegefigur(float[] newPos);

    abstract boolean ueberlapp(GeometryBase figure);
}