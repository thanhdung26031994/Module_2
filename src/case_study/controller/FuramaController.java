package case_study.controller;

import case_study.model.Employee;
import case_study.service.IEmployeeService;
import case_study.service.impl.EmployeeService;

import java.util.List;

public class FuramaController {
    private static IEmployeeService iEmployeeService = new EmployeeService();


    public void addEmployee(Employee employee) {
        iEmployeeService.addEmployee(employee);
    }

    public void getAll() {
        iEmployeeService.getAll();
    }

    public boolean checkId(String id) {
        return iEmployeeService.checkId(id);
    }


    public void editEmployeeUp(String id, Employee employee) {
        iEmployeeService.editEmployeeUp(id,employee);
    }

    public void deleteById(String idDel) {
        iEmployeeService.deleteById(idDel);
    }

    public List<Employee> checkName(String nameSearch) {
        return iEmployeeService.checkName(nameSearch);
    }
}
