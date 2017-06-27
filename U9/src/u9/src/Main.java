package u9.src;

import java.lang.Math;

/**
 * Tests the house simulation
 */
public class Main {
    public static void main(String[] args) {
        //simulate 15 years of street
        int year = 2017;
        int properties = 10;
        int flat_per_house = 5;
        int lifespan = 2;
        int simulation_time = 6;

        // Print simulation setup
        System.out.println("\n=======Simulation parameters============\n");
        System.out.println("Properties: " + properties);
        System.out.println("Flats per house: " + flat_per_house);
        System.out.println("Lifespan of the houses:" + lifespan);
        System.out.println("Years simulated:" + simulation_time);

        // Initial setup with one house
        Street hessmann_weg = new Street(properties);
        hessmann_weg.buildNewHouse(year, flat_per_house, lifespan);

        // Print initial Setup
        System.out.println("\n============Initial Setup===============\n");
        hessmann_weg.printStreet(year);

        System.out.println("\n=========Start of Simulation============\n");
        for (int i = 0; i < simulation_time; i++, year++) {
            // Create random moves in and out
            int n_moveIn = (int) (Math.random() * 10);
            hessmann_weg.moveIn(n_moveIn, year, flat_per_house, lifespan);
            int n_families = hessmann_weg.NumberOccupiedFlats();
            int n_moveOut = (int) (Math.random() * n_families);

            System.out.println("\nYear:\t" + year + "\tFamilies moving in:\t" + n_moveIn + "\tmoving out:\t" + n_moveOut);

            System.out.println("\n=======Street after moving in===========\n");
            hessmann_weg.printStreet(year);
            hessmann_weg.moveOut(n_moveOut);

            System.out.println("\n=======Street after moving out===========\n");
            // Remove old buildings and build a new one if there are no empty flats anymore
            hessmann_weg.cleanStreet(year, year, flat_per_house, lifespan);
            hessmann_weg.printStreet(year);


        }


    }
}
