package cat143;

import java.util.Scanner;

public class G01 {
    
    private String userName;
    private int mod;
    
    public G01 (String name, int modNum) {
        userName = name;
        mod = modNum;
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
    
    public void productDiscount(){
        //Receives: Paid Price, Price
        //Returns: Off
        System.out.println("G01 - E01");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        float paidPrice, price, discounted;
        
        System.out.printf("Price: ");
        price = input.nextFloat();
        
        System.out.printf("\nPaid: ");
        paidPrice = input.nextFloat();
        
        discounted = ((price / 100) * paidPrice);
        System.out.printf("\nTotal discount of %.2f was %.2f %%OFF\n",
                price, discounted);
    }
    
    public void mathOps(){
        //Receives: Two Values
        //Returns: Addition, Substraction, Multiplication and Division
        //of the two specified values
        System.out.println("G01 - E02");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        int val, val1;
        float add, sub, mul, div;
        
        System.out.print("Value 1: ");
        val = input.nextInt();
        
        System.out.print("Value 2: ");
        val1 = input.nextInt();
        
        System.out.println("Results: ");
        
        add = (float) val + val1;
        System.out.printf("Addition: %d + %d = %.2f\n",
                val, val1, add);
        
        if (val > val1){
            sub = (float) val - val1;
            System.out.printf("Substraction: %d - %d = %.2f\n",
                    val, val1, sub);
            mul = (float) val * val1;
            System.out.printf("Multiplication: %d * %d = %.2f\n",
                    val, val1, mul);
            div = (float) val / val1;
            System.out.printf("Division: %d / %d = %.2f\n",
                    val, val1, div);
        } else {
            sub = (float) val1 - val;
            System.out.printf("Substraction: %d - %d = %.2f\n",
                    val1, val, sub);
            mul = (float) val * val1;
            System.out.printf("Multiplication: %d * %d = %.2f\n",
                    val, val1, mul);
            div = (float) val1 - val;
            System.out.printf("Division: %d / %d = %.2f\n",
                    val1, val, div);
        }
    }
    
    public void triangleRectangle(){
        //Receives: Base and Height
        //Returns: Triangle Rectangle's perimeter
        System.out.println("G01 - E03");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        float base, height, perimeter;
        
        System.out.print("Base: ");
        base = input.nextFloat();
        
        System.out.print("Height: ");
        height = input.nextFloat();
        
        perimeter = base * height;
        System.out.println("Triangle Rectangle Perimeter is: " + perimeter);
    }
    
    public void cmToInch(){
        //Receives: Float Centimeter
        //Returns: Float Inch
        System.out.println("G01 - E04");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        float cm, INCH;
        
        System.out.print("Centimeter: ");
        cm = input.nextFloat();
        
        INCH = (float) (cm * 2.54);
        System.out.printf("%f cm <-> %f inch\n",
                cm, INCH);        
    }
    
    public void circle(){
        //Receives: radio
        //Returns: perimeter, diameter
        System.out.println("G01 - E05");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        float radio, perimeter, diameter;
        
        System.out.print("Circle Radio: ");
        radio = input.nextFloat();
        
        perimeter = (float) ((Math.pow(radio, 2)) * (Math.PI));
        diameter = (float) ((radio * 2) * (Math.PI));
        
        System.out.printf("A %.2f circle radio\n Perimeter: %.2f cm\n Diameter: %.2f\n",
                radio, perimeter, diameter);
    }
    
    public void cilinder(){
        //Receives: baseRadio, height
        //Returns: area, volume
        System.out.println("G01 - E06");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        float baseRadio, height, baseArea, area, volume;
        
        System.out.print("Cilinder Base Radio: ");
        baseRadio = input.nextFloat();
        
        System.out.print("Cilinder Height: ");
        height = input.nextFloat();
        
        area = (float) (Math.PI * Math.pow(baseRadio, 2));
        volume = (float) ((Math.PI * Math.pow(baseRadio, 2)) * height);
        
        System.out.println("Cilinder: ");
        System.out.printf("Radio: %.2f\n", baseRadio);
        System.out.printf("Height: %.2f\n", height);
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Volumne: %.2f\n", volume);
    }
    
    public void pitagoras(){
        //Receives adjacentLeg, oppositeLeg
        //Returns hypotenuse
        System.out.println("G01 - E07");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        float adj, opp, hyp;
        
        System.out.print("Adjcent Leg: ");
        adj = input.nextFloat();
        
        System.out.print("Opposite Leg: ");
        opp = input.nextFloat();
        
        hyp = (float) Math.sqrt((Math.pow(opp, 2)) + (Math.pow(adj, 2)));
        
        System.out.printf("Hypotenuse is %.2f for a Triangle Rectangle with values: \n"
                + "Adjacent Leg: %.2f \n"
                + "Opposite Leg: %.2f \n", hyp, adj, opp);
    }
    
    public void timeConverter(){
        //Receives secs
        //Returns mins + secs
        System.out.println("G01 - E08 - FINAL");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        int secs, hours, remainder, mins, val;
        
        System.out.print("Seconds: ");
        val = input.nextInt();
        
        hours = val / 3600;
        remainder = val - hours * 3600;
        mins = remainder / 60;
        remainder = remainder - mins * 60;
        secs = remainder;
        
        System.out.printf("%d:%d:%d",
                hours, mins, secs);
    }
}
