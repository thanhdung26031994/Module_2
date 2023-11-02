package case_study.repository.impl;

import case_study.model.Employee;
import case_study.repository.IEmployeeRepository;
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
    public void editEmployeeUp(String id, Employee employee) {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        for (Employee e: employees){
            if (e.getId().equals(id)){
                e.setName(employee.getName());
                e.setBirthday(employee.getBirthday());
                e.setIdCard(employee.getIdCard());
                e.setEmail(employee.getEmail());
                e.setGender(employee.getGender());
                e.setPosition(employee.getPosition());
                e.setLevel(employee.getLevel());
                e.setSalary(employee.getSalary());
                WriteAndReadFileEmployee.writeToFile(employees);
                return;
            }
        }

    }

    @Override
    public void deleteById(String idDel) {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        for (Employee e: employees){
            if (e.getId().toLowerCase().equals(idDel.toLowerCase())){
                employees.remove(e);
                WriteAndReadFileEmployee.writeToFile(employees);
                break;
            }
        }

    }

    @Override
    public List<Employee> checkName(String nameSearch) {
        List<Employee> employees = WriteAndReadFileEmployee.readToFile();
        for (Employee e: employees){
            if (e.getName().toLowerCase().contains(nameSearch.toLowerCase())){
                employees.add(e);
                WriteAndReadFileEmployee.writeToFile(employees);
            }
        }
        return employees;
    }


}
