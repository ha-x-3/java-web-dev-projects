package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        System.out.println(flavors);
        flavors.sort(new FlavorComparator());
        System.out.println(flavors);
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        System.out.println(cones);
        cones.sort(new ConeComparator());
        System.out.println(cones);

        // TODO: Use a Comparator class to sort the 'toppings' array in increasing order by the 'cost' field.
        System.out.println(toppings);
        toppings.sort(new ToppingComparator());
        System.out.println(toppings);
    }

}