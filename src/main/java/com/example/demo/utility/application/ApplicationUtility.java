package com.example.demo.utility.application;

import com.example.demo.model.application.Application;

public interface ApplicationUtility {
    double calculatePayment(Application app);

    <T> T supports();

}
