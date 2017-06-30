import java.util.Scanner;

public class Basic {
    
    Scanner input = new Scanner(System.in);
    
    public Basic(){
        
    }
    
    public void ex01(){
        
        System.out.println("Hello");
        System.out.println("Esteban Borai");
    }
    
    public void ex02(){
        
        System.out.println(74 + 36);
    }
    
    public void ex03(){
        
        System.out.println(50 / 3);
    }
    
    public void ex04(){
        
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 - 3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }
    
    public void ex05(){
        int val, val1, mul;
        
        System.out.println("Input first number: ");
        val = input.nextInt();
        System.out.println("Input second number: ");
        val1 = input.nextInt();
        mul = val * val1;
        System.out.println(mul);
    }
    
    public void ex06(){
        int val, val1, sum, sub, mul, div, mod;
        
        System.out.print("Input first number: ");
        val = input.nextInt();
        System.out.print("Input second number: ");
        val1 = input.nextInt();
        
        sum = val + val1;
        sub = val - val1;
        mul = val * val1;
        div = val / val1;
        mod = val % val1;
        
        System.out.println(val + " + " + val1 + " = " + sum);
        System.out.println(val + " - " + val1 + " = " + sub );
        System.out.println(val + " * " + val1 + " = " + mul);
        System.out.println(val + " / " + val1 + " = " + div);
        System.out.println(val + " % " + val1 + " = " + mod);
        
    }
    
