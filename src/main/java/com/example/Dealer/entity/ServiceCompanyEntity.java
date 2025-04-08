package com.example.Dealer.entity;

import java.util.ArrayList;
import java.util.List;

public class ServiceCompanyEntity {

    private String nameServiceCompany;
    private List<AutoEntity> autoEntities;

    public ServiceCompanyEntity(String newNameServiceCompany)
    {
        this.nameServiceCompany = newNameServiceCompany;
        this.autoEntities = new ArrayList<>();
    }
    public String getNameServiceCompany()
    {
        return nameServiceCompany;
    }
    public List<AutoEntity> getAutoEntities()
    {
        return new ArrayList<>(autoEntities);
    }
    public void addAutoToServiceCompany(AutoEntity addAuto)
    {
        this.autoEntities.add(addAuto);
    }
    @Override
    public String toString()
    {
        return nameServiceCompany;
    }
}
