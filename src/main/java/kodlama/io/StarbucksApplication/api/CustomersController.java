package kodlama.io.StarbucksApplication.api;
import kodlama.io.StarbucksApplication.business.abstracts.CustomerService;
import kodlama.io.StarbucksApplication.business.dto.requests.create.CreateCustomerRequest;
import kodlama.io.StarbucksApplication.business.dto.responses.create.CreateCustomerResponse;
import kodlama.io.StarbucksApplication.business.dto.responses.get.GetAllCustomersResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/customers")
public class CustomersController {
    private final CustomerService service;

    @GetMapping
    List<GetAllCustomersResponse> getAll(){
        return service.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateCustomerResponse add(@RequestBody CreateCustomerRequest request)throws Exception{
        return service.add(request);
    }
}
