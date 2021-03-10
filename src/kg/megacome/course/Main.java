package kg.megacome.course;

import kg.megacome.course.comparators.LaptopComparator;
import kg.megacome.course.comparators.LcdMoniorsComparator;
import kg.megacome.course.comparators.SmartPhonesComparator;
import kg.megacome.course.electronics.Laptops;
import kg.megacome.course.electronics.LcdMonitor;
import kg.megacome.course.electronics.SmartPhones;
import kg.megacome.course.enums.TypeOfUrgency;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        LocalDate lenovoIdeaStartDateW= LocalDate.parse("2020-10-15");
        LocalDate lenovoIdeaEndDateW= LocalDate.parse("2021-10-15");
        Period lenovoPer= Period.between(lenovoIdeaStartDateW,lenovoIdeaEndDateW);

        LocalDate lenovoLegStartDateW= LocalDate.parse("2020-12-16");
        LocalDate lenovoLegEndDateW= LocalDate.parse("2021-12-16");
        Period lenovoLegPer= Period.between(lenovoLegStartDateW,lenovoLegEndDateW);

        LocalDate hpElitStartDateW= LocalDate.parse("2020-01-26");
        LocalDate hpElitEndDateW= LocalDate.parse("2021-01-26");
        Period hpElitPer= Period.between(hpElitStartDateW,hpElitEndDateW);

        LocalDate acerPredStartDateW= LocalDate.parse("2020-02-24");
        LocalDate acerPredEndDateW= LocalDate.parse("2021-01-24");
        Period acerPredPer= Period.between(acerPredStartDateW,acerPredEndDateW);

        LocalDate samsungGalaxStartDateW= LocalDate.parse("2020-03-19");
        LocalDate samsungGalaxEndDateW= LocalDate.parse("2021-03-19");
        Period samsungGalaxPer= Period.between(samsungGalaxStartDateW,samsungGalaxEndDateW);

        LocalDate samsungIonStartDateW= LocalDate.parse("2020-04-09");
        LocalDate samsungIonEndDateW= LocalDate.parse("2021-04-09");
        Period samsungIonPer= Period.between(samsungIonStartDateW,samsungIonEndDateW);

        LocalDate razerBladeStartDateW= LocalDate.parse("2020-05-26");
        LocalDate razerBladeEndDateW= LocalDate.parse("2021-05-26");
        Period razerBladePer= Period.between(razerBladeStartDateW,razerBladeEndDateW);

        LocalDate razerTomahawkStartDateW= LocalDate.parse("2020-07-26");
        LocalDate razerTomahawkEndDateW= LocalDate.parse("2021-07-26");
        Period razerTomahawkPer= Period.between(razerTomahawkStartDateW,razerTomahawkEndDateW);

        LocalDate msiLeoStartDateW= LocalDate.parse("2020-08-26");
        LocalDate msiLeoEndDateW= LocalDate.parse("2021-08-26");
        Period msiLeoPer= Period.between(msiLeoStartDateW,msiLeoEndDateW);

        LocalDate msiRaiderStartDateW= LocalDate.parse("2020-11-26");
        LocalDate msiRaiderEndDateW= LocalDate.parse("2021-11-26");
        Period msiRaiderPer= Period.between(msiRaiderStartDateW,msiRaiderEndDateW);


        Laptops lenovoIdea= new Laptops("Lenovo","Idea Pad ","ge2AzNpU",lenovoPer,true,8,"Viruses", TypeOfUrgency.NOT_URGENT);
        Laptops lenovoLegion = new Laptops("Lenovo", "Legion ","ue4DjGZY ",lenovoLegPer,false,2,"Slow Performance",TypeOfUrgency.SUPER_URGENT);
        Laptops hpElitBook = new Laptops("HP ", "Elite Booke", "Lg2iSJqg",hpElitPer,false,3,"Service Cleaning",TypeOfUrgency.URGENT);
        Laptops acerPredator = new Laptops("Acer", "Predator", "bjZLnDxQ",acerPredPer, true,9,"Windows was deleted",TypeOfUrgency.NOT_URGENT);
        Laptops samsungGalaxy = new Laptops("Samsung", "Galaxy Book Flex", "LkXYMxpb",samsungGalaxPer,false,1,"Blue Screen",TypeOfUrgency.URGENT);
        Laptops  samsungIon= new Laptops("Samsung","Ion","p5G3Sq8S",samsungIonPer,false,13,"Low Performances" ,TypeOfUrgency.SUPER_URGENT);
        Laptops  razerBlade = new Laptops("Razer","Blade", "5xp3K4cL",razerBladePer,false,5,"Blue Screen",TypeOfUrgency.NOT_URGENT);
        Laptops  razerTomahawk= new Laptops("Razer","Tomahawk","5xp3K4cL",razerTomahawkPer,false,1,"Error 254851",TypeOfUrgency.NOT_URGENT);
        Laptops msiLeopard= new Laptops("MSI","Leopard","ZdMDPX4h",msiLeoPer,true,5,"Error 2548562",TypeOfUrgency.NOT_URGENT );
        Laptops msiRaider = new Laptops("MSI","Raider","dNeJEtqY",msiRaiderPer, false,7,"Error 25474163",TypeOfUrgency.URGENT);



        LocalDate benq24StartW= LocalDate.parse("2021-01-26");
        LocalDate benq24EndDateW= LocalDate.parse("2022-01-26");
        Period benq24Per= Period.between(benq24StartW,benq24EndDateW);

        LocalDate asusProArtStartDateW= LocalDate.parse("2021-02-26");
        LocalDate asusProArtEndDateW= LocalDate.parse("2022-02-26");
        Period asusProArtPer= Period.between(asusProArtStartDateW,asusProArtEndDateW);

        LocalDate asusZemScreemStartDateW= LocalDate.parse("2021-11-26");
        LocalDate asusZemScreemEndDateW= LocalDate.parse("2022-11-26");
        Period asusZemScreemPer= Period.between(asusZemScreemStartDateW,asusZemScreemEndDateW);

        LocalDate viewSonuicStartDateW= LocalDate.parse("2020-11-26");
        LocalDate viewSonuicEndDateW= LocalDate.parse("2021-11-26");
        Period viewSonuicPer= Period.between(viewSonuicStartDateW,viewSonuicEndDateW);

        LocalDate dellUltraShStartDateW= LocalDate.parse("2021-11-26");
        LocalDate dellUltraShEndDateW= LocalDate.parse("2022-11-26");
        Period dellUltraShPer= Period.between(dellUltraShStartDateW,dellUltraShEndDateW);

        LocalDate dellP24StartDateW= LocalDate.parse("2021-11-26");
        LocalDate dellP24EndDateW= LocalDate.parse("2022-11-26");
        Period dellP24Per= Period.between(dellP24StartDateW,dellP24EndDateW);

        LocalDate philipsTigerStartDateW= LocalDate.parse("2020-11-26");
        LocalDate philipsTigerEndDateW= LocalDate.parse("2021-11-26");
        Period philipsTigerPer= Period.between(philipsTigerStartDateW,philipsTigerEndDateW);

        LocalDate samsungUjkStartDateW= LocalDate.parse("2020-11-26");
        LocalDate samsungUjkEndDateW= LocalDate.parse("2021-11-26");
        Period samsungUjkPer= Period.between(samsungUjkStartDateW,samsungUjkEndDateW);

        LocalDate acerXfaStartDateW= LocalDate.parse("2020-02-21");
        LocalDate acerXfaEndDateW= LocalDate.parse("2021-02-21");
        Period acerXfaPer= Period.between(acerXfaStartDateW,acerXfaEndDateW);

        LocalDate hpPavilionStartDateW= LocalDate.parse("2021-01-26");
        LocalDate hpPavilionEndDateW= LocalDate.parse("2022-11-26");
        Period hpPavilionPer= Period.between(hpPavilionStartDateW,hpPavilionEndDateW);



        LcdMonitor benq24= new LcdMonitor("Benq","24","XvxiWdme",benq24Per,false,5,"Errore2585456",TypeOfUrgency.SUPER_URGENT);
        LcdMonitor asusProArt= new LcdMonitor("Asus", "Pro Art","Q5rhdd3Q",asusProArtPer,true,2,"ERROR 25854752",TypeOfUrgency.NOT_URGENT);
        LcdMonitor asusZenScreen= new LcdMonitor("Asus", "Zen Screen","3gk6ZMnF",asusZemScreemPer,false, 8,"Error25845934",TypeOfUrgency.NOT_URGENT);
        LcdMonitor viewSonicVx= new LcdMonitor("View","Sonic","gu7HknS6",viewSonuicPer,false,3,"Error 258554552",TypeOfUrgency.SUPER_URGENT);
        LcdMonitor dellUltraSh= new LcdMonitor("Dell","Ultra Shell","6EXmKPqC",dellUltraShPer,true,1,"Error 24856931",TypeOfUrgency.URGENT);
        LcdMonitor dellP24= new LcdMonitor("Dell", "P24","RaHEuydx",dellP24Per,false, 9, "Error 2144785",TypeOfUrgency.SUPER_URGENT);
        LcdMonitor philipsTiger= new LcdMonitor("Philips","Tiger","BBKLh6Dk",philipsTigerPer,true, 2,"Error 4859632",TypeOfUrgency.NOT_URGENT);
        LcdMonitor samsungUjk= new LcdMonitor("Samsung","Ujk","vBmaQswE",samsungUjkPer, true, 5,"Error 856322412",TypeOfUrgency.NOT_URGENT);
        LcdMonitor acerXfa= new LcdMonitor("Acer","XFA","5fRbJr56",acerXfaPer, false, 5,"Error 2963696",TypeOfUrgency.URGENT);
        LcdMonitor hpPavilion= new LcdMonitor("HP","Pavillion","62tNqqBZ",hpPavilionPer, true, 7, " Error 85858741",TypeOfUrgency.SUPER_URGENT);
        LcdMonitor acerXfas= new LcdMonitor("Acer","XFA500","5fRbJr56",acerXfaPer, false, 5,"Error 2963696",TypeOfUrgency.URGENT);
        LcdMonitor hpPavilion500= new LcdMonitor("HP","Pavillion 500","62tNqqBZ",hpPavilionPer, true, 7, " Error 85858741",TypeOfUrgency.SUPER_URGENT);

        LocalDate birdS618StartDateW= LocalDate.parse("2020-11-26");
        LocalDate birdS618EndDateW= LocalDate.parse("2021-11-26");
        Period birdS618Per= Period.between(birdS618StartDateW,birdS618EndDateW);

        LocalDate birdM32StartDateW= LocalDate.parse("2021-11-26");
        LocalDate birdM32EndDateW= LocalDate.parse("2022-11-26");
        Period birdM32Per= Period.between(birdM32StartDateW,birdM32EndDateW);

        LocalDate emporiaGlamStartW= LocalDate.parse("2021-01-26");
        LocalDate emporiaGlamEndDateW= LocalDate.parse("2022-01-26");
        Period emporiaGlamPer= Period.between(emporiaGlamStartW,emporiaGlamEndDateW);

        LocalDate emporioEssencePlusStartDateW= LocalDate.parse("2020-07-26");
        LocalDate emporioEssencePlusEndDateW= LocalDate.parse("2021-07-26");
        Period emporioEssencePlusPer= Period.between(emporioEssencePlusStartDateW,emporioEssencePlusEndDateW);

        LocalDate huaweiNovaStartDateW= LocalDate.parse("2020-01-26");
        LocalDate huaweiNovaEndDateW= LocalDate.parse("2021-01-26");
        Period huaweiNovaPer= Period.between(huaweiNovaStartDateW,huaweiNovaEndDateW);

        LocalDate huaweiPsmartStartDateW= LocalDate.parse("2020-02-24");
        LocalDate huaweiPsmartEndDateW= LocalDate.parse("2021-01-24");
        Period huaweiPsmartPer= Period.between(huaweiPsmartStartDateW,huaweiPsmartEndDateW);

        LocalDate microsoftDoubleStartDateW= LocalDate.parse("2020-11-26");
        LocalDate microsoftDoubleEndDateW= LocalDate.parse("2021-11-26");
        Period microsoftDoublePer= Period.between(microsoftDoubleStartDateW,microsoftDoubleEndDateW);

        LocalDate microsoftLumiaStartDateW= LocalDate.parse("2021-11-26");
        LocalDate microsoftLumiaEndDateW= LocalDate.parse("2022-11-26");
        Period microsoftLumiaPer= Period.between(microsoftLumiaStartDateW,microsoftLumiaEndDateW);

        LocalDate prestigioMultiPadStartDateW= LocalDate.parse("2020-07-26");
        LocalDate prestigioMultiPadkEndDateW= LocalDate.parse("2021-07-26");
        Period prestigioMultiPadPer= Period.between(prestigioMultiPadStartDateW,prestigioMultiPadkEndDateW);


        LocalDate prestigioMulti85963StartDateW= LocalDate.parse("2020-05-26");
        LocalDate prestigioMulti85963EndDateW= LocalDate.parse("2021-05-26");
        Period prestigioMulti85963Per= Period.between(prestigioMulti85963StartDateW,prestigioMulti85963EndDateW);

        SmartPhones birdS618= new SmartPhones("Bird","S618","MbwqUh3P",birdS618Per,true,2,"Error 8575952",TypeOfUrgency.URGENT );
