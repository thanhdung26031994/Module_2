package case_study.repository;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository {

    void addEmployee(Employee employee);

    void getAll();

    boolean checkId(String id);


    void editEmployeeUp(String id, Employee employee);

    void deleteById(String idDel);

    List<Employee> checkName(String nameSearch);
}
