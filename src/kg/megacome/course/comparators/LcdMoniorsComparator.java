package kg.megacome.course.comparators;

import kg.megacome.course.electronics.LcdMonitor;

import java.util.Comparator;

public class LcdMoniorsComparator implements Comparator<LcdMonitor> {


    @Override
    public int compare(LcdMonitor o1, LcdMonitor o2) {
        return o1.getNameOfGoods().compareTo(o2.getNameOfGoods());
    }


}


