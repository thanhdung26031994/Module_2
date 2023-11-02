package case_study.services.impl;

import case_study.models.Employee;
import case_study.repositories.IEmployeeRepository;
import case_study.repositories.impl.EmployeeRepository;
import case_study.services.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static IEmployeeRepository iEmployeeRepository = new EmployeeRepository();

    @Override
    public void addEmployee(Employee employee) {
        iEmployeeRepository.addEmployee(employee);
    }

    @Override
    public void getAll() {
        iEmployeeRepository.getAll();
    }

    @Override
    public boolean checkId(String id) {
        return iEmployeeRepository.checkId(id);
    }

    @Override
    public void editEmployeeUp(String id, Employee employee) {
        iEmployeeRepository.editEmployeeUp(id, employee);
    }

    @Override
    public void deleteById(String idDel) {
        iEmployeeRepository.deleteById(idDel);
    }

    @Override
    public List<Employee> checkName(String nameSearch) {
        return iEmployeeRepository.checkName(nameSearch);
    }


}
