package helloworld;

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
    
}
