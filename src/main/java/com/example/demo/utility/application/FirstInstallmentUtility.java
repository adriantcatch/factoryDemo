package com.example.demo.utility.application;

import com.example.demo.model.application.Application;
import com.example.demo.model.application.FirstInstallment;
import org.springframework.stereotype.Service;

@Service
public class FirstInstallmentUtility implements ApplicationUtility {

    @Override
    public double calculatePayment(Application app) {
        return 2;
    }

    @Override
    public <T> T supports() {
        return (T) FirstInstallment.class;
    }

}
