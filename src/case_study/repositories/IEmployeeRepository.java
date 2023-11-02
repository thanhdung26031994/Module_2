package case_study.repositories;

import case_study.models.Employee;

import java.util.List;

public interface IEmployeeRepository {

    void addEmployee(Employee employee);

    void getAll();

    boolean checkId(String id);


    void editEmployeeUp(String id, Employee employee);

    void deleteById(String idDel);

    List<Employee> checkName(String nameSearch);
}
