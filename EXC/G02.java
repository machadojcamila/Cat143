package cat143;

import java.util.Scanner;

public class G02 {
    
    private String userName;
    private int mod;
    
    public G02(String name, int modNum) {
        userName = name; // !important
        mod = modNum; //!importat
    }
    
    public void setUserName(String name){
        userName = name;
    }
    
    public String getUserName(){
        return userName;
    }
    
    public void setMod(int modNum){
        mod = modNum;
    }
    
    public int getMod(){
        return mod;
    }
    
    Scanner input = new Scanner(System.in);
    
    public void rectangleArea(){
        //Receives: Base and Height
        //Returns: Area
        System.out.println("G02 - E01");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        int base, height, area;
        
        System.out.print("Base: ");
        base = input.nextInt();
        
        System.out.print("Height: ");
        height = input.nextInt();
        
        
        area = base * height;
        
        System.out.printf("A Rectangle: \n Base: %d\n Height: %d\n Perimeter: %d\n",
                base, height, area);
    }
    
    public void squareArea(){
        //Receives: Side
        //Returns: perimeter
        System.out.println("G02 - E02");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        int side, perimeter;
        
        System.out.print("Side: ");
        side = input.nextInt();
        
        perimeter = side * side;
        System.out.printf("A Square: \n Side: %d\n Perimeter: %d\n",
                side, perimeter);
    }
    
    
}
