package case_study.services;

import case_study.models.Employee;

import java.util.List;

public interface IEmployeeService {

    void addEmployee(Employee employee);

    void getAll();

    boolean checkId(String id);


    void editEmployeeUp(String id, Employee employee);

    void deleteById(String idDel);

    List<Employee> checkName(String nameSearch);
}
