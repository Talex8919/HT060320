package kg.megacome.course.electronics;

import kg.megacome.course.enums.TypeOfUrgency;


import java.time.Period;

public class Laptops extends Devices {
    private TypeOfUrgency LaptopType;

    public TypeOfUrgency getLaptopType() {
        return LaptopType;
    }

    public void setLaptopType(TypeOfUrgency laptopType) {
        LaptopType = laptopType;
    }

    public Laptops(String brandName, String nameOfGoods, String serialNumber, Period warranty, boolean isCorporateClient, int howManyItWasFixed, String issueOf, TypeOfUrgency laptopType) {
        super(brandName, nameOfGoods, serialNumber, warranty, isCorporateClient, howManyItWasFixed, issueOf);
   this.LaptopType=laptopType;
    }

}
