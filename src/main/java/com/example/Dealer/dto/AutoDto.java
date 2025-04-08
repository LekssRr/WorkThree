package com.example.Dealer.dto;

public class AutoDto {
    private String vinCode;
    private String serviceCompany;

    public AutoDto(String newVinCode, String newServiceCompany)
    {
        this.vinCode = newVinCode;
        this.serviceCompany = newServiceCompany;
    }
    public String getVinCode()
    {
        return vinCode;
    }
    public String getNameServiceCompany()
    {
        return serviceCompany;
    }
    @Override
    public String toString()
    {
        return vinCode;
    }
}
