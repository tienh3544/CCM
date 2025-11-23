package nhom12.ccm.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import nhom12.ccm.dto.PaymentTransactionDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepositResponse {

    private PaymentTransactionDto transaction;
    private String paymentUrl;

}