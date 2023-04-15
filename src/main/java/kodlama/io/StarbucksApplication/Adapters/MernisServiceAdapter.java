package kodlama.io.StarbucksApplication.Adapters;

import kodlama.io.StarbucksApplication.Entities.Customer;
import kodlama.io.StarbucksApplication.Mernis.CEDKPSPublicSoap;
import kodlama.io.StarbucksApplication.business.abstracts.CustomerCheckService;
import org.springframework.stereotype.Service;

@Service
public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        CEDKPSPublicSoap cedkpsPublicSoap = new CEDKPSPublicSoap();
        return
                CEDKPSPublicSoap.TCKimlikNoDogrula(customer.getNationalIdentity(), customer.getFirstName(), customer.getLastName(), customer.getBirthYear());

    }

}
