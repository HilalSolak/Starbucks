package kodlama.io.StarbucksApplication.business.abstracts;



import kodlama.io.StarbucksApplication.business.dto.requests.create.CreateCustomerRequest;
import kodlama.io.StarbucksApplication.business.dto.responses.create.CreateCustomerResponse;
import kodlama.io.StarbucksApplication.business.dto.responses.get.GetAllCustomersResponse;

import java.util.List;

public interface CustomerService {
    List<GetAllCustomersResponse> getAll();
    CreateCustomerResponse add(CreateCustomerRequest request)throws Exception;
}
