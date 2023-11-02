package case_study.services.impl;

import case_study.models.Customer;
import case_study.repositories.ICustomerRepository;
import case_study.repositories.impl.CustomerRepository;
import case_study.services.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private static ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public void addCustomer(Customer customer) {
        iCustomerRepository.addCustomer(customer);
    }

    @Override
    public void getAll() {
        iCustomerRepository.getAll();
    }

    @Override
    public boolean checkIdCus(String id) {
        return iCustomerRepository.checkIdCus(id);
    }

    @Override
    public void editCustomerUp(String id, Customer customer) {
        iCustomerRepository.editCustomerUp(id, customer);
    }

    @Override
    public void removeById(String id) {
        iCustomerRepository.removeById(id);
    }

    @Override
    public List<Customer> checkName(String name) {
        return iCustomerRepository.checkName(name);
    }
}
