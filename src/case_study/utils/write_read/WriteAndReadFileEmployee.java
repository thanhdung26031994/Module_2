package case_study.utils.write_read;

import case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFileEmployee {

    private static final String PATH = "src/case_study/data/employee.csv";

    public static void writeToFile(List<Employee> employee1) {
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee: employee1){
                bufferedWriter.write(employee.getId() +
                        "," + employee.getName() +
                        "," + employee.getBirthday() +
                        "," + employee.getIdCard() +
                        "," + employee.getPhoneNumber() +
                        "," + employee.getEmail() +
                        "," + employee.getGender() +
                        "," + employee.getPosition() +
                        "," + employee.getLevel() +
                        "," + employee.getSalary());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Employee> readToFile(){
        List<Employee> employeeList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            Employee employee;
            bufferedReader = new BufferedReader(new FileReader(PATH));
            String temp;
            String[] tempStr;
            while ((temp = bufferedReader.readLine()) != null){
                tempStr = temp.split(",");
//                System.out.println(Arrays.toString(tempStr));
                employee = new Employee(tempStr[0], tempStr[1], tempStr[2],
                        tempStr[3],tempStr[4],tempStr[5],tempStr[6],tempStr[7],
                        tempStr[8], Double.parseDouble(tempStr[9]));
                employeeList.add(employee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}
