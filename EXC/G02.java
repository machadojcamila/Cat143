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
        
        System.out.printf("A Rectangle: \n Base: %d\n Height: %d\n "
                + "Perimeter: %d\n", base, height, area);
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
    
    public void averagePrice(){
        //Receives: Price 1, Price 2, Price 3
        //Returns: Average Price
        System.out.println("G02 - E03");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        float price1, price2, price3, average;
        
        System.out.print("Price 1: ");
        price1 = input.nextFloat();
        
        System.out.print("Price 2: ");
        price2 = input.nextFloat();
        
        System.out.print("Price 3: ");
        price3 = input.nextFloat();
        
        average = ((price1 + price2 + price3) / 3);
        System.out.println("Average Price is: " + average);
    }
    
    public void divideNumbers(){
        //Receives: Number 1, Number 2
        //Returns: The highest number divided into the lowest
        System.out.println("G02 - E04");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        
        float val, val1, div;
        
        System.out.print("Value 1: ");
        val = input.nextFloat();
        
        System.out.print("Value 2: ");
        val1 = input.nextFloat();
        
        if (val > val1){
            div = val / val1;
        } else {
            div = val1 / val;
        }
        
        System.out.printf("Total is: %.2f\n", div);
    }
    
    public void bigBrother(){
        //Receives: Number 1, Number 2, Number 3
        //Returns: The highest number
        System.out.println("G02 - E05");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        
        float val, val1, val2;
        
        System.out.print("Value 1: ");
        val = input.nextFloat();
        
        System.out.print("Value 2: ");
        val1 = input.nextFloat();
        
        System.out.print("Value 3: ");
        val2 = input.nextFloat();
        
        if ((val > val1) && (val > val2)){
            System.out.println("Value 1 is the Big Brother: " + val);
        } else if ((val1 > val) && (val1 > val2)) {
            System.out.println("Value 2 is the Big Brother: " + val1);
        } else if ((val2 > val) && (val2 > val1)) {
            System.out.println("Value 3 is the Big Brother: " + val2);
        }
    }
    
    public void checkGrades(){
        //Receives: Grade
        //Returns: If Grade >= 6 pases, if Grade < 6 Feb, if Grade <= 3 Dic
        System.out.println("G02 - E05");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        
        float grade;
        
        System.out.print("Enter student grade: ");
        grade = input.nextFloat();
        
        if (grade >= 6){
            System.out.printf("%s grade was %.2f, %s passes!\n",
                    getUserName(), grade, getUserName());
        } else if ((grade < 6) && (grade > 3)){
            System.out.printf("%s grade was %.2f, %s will have to repeat the"
                    + " test on February 10th!\n",
                    getUserName(), grade, getUserName());
        } else if (grade <= 3){
            System.out.printf("%s grade was %.2f, %s will have to repeat!"
                    + " The test will be on December 3rd!\n",
                    getUserName(), grade, getUserName());
        }
    }
    
    public void check20Grades(){
        //Receives: 20 Alumni grades, names
        //Returns: Status
        System.out.println("G02 - E06");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        
        String name;
        int i;
        float grade;
        
        for (i = 1; i <= 20; i++){
            System.out.printf("\nStudent Number: %d\n", i);
            
            System.out.print("Student Name: ");
            name = input.next();
            
            System.out.print("Grade: ");
            grade = input.nextFloat();
            
            if (grade >= 6){
                System.out.printf("%s grade was %.2f, %s passes!\n",
                        name, grade, name);
            } else if ((grade < 6) && (grade > 3)){
                System.out.printf("%s grade was %.2f, %s will have to "
                        + "repeat the test on February 10th!\n",
                        name, grade, name);
            } else if (grade <= 3){
                System.out.printf("%s grade was %.2f, %s will have to repeat!"
                        + " The test will be on December 3rd!\n",
                        name, grade, name);
            }
        }
    }
    
    public void holaCincoVeces(){
        //Receives: Nothing
        //Returns: "Hola" 5 times
        System.out.println("G02 - E07");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        
        for (int i = 0; i < 5; i++){
            System.out.println("Hola");
        }
    }
    
    public void  fiveResult(){
        //Receives: 5 values
        //Returns: Addition of the 5 Values
        System.out.println("G02 - E08");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        
        int val, val1, val2, val3, val4, add;
        
        System.out.print("Value 1: ");
        val = input.nextInt();
        
        System.out.print("Value 2: ");
        val1 = input.nextInt();
        
        System.out.print("Value 3: ");
        val2 = input.nextInt();
        
        System.out.print("Value 4: ");
        val3 = input.nextInt();
        
        System.out.print("Value 5: ");
        val4 = input.nextInt();
        
        add = val + val1 + val2 + val3 + val4;
        System.out.printf("%d + %d + %d + %d + %d = %d",
                val, val1, val2, val3, val4, add);
    }
    
    public void subsTwo(){
        //Receives: 2 values
        //Returns: Substraction of the 2 Values
        System.out.println("G02 - E09");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        
        int val, val1, sub;
        
        System.out.print("Value 1: ");
        val = input.nextInt();
        
        System.out.print("Value 2: ");
        val1 = input.nextInt();
        
        sub = val - val1;
        System.out.printf("%d - %d = %d",
                val, val1, sub);
    }
    
    public void voteOrNot(){
        //Receives: Name, Last Name, Sex, Age
        //Returns: if user age > 18 can vote
        System.out.println("G02 - E10");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        
        String firstName, lastName;
        int age, m, f, sex, voters;
        
        m = 0; f = 0; voters = 0;
        
        while (voters < 10) {
            System.out.print("First Name: ");
            firstName = input.next();
            
            System.out.print("Last Name: ");
            lastName = input.next();
            
            System.out.print("Age: ");
            age = input.nextInt();
            
            if (age >= 18){
                System.out.printf("%s is able to vote!\n", firstName);
                System.out.print("Sex (1 = F, 0 = M): ");
                sex = input.nextInt();
                if (sex == 1){
                    f++;
                    voters++;
                    System.out.println("1 More Woman is voting! Total "
                            + "woman voting: " + f);
                    System.out.println("Voters: " + voters);
                }
                
                else if (sex == 0){
                    m++;
                    voters++;
                    System.out.println("1 More man is voting! Total "
                            + "men voting: " + m);
                    System.out.println("Voters: " + voters);
                }
                else {
                    System.out.println("Invalid Sex, Try Again");
                    break;
                }
            } else {
                System.out.printf("%s is not able to vote!",
                        firstName);
                break;
            }
        }
        System.out.println("Total M voters: " + m);
        System.out.println("Total F voters: " + f);
    }
    
    public void alumniAverage(){
        //Receives: Grade
        //Returns: 20 Grade Average
        System.out.println("G02 - E11");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        
        float grade, average, total;
        total = 0;
        
        for (int i = 0; i < 20; i++){
            System.out.print("Grade: ");
            grade = input.nextFloat();
            
            total += grade;
        }
        
        average = (total / 20);//Fix this formula
        System.out.println("Classroom Average is: " + total);
    }
    
    public void store(){
        //Receives: 15 products
        //Returns: Total, Payment, Change
        System.out.println("G02 - E12");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        
        int select, prods, totalPrice, pays, change;
        String prodList;
        
        prodList = "----- PRODUCTS -----";
        prods = 0; totalPrice = 0;
        
        for (int i = 1; i <= 15; i++){
            System.out.printf("Select a Product: \n"
                    + "1.  PlayStation 4  -  $350\n"
                    + "2.  Xbox One       -  $380\n"
                    + "3.  iPhone 6S      -  $540\n"
                    + "4.  Apple Mac Book -  $1100\n"
                    + "5.  HP Notebook    -  $700\n"
                    + "6.  Samsung Galaxy -  $925\n"
                    + "7.  Desktop PC     -  $1200\n"
                    + "8.  Gamming PC      -  $1800\n"
                    + "9.  PlayStation 3  -  $210\n"
                    + "10. Xbox 360       -  $240\n"
                    + "11. Samsung SmartTV-  $480\n"
                    + "12. HP Server      -  $850\n"
                    + "13. Mac Pro        -  $2100\n"
                    + "14. Surface Mcsft  -  $950\n"
                    + "15. HP Screen Dsktp-  $350\n");
            System.out.println("Select your Product: ");
            select = input.nextInt();
            
            switch (select) {
                case 1:
                    prods++;
                    prodList += "\n " + prods + " PlayStation 4";
                    totalPrice += 350;
                    break;
                case 2:
                    prods++;
                    prodList += "\n " + prods + " Xbox One";
                    totalPrice += 380;
                    break;
                case 3:
                    prods++;
                    prodList += "\n " + prods + " iPhone 6S";
                    totalPrice += 540;
                    break;
                case 4:
                    prods++;
                    prodList += "\n " + prods + " Apple Mac Book";
                    totalPrice += 1100;
                    break;
                case 5:
                    prods++;
                    prodList += "\n " + prods + " HP Notebook";
                    totalPrice += 700;
                    break;
                case 6:
                    prods++;
                    prodList += "\n " + prods + " Samsung Galaxy";
                    totalPrice += 925;
                    break;
                case 7:
                    prods++;
                    prodList += "\n " + prods + " Desktop PC";
                    totalPrice += 1200;
                    break;
                case 8:
                    prods++;
                    prodList += "\n " + prods + " Gamming PC";
                    totalPrice += 1800;
                    break;
                case 9:
                    prods++;
                    prodList += "\n " + prods + " PlayStation 3";
                    totalPrice += 210;
                    break;
                case 10:
                    prods++;
                    prodList += "\n " + prods + " Xbox 360";
                    totalPrice += 240;
                    break;
                case 11:
                    prods++;
                    prodList += "\n " + prods + " Samsung Smart TV";
                    totalPrice += 480;
                    break;
                case 12:
                    prods++;
                    prodList += "\n " + prods + " HP Server";
                    totalPrice += 850;
                    break;
                case 13:
                    prods++;
                    prodList += "\n " + prods + " Mac Pro";
                    totalPrice += 2100;
                    break;
                case 14:
                    prods++;
                    prodList += "\n " + prods + " Microsoft Surface";
                    totalPrice += 950;
                    break;
                case 15:
                    prods++;
                    prodList += "\n " + prods + " HP Desktop Screen";
                    totalPrice += 350;
                    break;
                default:
                    System.out.println("Invalid Item");
                    break;
            }
        }
        System.out.println(prods + " items where added to your cart!");
        System.out.println("Check Cart: ");
        System.out.print(prodList);
        System.out.println("\nTotal Due: " + totalPrice + "$");
            //Payment
        System.out.println("Client Pays: ");
        pays = input.nextInt();
         
        change = pays - totalPrice;
        System.out.printf("Change: %d $\n", change);
        System.out.println("----- THANKS! -----");
    }
    
    public void workers(){
        //Receives: Hours (between 1 and 8) - 80$ // Extras 100$
        //Returns: Total payment
        System.out.println("G02 - E13");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        int days, regularPay, extraPay, totalPayment, hours, extraHours, payday,
                totalHours, totalExtraHours;
        days = 15; regularPay = 80; extraPay = 100; payday = 0; totalHours = 0;
        totalExtraHours = 0;
        
        System.out.print("Enter labour days (15/30): ");
        days = input.nextInt();
        
        for (int i = 0; i < days; i++){
            System.out.print("\nEnter hours worked: ");
            hours = input.nextInt();
            
            if (hours <= 8){
                totalPayment = regularPay * hours;
                System.out.printf("Hours worked were a regular work day of "
                        + "%d$/hr \n Total Payment: %d$",
                        regularPay, totalPayment);
                payday += totalPayment;
                totalHours += hours;
            } else {
                System.out.printf("Hours worked were over a regular work day of"
                        + " %d$/hr \nplus %d$/hr for extra hours.",
                        regularPay, extraPay);
                extraHours = hours - 8;
                totalPayment = ((regularPay * 8) + (extraPay * extraHours));
                System.out.printf("Hours worked: %d HRS\n"
                        + "Total Payment: %d$ \n",
                        hours, totalPayment);
                payday += totalPayment;
                totalHours += hours;
                totalExtraHours += extraHours;
            }
        }
        
        System.out.println("\n------ PAYDAY ------");
        System.out.printf("Hours Worked: %dhrs\nExtra Hours: %dhrs\n"
                + "Total Payment: %d$\n", totalHours, totalExtraHours,
                payday);
    }
    
    public void currency(){
        //Receives: Dolar/Peso Amount
        //Returns: Dolar/Peso Converted
        System.out.println("G02 - E14");
        System.out.printf("User: %s // Mod: %d\n", getUserName(), getMod());
        float peso, dolar;
        int select;
        
        System.out.println("Select currency: ");
        
        System.out.println("1. Dolar <-> Peso");
        System.out.println("2. Peso  <-> Dolar");
        
        select = input.nextInt();
        
        switch (select) {
            case 1:
                System.out.println("Enter Dolars: ");
                dolar = input.nextFloat();
                peso = dolar * 15;
                System.out.println("Total Peso: " + peso);
                break;
                
            case 2: 
                System.out.println("Enter Peso: ");
                peso = input.nextFloat();
                dolar = peso / 15;
                System.out.println("Total Dolar: " + dolar);
                break;
        }
    }
}
