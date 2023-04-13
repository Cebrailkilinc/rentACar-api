package com.example.rentACar.dataAccsess.abstracts;

import com.example.rentACar.entities.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BrandRepostory {
    List<Brand> getAll();
}
