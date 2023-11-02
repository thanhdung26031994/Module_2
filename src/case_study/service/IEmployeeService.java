package case_study.service;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeService {

    void addEmployee(Employee employee);

    void getAll();

    boolean checkId(String id);


    void editEmployeeUp(String id, Employee employee);

    void deleteById(String idDel);

    List<Employee> checkName(String nameSearch);
}
