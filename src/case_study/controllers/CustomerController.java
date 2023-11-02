package case_study.controllers;

import case_study.models.Customer;
import case_study.services.ICustomerService;
import case_study.services.impl.CustomerService;

import java.util.List;

public class CustomerController {
    private static ICustomerService iCustomerService = new CustomerService();
    public void addCustomer(Customer customer) {
        iCustomerService.addCustomer(customer);
    }

    public void getAll() {
        iCustomerService.getAll();
    }

    public boolean checkIdCus(String id) {
        return iCustomerService.checkIdCus(id);
    }

    public void editCustomerUp(String id, Customer customer) {
        iCustomerService.editCustomerUp(id, customer);
    }

    public void removeById(String id) {
        iCustomerService.removeById(id);
    }

    public List<Customer> checkName(String name) {
        return iCustomerService.checkName(name);
    }
}
