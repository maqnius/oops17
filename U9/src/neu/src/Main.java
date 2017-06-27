package neu.src;

import java.lang.Math;
/**
 * Created by mark on 27.06.17.
 */
public class Main {
    public static void main(String[] args) {
        //simulate 15 years of street
        int year = 2017;
        int properties = 10;
        int flat_per_house = 5;
        int lifespan = 3;
        int simulation_time = 6;

        Street hessmann_weg = new Street(properties);
        hessmann_weg.buildNewHouse(year,flat_per_house,lifespan);
        hessmann_weg.printStreet(year);
        for(int i=0; i< simulation_time; i++, year++){
            int n_moveIn = (int )(Math.random()* 10);
            hessmann_weg.moveIn(n_moveIn,year,flat_per_house,lifespan);
            int n_families = hessmann_weg.NumberOccupiedFlats();
            int n_moveOut = (int )(Math.random()* n_families);
            System.out.println("\nYear:\t" + year+"\tFamilies moving in:\t"+n_moveIn+"\tmoving out:\t"+n_moveOut);
            System.out.println("\n=======Street after moving in===========\n");
            hessmann_weg.printStreet(year);
            hessmann_weg.moveOut(n_moveOut);
            System.out.println("\n=======Street after moving out===========\n");
            hessmann_weg.cleanStreet(year);
            hessmann_weg.printStreet(year);


        }



    }
}
