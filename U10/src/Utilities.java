/**
 * Created by jaap on 03.07.17.
 */
import java.lang.Math;
public final class Utilities {

    public static boolean ueberlapptKreisKreis(RundeFigur A, RundeFigur B){
        float[]m_a = A.getMittelpunkt();
        float[]m_b = B.getMittelpunkt();
        double abstand = Math.sqrt(Math.pow(m_a[0]-m_b[0],2)+Math.pow(m_a[1]-m_b[1],2));
        return(abstand <= (A.getRadius()+B.getRadius()));
    }

    public static boolean ueberlapptKreisEck(RundeFigur A, EckigeFigur B){
        float[][] ecken = B.getCoordinates();
        for(int i = 0; i < ecken.length - 1; i++){
            float[][] tmp_linie = {ecken[i+1], ecken[i]};
            if(schneidetKreisLinie(A, tmp_linie)){
                return true;
            }
        }
        return false;
    }

    public static boolean ueberlapptEckEck(EckigeFigur A, EckigeFigur B){

        return false;
    }


    private static boolean schneidetKreisLinie(RundeFigur A, float[][] linie){
        float[] strecke = {linie[1][0]-linie[0][0], linie[1][1]-linie[0][1]};
        float[] b = {linie[0][0]-A.getMittelpunkt()[0], linie[0][1]-A.getMittelpunkt()[1]};
        float t = skalarProdukt(strecke,b)/skalarProdukt(strecke,strecke);
        if (t>1){
            t = (float) 1.0;
        } else if(t<0){
            t = (float) 0.0;
        }
        float[] naechsterPunkt = {strecke[0]*t+linie[0][0],strecke[1]*t+linie[0][1]};
        double d =abstand(naechsterPunkt,A.getMittelpunkt());
        return d<=A.getRadius();

    }

    private static float skalarProdukt(float[] a, float[] b){
        float sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];}
        return sum;
    }
    private static double abstand(float[] a, float[] b){
        return Math.sqrt(Math.pow(a[0]-b[0],2)+Math.pow(a[1]-b[1],2));
    }
}





