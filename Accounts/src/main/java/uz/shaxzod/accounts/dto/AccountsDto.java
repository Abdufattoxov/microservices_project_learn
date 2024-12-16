package uz.shaxzod.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {
    @NotEmpty(message = "AccountNumber can not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @Schema(
            description = "Account Number of Smart bank account", example = "3454433243"
    )
    private Long accountNumber;

    @NotEmpty(message = "Account type can not be null or empty")
    @Schema(
            description = "Account type of Smart bank account", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "Branch address can not be null or emtpy")
    @Schema(
            description = "Smart bank branch address", example = "123 Mehrigiyo street"
    )
    private String branchAddress;
}
