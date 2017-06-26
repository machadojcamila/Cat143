package cat143;

import javax.swing.JOptionPane;

public class AC01POO {
    
    JOptionPane dInput = new JOptionPane();
    
    public static void UsoDeFor() {
        System.out.println("Hola");
        System.out.println("Adios");
        System.out.println("Chau");
        for (int i = 0; i < 6; /*Step By*/ i++){
            System.out.print(i + " ");
            System.out.println("Program Ends");
        }
    }
    
    public static void assignVar(){
        
        Integer num1 = new Integer(125);
        Integer num2 = new Integer(20);
        
        int n1 = num1.intValue();
        System.out.println(n1);
        
        int n2 = num2.intValue();
        System.out.println(n2);
               
        System.out.printf("Sum of: %d + %d = %d\n",
                n1, n2, (n1 + n2));
        
        if (n1 + n2 > 130){
            n1++;
        } else {
            n1--;
        }
        System.out.println(n1);
    }
    
    public static void numTexto(){
        
        int num1 = 12;
        String numText = "125";
        
        int num2 = Integer.parseInt(numText);
        
        System.out.println(num1 + num2);
        
        if (num1 + num2 > 110){
            num1++;
        } else {
            num1--;
        }
        
        System.out.println(num1);
    }
    
    public static void numBinario(){
        
        String numBinary = "101111";
        String numOctal = "57";
        String numHexadecimal = "2F";
        String numFloat = "47";
        
        System.out.println(Integer.parseInt(numBinary,2));
        System.out.println(Integer.parseInt(numOctal, 8));
        System.out.println(Integer.parseInt(numHexadecimal, 16));
        System.out.println(Integer.parseInt(numFloat, 10));
    }
    
    public void uno(){
        
        String uno = dInput.showInputDialog(null, "Input your Number", "Number", 1);
        int n1;
        
        n1 = Integer.parseInt(uno);
        dInput.showMessageDialog(null, "Hexadecimal: " + Integer.toHexString(n1), "Hexadecimal", 1);
        dInput.showMessageDialog(null, "Binary: " + Integer.toBinaryString(n1), "Binary", 2);
        dInput.showMessageDialog(null, "Octa: " + Integer.toOctalString(n1), "Octa", 3);
        System.exit(0);
    }
    
    public void finalActivity(){
        //Receives: Initial Value and Final Value
        //Returns: Shows values from initial to final
        int initValue, finlValue, count;
        
        count = 0;
        
        String initial = dInput.showInputDialog(null, "Initial Value: ", "Number", 1);
        String finalV = dInput.showInputDialog(null, "Final Value: ", "Number", 1);
        
        initValue = Integer.parseInt(initial);
        finlValue = Integer.parseInt(finalV);
        
        for (int i = initValue; i <= finlValue; i++){
            System.out.println(i);
            count++;
        }
        
        String totalNumbers = "Total Numbers: " + count;
        dInput.showMessageDialog(null, totalNumbers, "Totals", 2);
    }
}
