package chinh.nguyen.repository;

import chinh.nguyen.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    void save(Customer customer);
    Customer findById(Long id);
    void deleteById(Long id);
}
