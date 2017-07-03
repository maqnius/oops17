import java.util.ArrayList;

/**
 * Organizes Figures
 */
public class FigureHandler {
    private ArrayList<GeometryBase> figures = new ArrayList<>();
    private int n_kreis = 1;
    private int n_viereck = 1;
    private int n_dreieck = 1;
    private int n_punkt = 1;


    public void erstelleKreis(float[] mittelpunkt, float radius){
        Kreis newKreis = new Kreis(mittelpunkt, radius);
        newKreis.setName("Kreis"+n_kreis);
        n_kreis++;

        figures.add(newKreis);
    }

    public void erstelleViereck(float[][] coordinates){
        Viereck newViereck = new Viereck(coordinates);
        newViereck.setName("Viereck"+n_viereck);
        n_viereck++;

        figures.add(newViereck);
    }

    public void erstelleDreieick(float[][] coordinates){
        Dreieck newDreieck = new Dreieck(coordinates);
        newDreieck.setName("Dreieck"+n_dreieck);
        n_dreieck++;

        figures.add(newDreieck);
    }

    public void erstellePunkt(float[] mittlepunkt) {
        Punkt newPunkt = new Punkt(mittlepunkt);
        newPunkt.setName("Punkt"+n_punkt);
        n_punkt++;

        figures.add(newPunkt);
    }

    public void printList(){
        for (GeometryBase figure: figures) {
            System.out.println(figure.getName());
        }
    }

    /**
     * Überprüft ob sich geometrische Objekte überlappen
     */
    public void overlaps(){
        for(int i = 0; i < figures.size(); i++){
            for(int j = 0; j<i; j++){
                if(figures.get(i).ueberlapp(figures.get(j))){
                    System.out.println(figures.get(i).getName()+" überlappt "+figures.get(j).getName());
                }
            }
        }
    }
    }
