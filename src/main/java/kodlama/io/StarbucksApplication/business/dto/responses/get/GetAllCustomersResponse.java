package kodlama.io.StarbucksApplication.business.dto.responses.get;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class GetAllCustomersResponse {
        private int id;
        private String firstName;
        private String lastName;
        private LocalDate dateOfBirth;
        private String nationalIdentity;

    }

