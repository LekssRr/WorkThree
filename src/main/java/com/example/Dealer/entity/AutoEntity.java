package com.example.Dealer.entity;


public class AutoEntity {

    private String vinCode;
    private ServiceCompanyEntity serviceCompany;

    public AutoEntity(String newVinCode, ServiceCompanyEntity newServiceCompany)
    {
        this.vinCode = newVinCode;
        this.serviceCompany = newServiceCompany;
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
