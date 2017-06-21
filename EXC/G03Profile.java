package cat143;

public class G03Profile {
      
    private String firstName;
    private String lastName;
    private int birthday;
    
    G03Profile( String name, String last, int bday) {
        
        firstName = name;
        lastName = last;
        birthday = bday;
    }
    
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
    
    public void setBirthday(int bday){
        birthday = bday;
    }
    
    public int getBirthday(){
        return birthday;
    }
    
    public String dateBDay(){
        int bt = getBirthday();
        int day = bt / 1000000;
        int mnth = (bt / 10000) % 10;
        int year = bt % 10000;
        String btDate = day + "/" + mnth + "/" + year;
        System.out.println(btDate);
        return btDate;
    }
    
    public String showCountry(){
         return "";
    }
    
    public void showDetails(){
        System.out.printf("First Name: %s\nLast Name: %s\nBirthday: %s\n",
                getFirstName(), getLastName(), dateBDay());
    }
}
