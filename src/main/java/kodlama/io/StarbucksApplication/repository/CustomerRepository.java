package kodlama.io.StarbucksApplication.repository;


import kodlama.io.StarbucksApplication.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    boolean existsByNationalIdentity(String nationalIdentity);
}
