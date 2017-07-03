/**
 * Created by jaap on 03.07.17.
 */
public abstract class EckigeFigur extends GeometryBase {
    private int n_deges;
    private float[][] coordinates;

    public EckigeFigur(float[][] coordinates) {
        this.coordinates = coordinates;
    }

    public void bewegefigur(float[] newPos) {
        for (float[] coordinate : getCoordinates()) {
            coordinate[0] += newPos[0];
            coordinate[1] += newPos[1];
        }
    }

    boolean ueberlapp(GeometryBase figure) {
        if (figure instanceof RundeFigur) {
            return Utilities.ueberlapptKreisEck((RundeFigur) figure, this);
        } else if (figure instanceof EckigeFigur) {
            return Utilities.ueberlapptEckEck((EckigeFigur) figure, this);
        } else {
            System.out.println("Nicht unterstützte Figur");
            return false;
        }
    }

    public float[][] getCoordinates() {
        return coordinates;
    }
}
