import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class PersonReader {
    public static void main(String[] args) throws FileNotFoundException {
List<Person> myPerson = readPersonFromCSV("person.txt");
for (Person b: myPerson){
    System.out.println(b);

}

    }

    private static List<Person> readPersonFromCSV(String filename) {
        List<Person> myPerson = new ArrayList<>();
        Path pathToFile = Paths.get(filename);


        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)){
            String line = br.readLine();

            while (line != null){
                String[] attributes = line.split(",");
                Person person = createPerson(attributes);

                myPerson.add(person);

                line = br.readLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myPerson;
    }
    private static Person createPerson(String[] metadata){
        int ID = Integer.parseInt(metadata[0]);
                String firstName = metadata[1];
                String lastName = metadata[2];
                String title = metadata[3];
                int YOB = Integer.parseInt(metadata[4]);
                return new Person();

    }
}
