package kg.megacome.course.electronics;


import kg.megacome.course.enums.TypeOfUrgency;

import java.time.Period;

public class SmartPhones  extends Devices{
    private TypeOfUrgency smartPhonesT;

    public TypeOfUrgency getSmartPhonesT() {
        return smartPhonesT;
    }

    public void setSmartPhonesT(TypeOfUrgency smartPhonesT) {
        this.smartPhonesT = smartPhonesT;
    }

    public SmartPhones(String brandName, String nameOfGoods, String serialNumber, Period warranty, boolean isCorporateClient, int howManyItWasFixed, String issueOf, TypeOfUrgency smartPhonesT) {
        super(brandName, nameOfGoods, serialNumber, warranty, isCorporateClient, howManyItWasFixed, issueOf);
        this.smartPhonesT=smartPhonesT;
    }
}
