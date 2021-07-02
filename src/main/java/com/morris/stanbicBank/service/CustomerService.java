package com.morris.stanbicBank.service;

import com.morris.stanbicBank.Customer.Customer;
import com.morris.stanbicBank.Repo.CustomerRepo;
import com.morris.stanbicBank.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService {
    private  final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer addCustomer(Customer customer){
        return customerRepo.save(customer);
    }

    public List<Customer> findAllCustomers(){
        return customerRepo.findAll();
    }

    public Customer updateCustomer(Customer customer){
        return customerRepo.save(customer);
    }

    public Customer findCustomerById(Long id){
        return  customerRepo.findCustomerById(id)
                .orElseThrow(()-> new UserNotFoundException("User by id"+ id+ " was not found"));
    }
    public void deleteCustomer(Long id){
        customerRepo.deleteCustomerById(id);
    }

    public Customer findCustomerByEmail(String email) {
        return (Customer) customerRepo.findCustomerByEmail(email).orElseThrow(()-> new UserNotFoundException("User by email"+email+ "was not found"));
    }
}
