package kodlama.io.StarbucksApplication.business.dto.requests.create;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateCustomerRequest {
    @NotBlank(message = "İsim boş bırakılamaz.")
    private String firstName;
    @NotBlank(message = "Soyisim boş bırakılamaz.")
    private String lastName;

    @NotNull
    private LocalDate dateOfBirth;
    @NotBlank(message = "TC kimlik boş bırakılamaz.")
    @Length(min = 11, max =11, message = "TC kimlik numarası 11 haneden oluşmak zorunda.")
    private String nationalIdentity;
}
