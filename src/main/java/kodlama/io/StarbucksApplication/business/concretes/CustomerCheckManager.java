package kodlama.io.StarbucksApplication.business.concretes;

import kodlama.io.StarbucksApplication.Entities.Customer;
import kodlama.io.StarbucksApplication.business.abstracts.CustomerCheckService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomerCheckManager implements CustomerCheckService {
    private final CustomerCheckService service;

    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        return service.checkIfRealPerson(customer);
    }

}
