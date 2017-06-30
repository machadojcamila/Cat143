import java.util.Scanner;
import javax.swing.JOptionPane;

public class BinCalc143v1 {
    
    JOptionPane win = new JOptionPane();
    Scanner input = new Scanner(System.in);
    
    public String toBin(String get){
        int num = Integer.parseInt(get);
        int bin [] = new int [40];
        int i = 0;
        String binNum = "";
        
        while (num > 0){ //till the first number turns into 0
            bin[i++] = num % 2;//gets remainder and add it to array
            num /= 2; //divides to get the next number
        }
        
        for (int o = i - 1; o >= 0; o--){
            binNum += bin[o];
        }
        return binNum;
    }
    
    public void launch(){
        String val, val1, binVal, binVal1;
        
        val = win.showInputDialog(null, "Enter value 1: ", "BINCALC143", 1);
        val1 = win.showInputDialog(null, "Enter value 2: ", "BINCALC143", 1);
        
        binVal = toBin(val);
        binVal1 = toBin(val1);
        
        showEquiv(binVal, val, binVal1, val1);
        
        calc(val, val1);
    }

    private void showEquiv(String binVal, String val, String binVal1, String val1) {
        //Display window showing equivalences between
        //Binary and Integer
        win.showMessageDialog(null, "Values to Binary:\nValue 1: " + val + " <-> " + binVal +
                "\nValue 2: " + val1 + " <-> " + binVal1, "BINCALC143", 1);
    }

    private void calc(String val, String val1) {
        String b1, b2;
        int u1 = Integer.parseInt(val);
        int u2 = Integer.parseInt(val1);
        b1 = toBin(val);
        b2 = toBin(val1);
        
        
        String op = win.showInputDialog(null, "Operation: \n"
                + "1. Addition\n2. Substraction\n3. Multiplication\n4. Division", "BINCALC143", 1);
        
        switch(op) {
            case "1":
                int sum = u1 + u2;
                String sumS = sum + "";
                
                win.showMessageDialog(null, "Addition: \nIntegers: \n" + u1 + " + " + u2
                        + " = " + sum + "\nBinaries: \n" + b1 + " + " + b2 + " = " +
                        toBin(sumS), "BINCALC143", 1);
                break;
                
            case "2":
                int sub = u1 - u2;
                String subS = sub + "";
                win.showMessageDialog(null, "Substraction: \nIntegers: \n" + u1 + " - " + u2
                        + " = " + sub + "\nBinaries: \n" + b1 + " - " + b2 + " = " +
                        toBin(subS), "BINCAL143", 1);
                break;
            
            case "3":
                int mul = u1 * u2;
                String mulS = mul + "";
                win.showMessageDialog(null,"Multiplication: \nIntegers: \n" + u1 + " * " + u2
                        + " = " + mul + "\nBinaries: \n" + b1 + " * " + b2 + " = " +
                        toBin(mulS), "BINCAL143", 1 );
                break;
                
            case "4":
                int div = u1 / u2;
                if (u1 > u2){
                    div = u1 / u2;
                } else {
                    div = u2 / u1;
                }
                
                String divS = div + "";
                win.showMessageDialog(null, "Division: \nIntegers: \n" + u1 + " / " + u2
                        + " = " + div + "\nBinaries: \n" + b1 + " / " + b2 + " = " +
                        toBin(divS));
                break;
        }
    }
}