    public void ex07(){
        int num;
        num = 0;
        
        System.out.print("Input a number: ");
        num = input.nextInt();
        
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (i * num));
        }
    }
    
    public void ex08(){
        
        System.out.println("   J    a   v     v  a     ");
        System.out.println("   J   a a   v   v  a a    ");
        System.out.println("J  J  aaaaa   V V  aaaaa   ");
        System.out.println(" JJ  a     a   V  a     a");
    }
    
    public void ex09(){
        
        double num;
        num = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(num);
    }
    
    public void ex10(){
        
        double num;
        num = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(num);
    }
    
    public void ex11(){
        double radius, perimeter, area;
        
        System.out.println("Input circle radius: ");
        radius = input.nextDouble();
        
        perimeter = 2 * Math.PI * radius;
        area =  Math.PI * Math.pow(radius, 2);
        
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
    
    public void ex12(){
        int val, val1, val2, avr;
        
        System.out.println("Input first number: ");
        val = input.nextInt();
        
        System.out.println("Input second number: ");
        val1 = input.nextInt();
        
        System.out.println("Input third number: ");
        val2 = input.nextInt();
        
        avr = ((val + val1 + val2) / 3);
        System.out.println("Average: " + avr);
    }
    
    public void ex13(){
        double height, width, perimeter;
        
        System.out.println("Height: ");
        height = input.nextDouble();
        
        System.out.println("Width: ");
        width = input.nextDouble();
        
        System.out.println("Perimeter: ");
        perimeter = height * width;
        System.out.println(perimeter);
    }
    
    public void ex14(){
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
    }
    
    public void ex15(){
        int val, val1, temp;
        
        System.out.println("Input value one: ");
        val = input.nextInt();
        System.out.println("Input value two: ");
        val1 = input.nextInt();
        System.out.println("Value 1: " + val);
        System.out.println("Value 2: " + val1);
        System.out.println("=================");
        temp = val;
        val = val1;
        val1 = temp;
        System.out.println("S.Value 1: " + val);
        System.out.println("S.Value 2: " + val1);
    }
    
    public void ex16(){
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }
    
    public void ex17(){//FIXTHIS
        long bin, bin1;
        int a = 0, rem = 0, total = 0;
        int [] sum = new int [20];
        
        System.out.println("Input the first binary number: ");
        bin = input.nextLong();
        System.out.println("Input the second binary number: ");
        bin1 = input.nextLong();
        
        while (bin != 0 || bin1 != 0){
            sum[a++] = (int)((bin % 10 + bin1 % 10 + rem) % 2);
            rem = (int) ((bin % 10 + bin1 % 10 + rem) / 2);
            bin /= 10;
            bin1 /= 10;
        }
        
        if (rem != 0){
            sum[a++] = rem;        
        }
        
        a--;
        
        while (a >= 0){
            total = sum[a--];
        }
        
        System.out.printf("%d + %d = %d",
                bin, bin1, total);
    }
    
    public void ex18(){
        long bin, bin1, mul = 0;
        int digit, factor = 1;
        
        System.out.println("Input the first binary number: ");
        bin = input.nextLong();
        System.out.println("Input the second binary number: ");
        bin1 = input.nextLong();
        
        while (bin1 != 0){
            digit = (int)(bin1 % 10);
            if (digit == 1){
                bin *= factor;
                mul = binProduct((int) bin, (int) mul);
            } else {
                bin = bin * factor;
            }
            
            bin1 = bin1 / 10;
            factor = 10;
        }
        
        System.out.printf("%d * %d = %d\n",
                bin, bin1, mul);
    }

    private static int binProduct(int bin, int bin1) {
        
        int a = 0;
        int rem = 0;
        int [] sum = new int[20];
        int binProd = 0;
        
        while (bin != 0 || bin1 != 0){
            sum[a++] = (bin % 10 + bin1 % 10 + rem) % 2;
            rem = (bin % 10 + bin1 % 10 + rem) / 2;
            bin /= 10;
            bin1 /= 10;
        }
        
        if (rem != 0){
            sum[a++] = rem;
        }
        
        --a;
        
        while(a >= 0){
            binProd = binProd * 10 + sum[a--];
        }
        
        return binProd;
    }  
    
    public void ex19(){
        float dNum;
        int rem, var = 0, x = 1, i;
        int bin [] = new int [100];
        
        System.out.println("Input float: ");
        dNum = input.nextFloat();
        
        var = (int) dNum;
        
        while (var != 0){
            bin[x++] = var % 2;
            var /= 2;
        }
        
        System.out.print("Binary form: ");
        for (i = x - 1; i > 0; i--){
            System.out.print(bin[i]);
        }
        System.out.println("\n");
    }
    
    public void ex20(){
        
        final char [] HEX = {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        final int BIT = 8;
        final int BIT_HALF_BYTE = 4;
        final int HALF_BYTE = 0X0F;
        
        System.out.print("Enter value to convert: ");
        int num = input.nextInt();
        
        StringBuilder buildHex = new StringBuilder(BIT);
        buildHex.setLength(BIT);
        
        for (int i = BIT - 1; i >= 0; --i){
            int o = num & HALF_BYTE;
            buildHex.setCharAt(i, HEX[o]);
            num >>= BIT_HALF_BYTE;
        }
        
        System.out.print(buildHex.toString() + "\n");
    }
    
    public void ex31(){
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Env Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
        System.out.println("");
    }
    
    public void ex32(){
        int num, num1;
        System.out.println("Input First Value: ");
        num = input.nextInt();
        System.out.println("Input Second Value: ");
        num1 = input.nextInt();
        
        checkNumbers(num, num1);
        
    }

    private void checkNumbers(int num, int num1) {
        if (num == num1){
            System.out.printf("%d == %d\n", num, num1);
        }
        
        if (num != num1){
            System.out.printf("%d != %d\n", num, num1);
        }
        
        if (num > num1){
            System.out.printf("%d > %d\n", num, num1);
        }
        
        if (num < num1){
            System.out.printf("%d < %d\n", num, num1);
        }
    }
    
    public void ex33(){
        int val;
        System.out.print("Input value: ");
        val = input.nextInt();
        System.out.println("Digit sum is: " + dSum(val));
    }

    private int dSum(int num) {
        int sum = 0;
        
        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        
        return sum;
    }
    
    public void ex34(){
        double side, area;
        System.out.print("Input Hexagon side length: ");
        side = input.nextDouble();
        
        area = (6 * Math.pow(side,2)/(4 * Math.tan(Math.PI/6)));
        System.out.println("Hexagon area is: " + area);
    }
    
    public void ex35(){
        double sides, length, area;
        System.out.print("Input Poligon number of sides: ");
        sides = input.nextDouble();
        System.out.print("Input Poligon side length: ");
        length = input.nextDouble();
        
        area = ((sides * (Math.pow(length, 2))) / 4 * Math.tan(Math.PI/sides));
        System.out.println("The area is: " + area);
    }
}
