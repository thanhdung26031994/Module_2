package case_study.controllers;

import case_study.models.Employee;
import case_study.services.IEmployeeService;
import case_study.services.impl.EmployeeService;

import java.util.List;

public class EmployeeController {
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


    public void deleteById(String idDel) {
        iEmployeeService.deleteById(idDel);
    }

    public List<Employee> checkName(String nameSearch) {
        return iEmployeeService.checkName(nameSearch);
    }

    public void editName(String id, String nameUp) {
        iEmployeeService.editName(id, nameUp);
    }

    public void editBirthday(String id, String birthdayUp) {
        iEmployeeService.editBirthday(id, birthdayUp);
    }

    public void editIdCardUp(String id, String idCardUp) {
        iEmployeeService.editIdCardUp(id, idCardUp);
    }

    public void editPhoneUp(String id, String phoneNumberUp) {
        iEmployeeService.editPhoneUp(id, phoneNumberUp);
    }

    public void editEmailUp(String id, String emailUp) {
        iEmployeeService.editEmailUp(id, emailUp);
    }

    public void editGenderUp(String id, String genderUp) {
        iEmployeeService.editGenderUp(id, genderUp);
    }

    public void editPosition(String id, String positionUp) {
        iEmployeeService.editPosition(id, positionUp);
    }

    public void editLevel(String id, String levelUp) {
        iEmployeeService.editLevel(id, levelUp);
    }

    public void editSalary(String id, Double salaryUp) {
        iEmployeeService.editSalary(id, salaryUp);
    }
}
