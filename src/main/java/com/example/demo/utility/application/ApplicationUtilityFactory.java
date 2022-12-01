package com.example.demo.utility.application;

import com.example.demo.model.application.Application;
import com.example.demo.model.application.PreApproval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationUtilityFactory {

    @Autowired
    List<ApplicationUtility> applicationUtilities;

    public ApplicationUtility getUtility(Application application){

        ApplicationUtility applicationUtility = null;

        for(ApplicationUtility utility : applicationUtilities){

            if(application.getClass() == utility.supports())
                applicationUtility =  utility;
        }

        return applicationUtility;

    }


}
