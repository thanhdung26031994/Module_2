package extra_exercises1.utils.write_read_file;

import extra_exercises1.model.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadStudent {
    private static final String PATH_NAME= "src/extra_exercises1/data/student.csv";

    public static List<Student> readFile(){
        List<Student> students = new ArrayList<>();
        BufferedReader bufferedReader;
        try {
            Student student;
            bufferedReader = new BufferedReader(new FileReader(PATH_NAME));
            String temp;
            String[] tempString;
            while ((temp = bufferedReader.readLine()) != null){
                tempString = temp.split(",");
//                student = new Student(tempString[0], tempString[1],
//                        LocalDate.of(tempString[3]), Boolean.)
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

}
