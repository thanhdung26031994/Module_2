package case_study.repositories.impl;

import case_study.models.Customer;
import case_study.repositories.ICustomerRepository;
import case_study.utils.write_read.WriteAndReadFileCustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {

    @Override
    public void addCustomer(Customer customer) {
        List<Customer> customers = WriteAndReadFileCustomer.readToFile();
        customers.add(customer);
        WriteAndReadFileCustomer.writeToFile(customers);
        System.out.println("Thêm khách hàng thành công.");
    }

    @Override
    public void getAll() {
        List<Customer> customers = WriteAndReadFileCustomer.readToFile();
        for (Customer c: customers){
            System.out.println(c);
        }
    }

    @Override
    public boolean checkIdCus(String id) {
        List<Customer> customers = WriteAndReadFileCustomer.readToFile();
        for (Customer c: customers){
            if (c.getId().toLowerCase().equals(id.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void editCustomerUp(String id, Customer customer) {
        List<Customer> customers = WriteAndReadFileCustomer.readToFile();
        for (Customer c: customers){
            if (c.getId().equals(id)){
                c.setName(customer.getName());
                c.setBirthday(customer.getBirthday());
                c.setIdCard(customer.getIdCard());
                c.setPhoneNumber(customer.getPhoneNumber());
                c.setEmail(customer.getEmail());
                c.setGender(customer.getGender());
                c.setGuestType(customer.getGuestType());
                c.setAddress(customer.getAddress());
                WriteAndReadFileCustomer.writeToFile(customers);
                return;
            }
        }
    }

    @Override
    public void removeById(String id) {
        List<Customer> customers = WriteAndReadFileCustomer.readToFile();
        for (Customer customer: customers){
            if (customer.getId().equals(id)){
                customers.remove(customer);
                WriteAndReadFileCustomer.writeToFile(customers);
                break;
            }
        }
    }

    @Override
    public List<Customer> checkName(String name) {
        List<Customer> customers = WriteAndReadFileCustomer.readToFile();
        List<Customer> customerList = new ArrayList<>();
        for (Customer customer: customers){
            if (customer.getName().toLowerCase().contains(name.toLowerCase())){
                customerList.add(customer);
                break;
            }
        }
        return customerList;
    }
}
