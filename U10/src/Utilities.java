/**
 * Created by jaap on 03.07.17.
 */
import java.lang.Math;
public final class Utilities {

    // klasse fuer methode zur Ueberpruefung, ob sich zwei Geometrische Figuren ueberlappen

    public static boolean ueberlapptKreisKreis(RundeFigur A, RundeFigur B){
        float[]m_a = A.getMittelpunkt();
        float[]m_b = B.getMittelpunkt();
        //Berechne den Abstand der Mittelpunkte, wenn kleiner als die Summe der Radien, dann ueberlappen sich die Kreise
        double abstand = Math.sqrt(Math.pow(m_a[0]-m_b[0],2)+Math.pow(m_a[1]-m_b[1],2));
        return(abstand <= (A.getRadius()+B.getRadius()));
    }

    public static boolean ueberlapptKreisEck(RundeFigur A, EckigeFigur B){
        float[][] ecken = B.getCoordinates();
        // fuer alle Seitenkanten der Eckigen Figur wird der minimale Abstand zum Mittelpunkt des Kreises berechnet
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

    private static float[] linieSchneidetLinie(float[][] linieA, float[][] linieB){
        float[] mUndB1 = mUndB(linieA);
        float[] mUndB2 = mUndB(linieB);
        float m1 = mUndB1[0];
        float b1 = mUndB1[1];
        float m2 = mUndB2[0];
        float b2 = mUndB2[1];
        float xSchnitt = (b2 - b1)/(m1 - m2);
        float ySchnitt = m1*xSchnitt + b1;
        float[] Schnittpunkt = {xSchnitt, ySchnitt};


        return Schnittpunkt;
    }

    private static float[] mUndB(float[][] linie){
        float m = (linie[1][1]-linie[0][1])/(linie[1][0]-linie[0][0]);
        float b = (linie[0][1] - m*linie[0][0]);
        float[] mUndB = {m, b};
        return mUndB;
    }

    private static boolean schneidetKreisLinie(RundeFigur A, float[][] linie){
        // berechne Richtungsvektor
        float[] strecke = {linie[1][0]-linie[0][0], linie[1][1]-linie[0][1]};
        // Berechne Abstandsvektor vom Mittelpunkt zum Anfangspunkt der Linie
        float[] b = {linie[0][0]-A.getMittelpunkt()[0], linie[0][1]-A.getMittelpunkt()[1]};
        // Projiziere b auf die Strecke und normiere auf strecke um minimalsten Abstand zu bekommen,
        // t entspricht skalierungsfaktor
        float t = skalarProdukt(strecke,b)/skalarProdukt(strecke,strecke);
        // wenn t > 1 bzw. t<0 setze t=1 bzw. t=0, damit werden die Endpunkte zur Abstandsberechnung genommen
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
        //helper funktion zur berechnung des Skalarprodukts
        float sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];}
        return sum;
    }
    private static double abstand(float[] a, float[] b){
        //helper funktion zur abstandberechnung zwischen zwei Punkten
        return Math.sqrt(Math.pow(a[0]-b[0],2)+Math.pow(a[1]-b[1],2));
    }
}





