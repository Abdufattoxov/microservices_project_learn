package uz.shaxzod.loan.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Schema(
        name = "Response",
        description = "Schema to hold successful response information"
)
public class ResponseDto {
    @Schema(
            description = "Status code in response"
    )
    private String statusCode;
    @Schema(
            description = "Status message in response"
    )
    private String statusMessage;
}