SmartPhones birdM32= new SmartPhones("Bird","M32","RGAjYTxV",birdM32Per, false,9,"Error 25741693",TypeOfUrgency.NOT_URGENT);
   SmartPhones emporiaGlam= new SmartPhones("Emporia", "Glam","tpWguhtE",emporiaGlamPer,false,5,"Erorr 25858545",TypeOfUrgency.NOT_URGENT);
SmartPhones emporioEssencePlus=new SmartPhones("Emporio","Essence Plus","BzkCXNtW", emporioEssencePlusPer,true,1,"Error 24834685",TypeOfUrgency.SUPER_URGENT);
SmartPhones huaweiNova = new SmartPhones("Huawei","Nova","qgwc7jxX",huaweiNovaPer,true,3,"Error 8574961",TypeOfUrgency.SUPER_URGENT);
    SmartPhones huaweiPsmart= new SmartPhones("Huawei", "P Smart","2see7ccH",huaweiPsmartPer,false,9,"Error 2574652",TypeOfUrgency.URGENT);
    SmartPhones microsoftDouble = new SmartPhones("Huawei", "Double", "HkiAhZ2x", microsoftDoublePer,true,2,"Eroror 857496",TypeOfUrgency.SUPER_URGENT);
SmartPhones microsoftLumia = new SmartPhones("Microsoft", "Lumia", "UHSpUYYm",microsoftLumiaPer,true,5,"Error 998852",TypeOfUrgency.NOT_URGENT);
    SmartPhones prestigioMultiPad= new SmartPhones("Prestigio","Multi Pad","47sMxm8n" ,prestigioMultiPadPer,false,3,"Error 8541398",TypeOfUrgency.NOT_URGENT);
