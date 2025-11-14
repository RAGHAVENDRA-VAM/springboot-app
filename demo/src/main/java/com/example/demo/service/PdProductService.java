package com.example.demo.service;

import com.example.demo.data.PdProduct;
import com.example.demo.model.PDProductResponse;
import com.example.demo.repository.PdProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PdProductService {

    @Autowired
    private PdProductRepository repository;

    public PDProductResponse getPdProductById(long id) {
        PdProduct pdProduct = new PdProduct();
        pdProduct.setPdProductId(id);
        pdProduct.setPdProductName("Test");
        repository.save(pdProduct);
        Optional<PdProduct> data= repository.findById(id);
        if(data.isPresent()) {
            PdProduct dbData = data.get();
            PDProductResponse response = new PDProductResponse();
            response.setPdProductId(dbData.getPdProductId());
            response.setPdProductName(dbData.getPdProductName());
            return response;
        }
        else return null;
    }
}
