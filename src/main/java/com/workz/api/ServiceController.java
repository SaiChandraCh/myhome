package com.workz.api;

import com.workz.model.Maid;
import com.workz.service.MaidService;
import org.apache.commons.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class ServiceController {
    Logger logger = (Logger) LoggerFactory.getLogger(ServiceController.class);
    @Autowired
    MaidService maidService;
    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public String register(@RequestBody Maid maid){
        return maidService.register(maid);
    }

}
