package case_study.repositories.impl;

import case_study.models.Employee;
import case_study.repositories.IEmployeeRepository;
import case_study.utils.write_read.WriteAndReadFacility;
import case_study.utils.write_read.WriteAndReadFileEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    @Override
    public void addEmployee(Employee employee) {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        employees.add(employee);
        WriteAndReadFileEmployee.writeToFile(employees);
        System.out.println("Thêm nhân viên thành công.");
    }

    @Override
    public void getAll() {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        for (Employee e: employees){
            System.out.println(e);
        }
    }

    @Override
    public boolean checkId(String id) {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        for (Employee e: employees){
            if (e.getId().toLowerCase().contains(id.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void deleteById(String idDel) {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        for (Employee e: employees){
            if (e.getId().equals(idDel)){
                employees.remove(e);
                WriteAndReadFileEmployee.writeToFile(employees);
                break;
            }
        }

    }

    @Override
    public List<Employee> checkName(String nameSearch) {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        List<Employee> employeeList = new ArrayList<>();
        for (Employee e: employees){
            if (e.getName().toLowerCase().contains(nameSearch.toLowerCase())){
                employeeList.add(e);
                break;
            }
        }
        return employeeList;
    }

    @Override
    public void editName(String id, String nameUp) {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        for (Employee employee: employees){
            if (employee.getId().equalsIgnoreCase(id)){
                employee.setName(nameUp);
                WriteAndReadFileEmployee.writeToFile(employees);
                return;
            }
        }
    }

    @Override
    public void editBirthday(String id, String birthdayUp) {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        for (Employee employee: employees) {
            if (employee.getId().equalsIgnoreCase(id)) {
                employee.setBirthday(birthdayUp);
                WriteAndReadFileEmployee.writeToFile(employees);
                return;
            }
        }
    }

    @Override
    public void editIdCardUp(String id, String idCardUp) {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        for (Employee employee: employees) {
            if (employee.getId().equalsIgnoreCase(id)) {
                employee.setIdCard(idCardUp);
                WriteAndReadFileEmployee.writeToFile(employees);
                return;
            }
        }
    }

    @Override
    public void editPhoneUp(String id, String phoneNumberUp) {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        for (Employee employee: employees) {
            if (employee.getId().equalsIgnoreCase(id)) {
                employee.setPhoneNumber(phoneNumberUp);
                WriteAndReadFileEmployee.writeToFile(employees);
                return;
            }
        }
    }

    @Override
    public void editEmailUp(String id, String emailUp) {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        for (Employee employee: employees) {
            if (employee.getId().equalsIgnoreCase(id)) {
                employee.setEmail(emailUp);
                WriteAndReadFileEmployee.writeToFile(employees);
                return;
            }
        }
    }

    @Override
    public void editGenderUp(String id, String genderUp) {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        for (Employee employee: employees) {
            if (employee.getId().equalsIgnoreCase(id)) {
                employee.setGender(genderUp);
                WriteAndReadFileEmployee.writeToFile(employees);
                return;
            }
        }
    }

    @Override
    public void editPosition(String id, String positionUp) {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        for (Employee employee: employees) {
            if (employee.getId().equalsIgnoreCase(id)) {
                employee.setPosition(positionUp);
                WriteAndReadFileEmployee.writeToFile(employees);
                return;
            }
        }
    }

    @Override
    public void editLevel(String id, String levelUp) {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        for (Employee employee: employees) {
            if (employee.getId().equalsIgnoreCase(id)) {
                employee.setLevel(levelUp);
                WriteAndReadFileEmployee.writeToFile(employees);
                return;
            }
        }
    }

    @Override
    public void editSalary(String id, Double salaryUp) {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        for (Employee employee: employees) {
            if (employee.getId().equalsIgnoreCase(id)) {
                employee.setSalary(salaryUp);
                WriteAndReadFileEmployee.writeToFile(employees);
                return;
            }
        }
    }
}
