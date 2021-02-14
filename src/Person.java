import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

public class Person {
    private int ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;
    private String filepath = "person.txt";


    public Person() {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }


    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }
    public String fullName() {
 firstName = firstName!=null?firstName:"";
 lastName = lastName!=null?lastName:"";

 return (firstName + " " + lastName).trim();
}
public String formalName(){
    firstName = firstName!=null?firstName:"";
    lastName = lastName!=null?lastName:"";
    title = title!=null?title:"";
    return (title + " " + firstName + " " + lastName).trim();

}
public static int getAge(int year){

    LocalDate today = LocalDate.now();
    LocalDate birthdate = LocalDate.of(year, 1, 18);
    year = Period.between(birthdate, today).getYears();
    return year;

}
public static void toCSVDataRecord(int ID, String firstName, String lastName, String title, int YOB, String filepath){
try
{
    FileWriter fw = new FileWriter(filepath,true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter pw = new PrintWriter(bw);

    pw.println(ID + "," + title+ "," + firstName + "," + lastName + "," + YOB );
    pw.flush();
    pw.close();

    JOptionPane.showMessageDialog(null,"Record saved");

}

catch(Exception E)
{
    JOptionPane.showMessageDialog(null,"Record not saved");
}

}
    @Override
    public String toString(){
        return "Person [ID= " + ID + ", firstName=" + firstName + ", last Name" + lastName + ", title=" + title + "YOB= " + YOB + "]";
    }

}
