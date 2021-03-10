package kg.megacome.course.electronics;

import java.time.Period;

public abstract class Devices {
    private String brandName;
    private String nameOfGoods;
    private String serialNumber;
    private Period warranty;
    private boolean isCorporateClient;
    private int howManyItWasFixed;
    private String issueOf;

    public Devices(String brandName, String nameOfGoods, String serialNumber, Period warranty, boolean isCorporateClient, int howManyItWasFixed, String issueOf) {
        this.brandName = brandName;
        this.nameOfGoods = nameOfGoods;
        this.serialNumber = serialNumber;
        this.warranty = warranty;
        this.isCorporateClient = isCorporateClient;
        this.howManyItWasFixed = howManyItWasFixed;
        this.issueOf = issueOf;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getNameOfGoods() {
        return nameOfGoods;
    }

    public void setNameOfGoods(String nameOfGoods) {
        this.nameOfGoods = nameOfGoods;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Period getWarranty() {
        return warranty;
    }

    public void setWarranty(Period warranty) {
        this.warranty = warranty;
    }

    public boolean isCorporateClient() {
        return isCorporateClient;
    }

    public void setCorporateClient(boolean corporateClient) {
        isCorporateClient = corporateClient;
    }

    public int getHowManyItWasFixed() {
        return howManyItWasFixed;
    }

    public void setHowManyItWasFixed(int howManyItWasFixed) {
        this.howManyItWasFixed = howManyItWasFixed;
    }

    public String getIssueOf() {
        return issueOf;
    }

    public void setIssueOf(String issueOf) {
        this.issueOf = issueOf;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "brandName='" + brandName + '\'' +
                ", nameOfGoods='" + nameOfGoods + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", warranty=" + warranty +
                ", isCorporateClient=" + isCorporateClient +
                ", howManyItWasFixed=" + howManyItWasFixed +
                ", issueOf='" + issueOf + '\'' +
                '}';
    }
}
