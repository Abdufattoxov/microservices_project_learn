package uz.shaxzod.loan.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Schema(
        name = "Loan",
        description = "Schema to hold Loan information"
)
public class LoansDto {
    @NotEmpty(message = "Mobile number can not be empty or null")
    @Pattern(regexp = "(^$|[0,9]{9})", message = "Mobile number must be 9 digits")
    @Schema(
            description = "Mobile number of Customer", example = "995309908"
    )
    private String mobileNumber;

    @NotEmpty(message = "Loan number can not be empty or null")
    @Pattern(regexp = "(^$|[0,9]{12})", message = "Loan number must be 12 digits")
    @Schema(
            description = "Loan number of customer", example = "123456789876"
    )
    private String loanNumber;

    @NotEmpty(message = "Loan type can not be null or empty")
    @Schema(
            description = "Type of the loan", example = "Home Loan"
    )
    private String loanType;

    @Positive(message = "Total loan must be greater than 0")
    @Schema(
            description = "Total Loan amount", example = "100000"
    )
    private int totalLoan;

    @PositiveOrZero(message = "Total loan amount paid should be equal or greater than zero")
    @Schema(
            description = "Total loan amount paid", example = "5000"
    )
    private int amountPaid;
    @PositiveOrZero(message = "Total outstanding amount should be equal or greater than zero")
    @Schema(
            description = "Total outstanding amount", example = "950000"
    )
    private int outstandingAmount;
}
