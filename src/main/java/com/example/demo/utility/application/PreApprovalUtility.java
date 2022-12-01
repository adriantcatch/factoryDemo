package com.example.demo.utility.application;

import com.example.demo.model.application.Application;
import com.example.demo.model.application.PreApproval;
import org.springframework.stereotype.Service;

@Service
public class PreApprovalUtility implements ApplicationUtility {

    @Override
    public double calculatePayment(Application app) {
        return 1;
    }

    @Override
    public <T> T supports() {
        return (T) PreApproval.class;
    }


}
