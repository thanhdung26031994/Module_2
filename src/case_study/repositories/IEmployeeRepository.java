package case_study.repositories;

import case_study.models.Employee;

import java.util.List;

public interface IEmployeeRepository {

    void addEmployee(Employee employee);

    void getAll();

    boolean checkId(String id);


    void deleteById(String idDel);

    List<Employee> checkName(String nameSearch);

    void editName(String id, String nameUp);

    void editBirthday(String id, String birthdayUp);

    void editIdCardUp(String id, String idCardUp);

    void editPhoneUp(String id, String phoneNumberUp);

    void editEmailUp(String id, String emailUp);

    void editGenderUp(String id, String genderUp);

    void editPosition(String id, String positionUp);

    void editLevel(String id, String levelUp);

    void editSalary(String id, Double salaryUp);
}
