package com.example.Dealer.service;

import com.example.Dealer.dto.AutoDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService {

    public AutoDto getServiceCompany(String vinCode)
    {
        return null;
    }
    public List<AutoDto> getAllAuto()
    {
        return null;
    }
    public List<AutoDto>getAllAutoToServiceCompany(String nameServiceCompany)
    {
        return null;
    }

    public boolean addAuto(String vinCode, String nameServiceCompany)
    {
        return false;
    }

    public boolean deleteAuto(String vinCode)
    {
        return false;
    }
    public boolean deleteAllAuto()
    {
        return false;
    }

    public boolean updateAuto()
    {
        return false;
    }

}
