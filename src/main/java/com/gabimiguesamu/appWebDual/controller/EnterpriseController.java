package com.gabimiguesamu.appWebDual.controller;

import com.gabimiguesamu.appWebDual.model.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;

    @GetMapping("/all")
    public ResponseEntity<List<Enterprise>> findAll(){
        List<Enterprise> enterpriseList = enterpriseService.findAll();

        if (enterpriseList != null && !enterpriseList.isEmpty()) {
            return new ResponseEntity<>(enterpriseList, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
