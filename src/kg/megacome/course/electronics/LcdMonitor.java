package kg.megacome.course.electronics;

import kg.megacome.course.enums.TypeOfUrgency;

import java.time.Period;

public class LcdMonitor extends Devices {
    private TypeOfUrgency lcdType;

    public TypeOfUrgency getLcdType() {
        return lcdType;
    }

    public void setLcdType(TypeOfUrgency lcdType) {
        this.lcdType = lcdType;
    }

    public LcdMonitor(String brandName, String nameOfGoods, String serialNumber, Period warranty, boolean isCorporateClient, int howManyItWasFixed, String issueOf, TypeOfUrgency lcdType) {
        super(brandName, nameOfGoods, serialNumber, warranty, isCorporateClient, howManyItWasFixed, issueOf);
   this.lcdType=lcdType;
    }

}
