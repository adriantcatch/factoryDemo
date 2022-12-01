package com.example.demo.service;

import com.example.demo.model.application.Application;
import com.example.demo.utility.application.ApplicationUtility;
import com.example.demo.utility.application.ApplicationUtilityFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationUtilityFactory applicationUtilityFactory;

    public double getPayment(Application application){

        ApplicationUtility applicationUtility = applicationUtilityFactory.getUtility(application);

        return applicationUtility.calculatePayment(application);

    }


}
