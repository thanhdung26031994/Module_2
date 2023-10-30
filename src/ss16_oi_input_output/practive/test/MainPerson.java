package ss16_oi_input_output.practive;

import ss16_oi_input_output.practive.test.model.Person;
import ss16_oi_input_output.practive.test.utils.FileUtils;

import java.util.List;

public class MainPerson {
    public static final String FILE_NAME = "src/ss16_oi_input_output/practive/data/student.csv";
    public static final String COMMA = ",";

    public static void main(String[] args) {

        //Output File
//        Person person = new Person(1, "Nam", "20/02/1997");
//        Person person1 = new Person(2, "Nu", "11/05/1999");
//        Person person2 = new Person(3, "Quang", "25/08/2002");
//        List<Person> personList = new ArrayList<>();
//        personList.add(person);
//        personList.add(person1);
//        personList.add(person2);
//
//        String line= null;
//        for (Person p: personList){
//            line = p.getId() + COMMA + p.getName() + COMMA + p.getDateOfBirth();
//            FileUtils.writeFile(FILE_NAME, line);
//        }

        //Input File
        List<String> listLine = FileUtils.readFile(FILE_NAME);
        System.out.println(listLine);

        String[] lineSplit = listLine.get(0).split(COMMA);
        Person person = new Person(Integer.parseInt(lineSplit[0]), lineSplit[1], lineSplit[2]);

        System.out.println(person.getId() + " " + person.getName()+" "+person.getDateOfBirth());

    }
}
