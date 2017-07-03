package helloworld;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Random;
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
    
    public void ex17(){
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
        String num, num1, result;
        int  nat, nat1, mul;
        
        
        System.out.println("Input first binary number: ");
        num = input.next();
        
        System.out.println("Input second binary number: ");
        num1 = input.next();
        
        nat = Integer.parseInt(num, 2);
        nat1 = Integer.parseInt(num1, 2);
        
        mul = nat * nat1;
        result = mul + "";
        
        System.out.println("Product of two binary numbers: " + strToBin(result));
        
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
    
    public void ex33(){
        int val;
        System.out.print("Input value: ");
        val = input.nextInt();
        System.out.println("Digit sum is: " + dSum(val));
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
        
        System.out.print("Input Poligon side length: ");
        length = input.nextDouble();
        System.out.print("Input Poligon number of sides: ");
        sides = input.nextDouble();
        
        area = ((sides * (Math.pow(length, 2))) / 4 * Math.tan(Math.PI/sides));
        System.out.println("The area is: " + area);
    }
    
    public void ex36(){
        double latCord, lonCord, latCord1, lonCord1, earthRadius, distance;
        earthRadius = 6371.01;
        //[ (x1,y1) & (x2,y2)]
        //EARTHRADIUS * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
        
        System.out.print("Input the latitude of coordinate 1: ");
        latCord = input.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        lonCord = input.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        latCord1 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        lonCord1 = input.nextDouble();
        
        latCord = Math.toRadians(latCord);
        latCord1 = Math.toRadians(latCord1);
        lonCord = Math.toRadians(lonCord);
        lonCord1 = Math.toRadians(lonCord1);
        
        distance = earthRadius * Math.acos(((Math.sin(latCord) * Math.sin(latCord1)) +
                (Math.cos(latCord) * Math.cos(latCord1))) * Math.cos(lonCord - lonCord1));
        System.out.println("The distance between those points is: " + distance + "km");
    }
    
    public void ex37(){
        String user;
        System.out.print("Input a string: ");
        user = input.next();
        
        StringBuilder input1 = new StringBuilder();
        
        input1.append(user);
        input1 = input1.reverse(); 
        
        System.out.println("Reverse String: " + input1);
                
    }
    
    public void ex38(){
        String test;
        System.out.print("Enter String to test: ");
        test = input.nextLine();
        char [] letters = test.toCharArray();
        int letter = 0, space = 0, number = 0, other = 0;
        
        for (int i = 0; i < test.length(); i++){
            if (Character.isLetter(letters[i])){
                letter++;
            } else if (Character.isSpaceChar(letters[i])){
                space++;
            } else if (Character.isDigit(letters[i])){
                number++;
            } else {
                other++;
            }
        }
        
        System.out.println("String " + test);
        System.out.printf("Letters: %d\nSpaces: %d\nNumbers: %d\nOthers: %d\n",
                letter, space, number, other);
    }
    
    public void ex39(){
        int total = 0, a, b, c;
        Random randmNumb = new Random();
        while (total < 30){
            a = 1 + randmNumb.nextInt(4);
            b = 1 + randmNumb.nextInt(4);
            c = 1 + randmNumb.nextInt(4);
        
            if (a != b && b != c && c != a){
                System.out.println(a + "" + b + "" + c);
                total++;
            }  
        }
        
        
        System.out.println("Total numbers: " + total);
    }
    
    public void ex40(){
        System.out.println("Available Character sets: ");
        for (String str : Charset.availableCharsets().keySet()){
            System.out.println(str);
        }
    }
    
    public void ex41(){
        System.out.print("Input Character: ");
        char character = input.next().charAt(0);
        int ascii = 0;
        ascii = character;
        System.out.println("The ASCII value for character " 
                + character + " is " + ascii);
        
    }
    
    public void ex43(){
        System.out.printf("%s\n\t%s\n\t\t%s\n\t\t%s\n%s\n\t%s\n",
                "Twinkle, twinkle, little star", "How I wonder what you are!",
                "Up above the world so high", "Like a diamond in the sky",
                "Twinkle, twinkle, little star",
                "How I wonder what you are");
    }
    
    public void ex44(){
        int num;
        
        System.out.print("Input number: ");
        num = input.nextInt();
        
        System.out.printf("%d + %d%d + %d%d%d",num, num, num, num, num, num);       
    }
    
    public void ex45(){
        System.out.println("BinCalc143: " + new File("build.xml").length() + " bytes");
        //this file may not be available
    }
    
    
    
    
    //METHODS
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
    
    private int dSum(int num) {
        int sum = 0;
        
        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        
        return sum;
    }
    
    private String strToBin(String get){
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
}
