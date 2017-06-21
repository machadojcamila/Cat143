package cat143.courseGrades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseStudent {
    
    private String firstName;
    private String lastName;
    private int studentAge;
    private String courseName;
    private float studentAverage;
    
    public CourseStudent(String name, String last, int age, String course, float average){
        
        firstName = name;
        lastName = last;
        studentAge = age;
        courseName = course;
        studentAverage = average;
        
    }
    
    Scanner input = new Scanner(System.in);
    
    public void setFirstName(String name){
        firstName = name;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String last){
        lastName = last;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setStudentAge(int age){
        studentAge = age;
    }
    
    public int getStudentAge(){
        return studentAge;
    }
    
    public void setCourseName(String course){
        courseName = course;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public void setStudentAverage(float average){
        studentAverage = average;
    }
    
    public float getStudentAverage(){
        return studentAverage;
    }
    
    public float determinateAverage(){
        System.out.println("___________ AVERAGE STUDENT ___________");
        List<Float> Exams = new ArrayList<Float>();
        float n, total;
        total = 0;
        
        for (int i = 1; i <= 3; i++){
            System.out.printf("Insert Test %d Value: ",
                    i);
            n = input.nextFloat();
            Exams.add(n);
            total += n;
        }
        System.out.printf("Student Average: %.2fpts\n", (total/3));
        setStudentAverage(total/3);
        return(total/3);
    }
        
    public void studentReport(){
        String name, last, course;
        int age;
        float average;
        name = getFirstName();
        last = getLastName();
        age = getStudentAge();
        course = getCourseName();
        average = getStudentAverage();
        
        System.out.printf("___________ STUDENT REPORT ___________\n"
                + "First Name: %s\nLast Name: %s\nAge: %d\n"
                + "Class: %s\nAverage: %.2f\n",
                name, last, age, course, average);
    }
    
    public void createStudent(){
        System.out.println("___________ CREATE STUDENT ___________");
        String name, last, course;
        int age;
        float average;
        average = getStudentAverage();
        
        System.out.print("First Name: ");
        name = input.next();
        
        System.out.print("Last Name: ");
        last = input.next();
        
        System.out.print("Age: ");
        age = input.nextInt();
        
        System.out.print("Course: ");
        course = input.next();
        
        average = (average != 0)? average : 0;
        
        setFirstName(name);
        setLastName(last);
        setStudentAge(age);
        setCourseName(course);
        setStudentAverage(average);
    }
    
    public void work(){
        System.out.println("Create a Student and Report its Details");
        int x = 0;
        System.out.println("Enter -1 to END // Enter (ANY INT) to CONTINUE:");
        x = input.nextInt();
        while (x != -1){
            CourseStudent alpha = new CourseStudent("", "", 0, "", 0);
            alpha.createStudent();
            alpha.determinateAverage();
            alpha.studentReport();
            System.out.println("----" + getFirstName() + " " + getLastName() + "----------");
            System.out.println("Enter -1 to END // Enter (ANY INT) to CONTINUE:");
            x = input.nextInt();
        }
        System.out.println("STUDENTS HAS BEEN STORED INTO DB");
    }
}
