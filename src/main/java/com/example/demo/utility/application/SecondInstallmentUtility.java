package com.example.demo.utility.application;

import com.example.demo.model.application.Application;
import com.example.demo.model.application.SecondInstallment;
import org.springframework.stereotype.Service;

@Service
public class SecondInstallmentUtility implements ApplicationUtility {

    @Override
    public double calculatePayment(Application app) {
        return 3;
    }

    @Override
    public <T> T supports() {
        return (T) SecondInstallment.class;
    }


}
