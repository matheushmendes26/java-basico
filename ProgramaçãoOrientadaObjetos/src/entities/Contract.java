package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Contract {
    private Integer numberContract;
    private LocalDate dateContract;
    private Double valueContract;

    private List<Installment> installmentList = new ArrayList<>();

    public Contract(){
    }

    public Contract(Integer numberContract, LocalDate dateContract, Double valueContract) {
        this.numberContract = numberContract;
        this.dateContract = dateContract;
        this.valueContract = valueContract;
    }

    public Integer getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(Integer numberContract) {
        this.numberContract = numberContract;
    }

    public LocalDate getDateContract() {
        return dateContract;
    }

    public void setDateContract(LocalDate dateContract) {
        this.dateContract = dateContract;
    }

    public Double getValueContract() {
        return valueContract;
    }

    public void setValueContract(Double valueContract) {
        this.valueContract = valueContract;
    }

    public List<Installment> getInstallmentList() {
        return installmentList;
    }
}
