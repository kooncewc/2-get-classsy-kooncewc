import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonGenerator {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
       List<Person> personList = new ArrayList<Person>();
        Person myPerson = new Person();
        System.out.println("Please enter ID");
        myPerson.setID(input.nextInt());

        input.nextLine();
        System.out.println("please enter your title");
        myPerson.setTitle(input.nextLine());
        System.out.println("Please enter first name" );
        myPerson.setFirstName(input.nextLine());
        System.out.println("Please enter last name");
        myPerson.setLastName(input.nextLine());
        System.out.println("please enter your YOB");
        myPerson.setYOB(input.nextInt());



        Person.toCSVDataRecord(myPerson.getID(),
                myPerson.getFirstName(),
                myPerson.getFirstName(),
                myPerson.getTitle(),
                myPerson.getYOB(),
                myPerson.getFilepath());


    }
}
