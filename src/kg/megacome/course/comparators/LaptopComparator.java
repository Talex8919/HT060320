package kg.megacome.course.comparators;

import kg.megacome.course.electronics.Laptops;

import java.util.Comparator;

public class LaptopComparator implements Comparator<Laptops> {
    @Override
    public int compare(Laptops o1, Laptops o2) {
        if (o2.getHowManyItWasFixed() == o1.getHowManyItWasFixed()) {
            return 0;
        }
        if (o2.getHowManyItWasFixed() > o1.getHowManyItWasFixed()) {
        return 1;
    }
        return  -1;
        }

    }


