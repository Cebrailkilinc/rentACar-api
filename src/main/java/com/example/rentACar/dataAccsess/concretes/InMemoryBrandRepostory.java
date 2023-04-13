package com.example.rentACar.dataAccsess.concretes;

import com.example.rentACar.dataAccsess.abstracts.BrandRepostory;
import com.example.rentACar.entities.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBrandRepostory implements BrandRepostory {
    List<Brand> brands;

    public InMemoryBrandRepostory() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(2, "Mercedes"));
        brands.add(new Brand(3, "Togg"));
        brands.add(new Brand(4, "Audi"));
        brands.add(new Brand(5, "Renault"));
    }

    public List<Brand> getAll() {
        return brands;
    }
}
