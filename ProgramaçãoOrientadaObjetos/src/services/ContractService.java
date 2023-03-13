package services;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContractService {
    private OnlinePaymentServices onlinePaymentService;

    public ContractService(OnlinePaymentServices onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        double install = contract.getValueContract()/months;
        for(int i=1;i<=months;i++){
            LocalDate dueDate = contract.getDateContract().plusMonths(i);
            double interest = onlinePaymentService.interest(install,i);
            double paymentFee = onlinePaymentService.paymentFee(install+interest);
            double totalPayment = install+interest+paymentFee;
            contract.getInstallmentList().add(new Installment(dueDate,totalPayment));
        }

    }
}
