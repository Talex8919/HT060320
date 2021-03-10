package kg.megacome.course.comparators;

import kg.megacome.course.electronics.SmartPhones;

import java.util.Comparator;

public class SmartPhonesComparator implements Comparator<SmartPhones> {
    @Override
    public int compare(SmartPhones o1, SmartPhones o2) {
        return Boolean.compare(o2.isCorporateClient(),o1.isCorporateClient());
    }
}
