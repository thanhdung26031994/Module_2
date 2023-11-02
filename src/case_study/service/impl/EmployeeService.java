package case_study.service.impl;

import case_study.model.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.repository.impl.EmployeeRepository;
import case_study.service.IEmployeeService;

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
