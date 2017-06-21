package airways;

import java.util.Scanner;

public class Travel {
    
    private int kms;
    private int price;
    private int height;
    private String place;

    Scanner input = new Scanner(System.in);

    public void setKms(int travelKm){
        kms = travelKm;
    }

    public int getKms(){
        return kms;
    }
    
    public void setPrice(int travelPrice){
        price = travelPrice;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setHeight(int travelHeight){
        height = travelHeight;
    }
    
    public int getHeight(){
        return height;
    }
    
    public void setPlace(String travelPlace){
        place = travelPlace;
    }
    
    public String getPlace(){
        return place;
    }
    
    public void selectDestiny(){
        int option;
        String place;
        System.out.print("1. Los Angeles\n2. Brazil\n3. Italy\n4. Venezuela\nSelection: ");
        option = input.nextInt();
        switch (option) {
            case 1:
                place = "Los Angeles";
                setPlace(place);
                setKms(800);
                setHeight(2000);
                break;
            case 2:
                place = "Brazil";
                setPlace(place);
                setKms(320);
                setHeight(1200);
                break;
            case 3:
                place = "Italy";
                setPlace(place);
                setKms(1010);
                setHeight(3400);
                break;
            case 4:
                place = "Venezuela";
                setPlace(place);
                setKms(150);
                setHeight(900);
                break;
            default:
                System.out.println("ERROR");
        }
    }
    
    public void budget(){
        int tHeight, tDistance, tPrice, totalBudget;
        tHeight = getHeight();
        tDistance = getKms();
        tPrice = (tHeight > 1000)? 700 : 1500;
        totalBudget = (tDistance * tPrice);
        setPrice(totalBudget);
        System.out.printf("Destination: %s\nDistance: %d\nHeight: %d\nPrice: %d$\n",
                getPlace(), getKms(), getHeight(), getPrice());
    }
    
    public void letsTravel(){
        System.out.println("----------WELCOME TO AIR BS----------");
        System.out.println("SET A TRAVEL: ");
        System.out.println("A. Select Destiny: ");
        selectDestiny();
        System.out.println("B. Budget");
        budget();
        System.out.println("---------THANKS! FOR YOUR TIME!---------");
    }
}
