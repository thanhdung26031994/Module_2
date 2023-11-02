package case_study.repositories;

import case_study.models.Customer;

import java.util.List;

public interface ICustomerRepository {
    void addCustomer(Customer customer);

    void getAll();

    boolean checkIdCus(String id);

    void editCustomerUp(String id, Customer customer);

    void removeById(String id);

    List<Customer> checkName(String name);
}