SmartPhones prestigioMulti85963= new SmartPhones("Prestigio","Multi85963","HksusCt6",prestigioMulti85963Per,true,5,"Error 858596",TypeOfUrgency.URGENT);

        ArrayList<Laptops>laptopsArrayList= new ArrayList<>();
        laptopsArrayList.add(lenovoIdea);
        laptopsArrayList.add(hpElitBook);
        laptopsArrayList.add(lenovoLegion);
        laptopsArrayList.add(acerPredator);
        laptopsArrayList.add(samsungGalaxy);
        laptopsArrayList.add(samsungIon);
        laptopsArrayList.add(razerBlade);
        laptopsArrayList.add(razerTomahawk);
        laptopsArrayList.add(msiLeopard);
        laptopsArrayList.add(msiRaider);

        ArrayList<LcdMonitor>monitors= new ArrayList<>();
        monitors.add(benq24);
        monitors.add(asusProArt);
        monitors.add(asusZenScreen);
        monitors.add(viewSonicVx);
        monitors.add(dellUltraSh);
        monitors.add(dellP24);
        monitors.add(philipsTiger);
        monitors.add(samsungUjk);
        monitors.add(acerXfa);
        monitors.add(hpPavilion);




        PriorityQueue<Laptops>laptopsPriorityQueue= new PriorityQueue<>(new LaptopComparator());

        laptopsPriorityQueue.add(lenovoIdea);
        laptopsPriorityQueue.add(hpElitBook);
        laptopsPriorityQueue.add(lenovoLegion);
        laptopsPriorityQueue.add(acerPredator);
        laptopsPriorityQueue.add(samsungGalaxy);
        laptopsPriorityQueue.add(samsungIon);
        laptopsPriorityQueue.add(razerBlade);
        laptopsPriorityQueue.add(razerTomahawk);
        laptopsPriorityQueue.add(msiLeopard);
        laptopsPriorityQueue.add(msiRaider);
        System.out.println(" _______________Sorting Laptops  by amount of  fixing");
        while(!laptopsPriorityQueue.isEmpty()) {
            assert laptopsPriorityQueue.peek() != null;
            assert laptopsPriorityQueue.peek() != null;
            System.out.println(laptopsPriorityQueue.peek().getHowManyItWasFixed()+" Amount of repairing " +" The Brand "+ laptopsPriorityQueue.peek().getBrandName()+" "+
                    laptopsPriorityQueue.peek().getNameOfGoods()+" name of  the product " +" ,Serial number: "+ Objects.requireNonNull(laptopsPriorityQueue.poll()).getSerialNumber());
        }


        ArrayDeque<LcdMonitor>lcdMonitorArrayDeque= new ArrayDeque<>( );
        lcdMonitorArrayDeque.add(benq24);
        lcdMonitorArrayDeque.add(asusProArt);
        lcdMonitorArrayDeque.add(asusZenScreen);
        lcdMonitorArrayDeque.add(viewSonicVx);
        lcdMonitorArrayDeque.add(dellUltraSh);
        lcdMonitorArrayDeque.add(dellP24);
        lcdMonitorArrayDeque.add(philipsTiger);
        lcdMonitorArrayDeque.add(samsungUjk);
        lcdMonitorArrayDeque.add(acerXfa);
        lcdMonitorArrayDeque.add(hpPavilion);
        System.out.println("__________Print before addFirst &addLast ");
        lcdMonitorArrayDeque.forEach(System.out::println);
