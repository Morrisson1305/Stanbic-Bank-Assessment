package com.morris.stanbicBank.Repo;

import com.morris.stanbicBank.Customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer, Long > {
    void deleteCustomerById(Long id);

    Optional <Customer> findCustomerById(Long id);

    Optional<Object> findCustomerByEmail(String email);
}
