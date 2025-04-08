package com.example.Dealer.dto;

import com.example.Dealer.entity.AutoEntity;

import java.util.ArrayList;
import java.util.List;

public class ServiceCompanyDto {
    private String nameServiceCompany;
    private List<String> autoEntities;

    public ServiceCompanyDto(String newNameServiceCompany)
    {
        this.nameServiceCompany = newNameServiceCompany;
        this.autoEntities = new ArrayList<>();
    }
    public String getNameServiceCompany()
    {
        return nameServiceCompany;
    }
    public List<String> getAutoEntities()
    {
        return new ArrayList<>(autoEntities);
    }
    public void addAutoToServiceCompany(String addAuto)
    {
        this.autoEntities.add(addAuto);
    }
    @Override
    public String toString()
    {
        return nameServiceCompany;
    }
}