lcdMonitorArrayDeque.addFirst(acerXfas);
lcdMonitorArrayDeque.addLast(hpPavilion500);
        System.out.println("_________Print after addFirst &addLast ");
        lcdMonitorArrayDeque.forEach(System.out::println);
        System.out.println("___________________________ Sorting  LCD Monitors by Name of goods");
Collections.sort(monitors, new LcdMoniorsComparator()) ;
            for (LcdMonitor lcdModel : monitors) {
                System.out.println(lcdModel.getNameOfGoods() + " - is the model name " + ", Brand name:  " + lcdModel.getBrandName()
                        + ", Level of Urgency : " + lcdModel.getLcdType() + ", SerialNumber " + lcdModel.getSerialNumber());
            }



        ArrayList<SmartPhones>smartPhonesArrayList= new ArrayList<>();
        smartPhonesArrayList.add(birdM32);
        smartPhonesArrayList.add(birdS618);
        smartPhonesArrayList.add(emporiaGlam);
        smartPhonesArrayList.add(emporioEssencePlus);
        smartPhonesArrayList.add(huaweiNova);
        smartPhonesArrayList.add(huaweiPsmart);
        smartPhonesArrayList.add(microsoftDouble);
        smartPhonesArrayList.add(microsoftLumia);
        smartPhonesArrayList.add(prestigioMultiPad);
        smartPhonesArrayList.add(prestigioMulti85963);

        System.out.println("___sorting  by boolean is a client from corporation ");
        PriorityQueue<SmartPhones>smartPhonesPriorityQueue= new PriorityQueue<>(new SmartPhonesComparator()) ;
        smartPhonesPriorityQueue.add(birdM32);
        smartPhonesPriorityQueue.add(birdS618);
        smartPhonesPriorityQueue.add(emporiaGlam);
        smartPhonesPriorityQueue.add(emporioEssencePlus);
        smartPhonesPriorityQueue.add(huaweiNova);
        smartPhonesPriorityQueue.add(huaweiPsmart);
        smartPhonesPriorityQueue.add(microsoftDouble);
        smartPhonesPriorityQueue.add(microsoftLumia);
        smartPhonesPriorityQueue.add(prestigioMultiPad);
        smartPhonesPriorityQueue.add(prestigioMulti85963);
        while(!smartPhonesPriorityQueue.isEmpty()){
            assert smartPhonesPriorityQueue.peek() != null;
            assert smartPhonesPriorityQueue.peek() != null;
            assert smartPhonesPriorityQueue.peek() != null;
            assert smartPhonesPriorityQueue.peek() != null;

            assert smartPhonesPriorityQueue.peek() != null;
            assert smartPhonesPriorityQueue.peek() != null;
            assert smartPhonesPriorityQueue.peek() != null;
            System.out.println(smartPhonesPriorityQueue.peek().isCorporateClient() + " - is a client from enterprise "
                    + ", brand name: "+smartPhonesPriorityQueue.peek().getBrandName()+ ", model name:  "+
                     smartPhonesPriorityQueue.peek().getNameOfGoods() +", level of urgency: " +smartPhonesPriorityQueue.peek().getSmartPhonesT() +"" +
                    ", Serial Number of it: "+ Objects.requireNonNull(smartPhonesPriorityQueue.poll()).getSerialNumber());
        }


        
        }


    }




