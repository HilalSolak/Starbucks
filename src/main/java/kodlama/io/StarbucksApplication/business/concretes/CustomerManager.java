package kodlama.io.StarbucksApplication.business.concretes;

import kodlama.io.StarbucksApplication.Entities.Customer;
import kodlama.io.StarbucksApplication.business.abstracts.CustomerCheckService;
import kodlama.io.StarbucksApplication.business.abstracts.CustomerService;
import kodlama.io.StarbucksApplication.business.dto.requests.create.CreateCustomerRequest;
import kodlama.io.StarbucksApplication.business.dto.responses.create.CreateCustomerResponse;
import kodlama.io.StarbucksApplication.business.dto.responses.get.GetAllCustomersResponse;
import kodlama.io.StarbucksApplication.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerManager implements CustomerService {
    private final CustomerRepository repository;
    private final ModelMapper mapper;
    private final CustomerCheckService customerCheckService;

    @Override
    public List<GetAllCustomersResponse> getAll() {
        return repository.findAll()
                .stream()
                .map(customer -> mapper.map(customer, GetAllCustomersResponse.class))
                .toList();
    }

    @Override
    public CreateCustomerResponse add(CreateCustomerRequest request) throws Exception {
        Customer customer = mapper.map(request, Customer.class);
        checkIfIsCustomerRealPerson(customer);
        customer.setId(0);
        repository.save(customer);
        return mapper.map(customer, CreateCustomerResponse.class);
    }

    private void checkIfIsCustomerRealPerson(Customer customer) throws Exception {
        if (!customerCheckService.checkIfRealPerson(customer))
            throw new RuntimeException("Kullanıcı Bilgileri Doğrulanamadı!");
    }
}
