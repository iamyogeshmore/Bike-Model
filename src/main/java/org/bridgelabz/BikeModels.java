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
        ArrayList<String> oldModel = new ArrayList<String>();
        oldModel.add("TVS");
        oldModel.add("Hero");
        oldModel.add("Honda");
        bike_list.addAll(oldModel);
        System.out.println("New size of the bike list is :" + bike_list.size());
        System.out.println("*** Bike list with old model ***");
        for (int i = 0; i < oldModel.size(); i++) {
            System.out.println(bike_list.get(i));
        }
        bike_list.addAll(oldModel);
        System.out.println("Combine bike model list: " + bike_list);
    }
}