package com.practise.helloconfigclient;

import com.practise.helloconfigclient.controller.TestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RefreshActuator {

    @Autowired
    private TestController testController;

//    @Scheduled(initialDelay = 1000, fixedRate = 10000)
//    public void refreshActuator() {
//        testController.actuatorRefreshing();
//    }
}
