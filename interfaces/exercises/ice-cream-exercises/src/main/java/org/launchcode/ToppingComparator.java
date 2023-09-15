package org.launchcode;

import java.util.Comparator;

public class ToppingComparator implements Comparator<Topping> {
    @Override
    public int compare(Topping topping1, Topping topping2) {
        if (topping1.getCost() - topping2.getCost() < 0) {
            return 1;
        } else if (topping1.getCost() - topping2.getCost() > 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
