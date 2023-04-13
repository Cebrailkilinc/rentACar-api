package com.example.rentACar.business.concretes;

import com.example.rentACar.business.abstracts.BrandService;
import com.example.rentACar.dataAccsess.abstracts.BrandRepostory;
import com.example.rentACar.entities.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {
    private BrandRepostory brandRepostory;

    @Autowired
    public BrandManager(BrandRepostory brandRepostory) {
        this.brandRepostory = brandRepostory;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepostory.getAll();
    }
}
