package com.turkcell.pair8.customerservice.services.dtos.customer.request;

import com.turkcell.pair8.customerservice.services.messages.CustomerMessages;
import com.turkcell.pair8.customerservice.entities.Gender;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCustomerRequest {
    @NotBlank(message = CustomerMessages.ValidationErrors.VALIDATION_NOT_BLANK)
    @Length(min = 3, max = 50, message = CustomerMessages.ValidationErrors.VALIDATION_LENGTH)
    private String firstName;

    private String middleName;

    @NotBlank(message = CustomerMessages.ValidationErrors.VALIDATION_NOT_BLANK)
    private String lastName;

    @NotNull(message = CustomerMessages.ValidationErrors.VALIDATION_NOT_BLANK)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthDate;

    @NotNull(message = CustomerMessages.ValidationErrors.VALIDATION_NOT_BLANK)
    private Gender gender;

    private String fatherName;

    private String motherName;

    @NotBlank(message = CustomerMessages.ValidationErrors.VALIDATION_NOT_BLANK)
    private String nationalityID;
}
