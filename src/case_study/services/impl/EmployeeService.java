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
    public void deleteById(String idDel) {
        iEmployeeRepository.deleteById(idDel);
    }

    @Override
    public List<Employee> checkName(String nameSearch) {
        return iEmployeeRepository.checkName(nameSearch);
    }

    @Override
    public void editName(String id, String nameUp) {
        iEmployeeRepository.editName(id, nameUp);
    }

    @Override
    public void editBirthday(String id, String birthdayUp) {
        iEmployeeRepository.editBirthday(id, birthdayUp);
    }

    @Override
    public void editIdCardUp(String id, String idCardUp) {
        iEmployeeRepository.editIdCardUp(id, idCardUp);
    }

    @Override
    public void editPhoneUp(String id, String phoneNumberUp) {
        iEmployeeRepository.editPhoneUp(id, phoneNumberUp);
    }

    @Override
    public void editEmailUp(String id, String emailUp) {
        iEmployeeRepository.editEmailUp(id, emailUp);
    }

    @Override
    public void editGenderUp(String id, String genderUp) {
        iEmployeeRepository.editGenderUp(id, genderUp);
    }

    @Override
    public void editPosition(String id, String positionUp) {
        iEmployeeRepository.editPosition(id, positionUp);
    }

    @Override
    public void editLevel(String id, String levelUp) {
        iEmployeeRepository.editLevel(id, levelUp);
    }

    @Override
    public void editSalary(String id, Double salaryUp) {
        iEmployeeRepository.editSalary(id, salaryUp);
    }


}
