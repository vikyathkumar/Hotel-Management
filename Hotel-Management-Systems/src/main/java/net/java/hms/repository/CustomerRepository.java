package net.java.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.hms.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{

}
