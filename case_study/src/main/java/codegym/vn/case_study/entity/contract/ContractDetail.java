package codegym.vn.case_study.entity.contract;

import codegym.vn.case_study.entity.employee.Role;
import codegym.vn.case_study.entity.employee.User;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractDetailId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "contractId")
    private Contract contractId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "attachServiceId")
    private AttachService attachServiceId;
    @Min(value = 1, message = "{quantity.min}")
    private int quantity;

    public ContractDetail() {
    }

    public ContractDetail(Contract contractId, AttachService attachServiceId, int quantity) {
        this.contractId = contractId;
        this.attachServiceId = attachServiceId;
        this.quantity = quantity;
    }

    public int getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(int contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public Contract getContractId() {
        return contractId;
    }

    public void setContractId(Contract contractId) {
        this.contractId = contractId;
    }

    public AttachService getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(AttachService attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
