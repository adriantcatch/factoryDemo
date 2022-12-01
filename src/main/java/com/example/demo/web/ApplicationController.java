package com.example.demo.web;

import com.example.demo.model.application.FirstInstallment;
import com.example.demo.model.application.PreApproval;
import com.example.demo.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @GetMapping(value = "testing")
    private @ResponseBody ResponseEntity test(){

        FirstInstallment firstInstallment = new FirstInstallment();

        return ResponseEntity.ok(applicationService.getPayment(firstInstallment));

    }

}
