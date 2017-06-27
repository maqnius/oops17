/**
 * Created by jaap on 27.06.17.
 */
import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.Math;
import java.util.ArrayList;

public class A2 {
    public static void main(String[] args) {

        int n = (int) Math.pow(10,3);
        double real_val = (Math.PI)*(Math.PI)/6.0;
        ArrayList<String> variante = new ArrayList<String>();
        variante.add("a");
        variante.add("b");
        variante.add("c");
        variante.add("d");
        variante.add("e");
        variante.add("f");
        variante.add("g");
        variante.add("h");
        for (String i:variante){
            double sum = Summe(n, i);
            System.out.println(i+")");
            System.out.println(sum);
            double diff_real = real_val-sum;
            System.out.println("Abweichung zum Grenzwert: "+ diff_real);
        }


    }

    static double Summe(int n, String variante) {
        double s = 0.0;
        float eins = 1;

        switch (variante){
            case "a":
                for(int i=1;i<=n;i++){
                    s += 1/i*i;
                }
                break;
            case "b":
                for(long i=1;i<=n;i++){
                    s += 1/(i*i);
                }
                break;
            case "c":
                for(int i=1;i<=n;i++){
                    s += 1.0/i/i;
                }
                break;
            case "d":
                for(int i=1;i<=n;i++){
                    s += 1.0/(i*i);
                }
                break;
            case "e":
                for(int i=1;i<=n;i++){
                    s += 1.0/((double)(i)*i);
                }
                break;
            case "f":
                for(int i=1;i<=n;i++){
                    s += 1/(double)(i*i);
                }
                break;
            case "g":
                for(int i=1;i<=n;i++){
                    s += eins/i/i;
                }
                break;
            case "h":
                for(int i=1;i<=n;i++){
                    s += 1/(1.0*i*i);
                }
                break;
            default:
                break;

        }

        return s;

    }
}

