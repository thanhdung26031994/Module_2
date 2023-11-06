package case_study.utils.write_read;

import case_study.models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFileCustomer {
    private static final String PATH = "src/case_study/data/customer.csv";

    public static void writeToFile(List<Customer> customers){
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer: customers){
                bufferedWriter.write(customer.getId() +
                        "," + customer.getName() +
                        "," + customer.getBirthday() +
                        "," + customer.getIdCard() +
                        "," + customer.getPhoneNumber() +
                        "," + customer.getEmail() +
                        "," + customer.getGender() +
                        "," + customer.getGuestType()+
                        "," + customer.getAddress());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Customer> readToFile(){
        List<Customer> customers = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            Customer customer;
            bufferedReader = new BufferedReader(new FileReader(PATH));
            String temp;
            String[] tempStr;
            while ((temp = bufferedReader.readLine()) != null){
                tempStr = temp.split(",");
                customer = new Customer(tempStr[0], tempStr[1],tempStr[2],
                        tempStr[3],tempStr[4],tempStr[5],tempStr[6],tempStr[7],
                        tempStr[8]);
                customers.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
