package codegym.vn.case_study.entity.service;

import codegym.vn.case_study.entity.contract.Contract;
import codegym.vn.case_study.entity.contract.ContractDetail;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
public class Service {
    @Id
    @Column(length = 7)
    @Pattern(regexp = "^DV-[0-9]{4}$", message = "{serviceId.format}")
    private String serviceId;
    private String serviceName;
    private int serviceArea;
    @Min(value = 1, message = "{price.min}")
    private double serviceCost;
    @Min(value = 1, message = "{quantity.min}")
    private int serviceMaxPeople;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "rentTypeId")
    private RentType rentTypeId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "serviceTypeId")
    private ServiceType serviceTypeId;
    private String roomStandard;
    private String descriptionOtherConvenience;
    private double poolArea;
    @Min(value = 1, message = "{quantity.min}")
    private int numberOfFloors;
    @OneToMany(mappedBy = "serviceId", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Contract> contractList;

    public Service() {
    }

    public Service(String serviceId, String serviceName, int serviceArea, double serviceCost, int serviceMaxPeople, RentType rentTypeId, ServiceType serviceTypeId, String roomStandard, String descriptionOtherConvenience, double poolArea, int numberOfFloors, List<Contract> contractList) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.rentTypeId = rentTypeId;
        this.serviceTypeId = serviceTypeId;
        this.roomStandard = roomStandard;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.contractList = contractList;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(int serviceArea) {
        this.serviceArea = serviceArea;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(int serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public RentType getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(RentType rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public ServiceType getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(ServiceType serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
