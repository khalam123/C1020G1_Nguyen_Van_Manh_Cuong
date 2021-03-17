package case_study.model.contract;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contractDetailId;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "contract_id", referencedColumnName = "id")
    @JsonManagedReference
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "attach_service_id", referencedColumnName = "id")
    @JsonManagedReference
    private AttachService attachService;

    public ContractDetail() {
    }

    public ContractDetail(Integer contractDetailId, int quantity, Contract contract, AttachService attachService) {
        this.contractDetailId = contractDetailId;
        this.quantity = quantity;
        this.contract = contract;
        this.attachService = attachService;
    }

    public Integer getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(Integer contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }
}
