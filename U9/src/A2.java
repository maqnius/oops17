/**
 * Created by jaap on 27.06.17.
 */
import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.Math;
import java.util.ArrayList;

public class A2 {
    public static void main(String[] args) {

        //int n = (int) Math.pow(10,6);
        int[] n = {(int) Math.pow(10,2), (int) Math.pow(10,4), (int) Math.pow(10,6), (int) Math.pow(10,8)};
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
        for (int b: n) {
            
        System.out.println("\\begin{table}[ht] \n \\begin{tabular}{l | l | l} \n ");
        System.out.println("Variante & Endwert & Abweichung vom Grenzwert \\\\ \n \\hline \n");
        for (String i:variante){
            try {
                double sum = Summe(b, i);
                double diff_real = real_val-sum;
                System.out.print(i+") &");
            System.out.print(sum);
            
            System.out.print("&"+ diff_real+ "\\\\ \n");
            } catch (Exception e) {
                String sum = "Abgebrochen";
                String diff_real = "Abgebrochen";
                System.out.print(i+") &");
            System.out.print(sum);
            
            System.out.print("&"+ diff_real+ "\\\\ \n");
            }
        }
        System.out.println("\\end{tabular} \n \\caption{n = "+b+"} \n \\end{table}");
            System.out.println("\n\n");
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
                for(int i=1;i<=n;i++){
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

