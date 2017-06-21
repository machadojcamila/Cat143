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
}
