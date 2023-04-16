package kodlama.io.StarbucksApplication.Adapters;

import kodlama.io.StarbucksApplication.Entities.Customer;
import kodlama.io.StarbucksApplication.Mernis.CEDKPSPublicSoap;
import kodlama.io.StarbucksApplication.business.abstracts.CustomerCheckService;
import org.springframework.stereotype.Service;


public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        CEDKPSPublicSoap client = new CEDKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()),customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth().getYear());
    }

}
