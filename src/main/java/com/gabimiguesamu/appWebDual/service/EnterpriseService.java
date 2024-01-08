package com.gabimiguesamu.appWebDual.service;

import com.gabimiguesamu.appWebDual.model.Enterprise;
import com.gabimiguesamu.appWebDual.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EnterpriseService {
    private final EnterpriseRepository enterpriseRepository;

    @Autowired
    public EnterpriseService(EnterpriseRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;
    }

    public List<Enterprise> findAll(){
        return enterpriseRepository.findAll();
    }
}
