package org.launchcode;

import java.util.Comparator;

//Sorted by name alphabetically
//public class FlavorComparator implements Comparator<Flavor> {
//
//
//    @Override
//    public int compare(Flavor flavor1, Flavor flavor2) {
//        return flavor1.getName().compareTo(flavor2.getName());
//    }
//}

//Sorted by highest number of allergens to lowest (Bonus)
public class FlavorComparator implements Comparator<Flavor>{

    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {
        if (flavor1.getAllergens().size() - flavor2.getAllergens().size() < 0) {
            return 1;
        } else if (flavor1.getAllergens().size() - flavor2.getAllergens().size() > 0) {
            return -1;
        } else {
            return 0;
        }
    }
}