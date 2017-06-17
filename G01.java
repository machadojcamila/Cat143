package cat143;

import java.util.Scanner;

public class G01 {
    
    Scanner input = new Scanner(System.in);
    
    public void productDiscount(){
        //Receives: Paid Price, Price
        //Returns: Off
        System.out.println("G01 - E01");
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
        float radio, perimeter, diameter;
        
        System.out.print("Circle Radio: ");
        radio = input.nextFloat();
        
        perimeter = (float) ((Math.pow(radio, 2)) * (Math.PI));
        diameter = (float) ((radio * 2) * (Math.PI));
        
        System.out.printf("A %.2f circle radio\n Perimeter: %.2f cm\n Diameter: %.2f\n",
                radio, perimeter, diameter);
    }
    
    public void cilindro(){
        System.out.println("G01 - E05");
    }
}
