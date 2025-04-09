package com.example.Dealer.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "auto")
public class AutoEntity {
    @Id
    @Column(name = "vin")
    private String vinCode;
    @ManyToOne
    @Column(name = "service_company")
    private ServiceCompanyEntity serviceCompany;

    public AutoEntity(String newVinCode, ServiceCompanyEntity newServiceCompany)
    {
        this.vinCode = newVinCode;
        this.serviceCompany = newServiceCompany;
    }

    public AutoEntity() {

    }

    public String getVinCode()
    {
        return vinCode;
    }
    public ServiceCompanyEntity getServiceCompany()
    {
        return serviceCompany;
    }
    @Override
    public String toString()
    {
        return vinCode;
    }
}
