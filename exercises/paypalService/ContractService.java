import javax.naming.OperationNotSupportedException;
import java.time.LocalDate;
public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){

        double basicQuota = contract.getTotalValue() / months;

        for(int i = 1; i <= months; i++){
            LocalDate duoDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.installments.add(new Installment(duoDate, quota));
        }
    }
}
