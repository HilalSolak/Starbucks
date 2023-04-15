package kodlama.io.StarbucksApplication.business.abstracts;

import kodlama.io.StarbucksApplication.Entities.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer) throws Exception;
}
