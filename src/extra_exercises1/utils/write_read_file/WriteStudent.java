package extra_exercises1.utils.write_read_file;

import extra_exercises1.model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteStudent {
    private static final String PATH_NAME = "src/extra_exercises1/data/student.csv";

    public static void writeToFile(Student student) {
        File file = new File(PATH_NAME);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(student.getId() +
                    "," + student.getName() +
                    "," + student.getDate() +
                    "," + student.getGender() +
                    "," + student.getClassRoom() +
                    "," + student.getPoint());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
