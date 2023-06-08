package org.bridgelabz;

import java.util.ArrayList;

public class BikeModels {
    public static void main(String[] args) {
        ArrayList<String> bike_list = new ArrayList<String>();
        bike_list.add("Suzuki");
        bike_list.add("Yamaha");
        bike_list.add("Kawasaki");
        bike_list.add("Ninja");
        System.out.println("*** Bike list ***");
        for (int i = 0; i < bike_list.size(); i++) {
            System.out.println(bike_list.get(i));
        }
    }
}