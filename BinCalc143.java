package bincalccat143;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class BinCalCat143 {
    
    JOptionPane input = new JOptionPane();
    Scanner in = new Scanner(System.in);
    
    private String name;
    private int com;
    
    public BinCalCat143(String uName, int uCom){
        name = uName;
        com = uCom;
    }
    
    public void setName(String uName){
        name = uName;
    }
    
    public String getName(){
        return name;
    }
    
    public void setCom(int uCom){
        com = uCom;
    }
    
    public int getCom(){
        return com;
    }
    
    public void display(){
        System.out.println("Binary Calculator Cat143");
        System.out.printf("%s - %d\n", getName(), getCom());
    }
        
    public double getValues(double a){
        double vf;
        if (a == 0){
            System.out.print("Enter Value: ");
            vf = in.nextDouble();
            return vf; 
        } else {
            vf = a;
            return a;
        }
    }
    
    public String soBin(double a){//D -> BinStr
        Integer num = new Integer((int) a);
        String b = Integer.toBinaryString(num);
        return b;
    }
    
    public String goBin(String a){//Str -> Doub
        String num = new String(a);
        double b = Double.parseDouble(num);
        Integer toBin = new Integer((int) b);
        String alpha = Integer.toBinaryString(toBin);
        return alpha;
    }
    
    
    
    public void launch(){      
        String a, b, aInt, bInt, op;
        int actOp;
        
        a = input.showInputDialog(null, "Number 1:", "BINCALC-CAT143", 1);
        b = input.showInputDialog(null, "Number 2:", "BINCALC-CAT143", 1);
        
        aInt = goBin(a);
        bInt = goBin(b);
        
        op = input.showInputDialog(null, "Numbers to Binary:\n" +
                a + " = " + aInt + "\n" + b + " = " + bInt + 
                "\nOperations Available: \n1. " + a + " + " + b +
                "\n2. " + a + " - " + b + "\n3. " + a + " * " + b +
                "\n4. " + a + " / " + b, "BINCALC-CAT143", 1);
        
        switch (op){
            case "1":
                Integer al = new Integer(a);
                Integer bl = new Integer(b);                
                actOp = (al + bl);
                
                input.showMessageDialog(null, "Addition\n" + 
                        a + " + " +  b  + " = " + actOp +
                        "\n" + aInt + " + " + bInt + " = " + Integer.toBinaryString(actOp),
                        "BINCALC-CAT143", 1);
                break;
                
            default:
                System.out.println("FAIL");
                break;
        }
    }
    
    
    
}
