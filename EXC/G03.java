package cat143;

import java.util.Scanner;

public class G03 {
    
    private String userName;
    private int mod;
    
    public G03(String name, int modNum) {
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
    
    public void countingA(){
        //Receives: N/A
        //Returns: Numbers from 1 to 10
        System.out.println("G03 - E01");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        int counter;
        counter = 0;
        
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
            counter += i;
        }     
        System.out.println("Total: " + counter);
    }
    
    public void countingB(){
        //Receives: N/A
        //Returns: Numbers from 5 to 100 (5 by 5)
        System.out.println("G03 - E02");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        int counter = 0;
        
        for (int i = 5; i <= 100; i += 5){
            System.out.println(i);
            counter += i;
        }
        System.out.println("Total: " + counter);
    }
    
    public void countingC(){
        //Receives: N/A
        //Returns: Numbers from 2 to 100 (only pairs)
        System.out.println("G03 - E03");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        int counter = 0;
        
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i);
                counter += i;
            }
        }
        System.out.println("Total: " + counter);
    }
    
    public void countingD(){
        //Receives: N/A
        //Returns: Numbers from 1 to 300, prints either, shows totals
        System.out.println("G03 - E03");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        int counter, totalImpar;
        counter = 0;
        totalImpar = 0;
        for (int i = 1; i <= 300; i++){
            if (i % 2 != 0){
                System.out.println(i);
                counter += i;
                totalImpar++;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("Total Impar: " + totalImpar);
        System.out.println("Total: " + counter);
    }
    
    public void parOImpar(){
        //Receives: Number
        //Returns:  Par / Impar
        System.out.println("G03 - E04");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        int number;
        
        System.out.println("Enter Number: ");
        number = input.nextInt();
        
        if (number % 2 == 0){
            System.out.println("Number es par");
        } else {
            System.out.println("Number es impar");
        }
    }
    
    public void numberCheck(){
        //Receives: N/A
        //Returns: Numbers from 1 to 10
        System.out.println("G03 - E05");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        int [] numbers = {12,88,14,15,33,21,60,102,80, 43,67,52,56,24,31,22,10,
            28,90,91,34,95,30,22,32,87,54,11,2,55,109,112,38,99,42,77,10,15,21};
        
        int FftyAndSvnty = 0; int greatherEigty = 0; int smallerThiry = 0;
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
            
            if (numbers[i] >= 50 && numbers[i] <= 75){
                FftyAndSvnty++;
            }
            
            if (numbers[i] > 80){
                greatherEigty++;
            }
            
            if (numbers[i] > 30){
                smallerThiry++;
            }
        }
        
        System.out.println("Numbers between 50 and 75: " + FftyAndSvnty);
        System.out.println("Numbers greater than 80: " + greatherEigty);
        System.out.println("Numbers smallers than 30: " + smallerThiry);
    }
    
    public void checkAge(){
        //Receives: Age
        //Returns: Category
        System.out.println("G03 - E06");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        int age;
        
        System.out.println("Enter age member age: ");
        age = input.nextInt();
        
        if (age <= 12){
            System.out.println("This memeber is a youngster");
        } else if (age > 12 && age <= 18){
            System.out.println("This member is a teen");            
        } else if (age > 18 && age < 26){
            System.out.println("This member is an adult");
        } else if (age >= 26){
            System.out.println("This member is an elder");
        } else {
            System.out.println("This member gives a false age");
        }
    }  
}
