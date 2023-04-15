package kodlama.io.StarbucksApplication.business.dto.responses.create;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateCustomerResponse {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String nationalIdentity;
}
