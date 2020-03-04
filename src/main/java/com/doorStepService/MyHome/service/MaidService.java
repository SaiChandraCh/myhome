package com.doorStepService.MyHome.service;

import com.workz.DAO.MaidRepository;
import com.workz.model.Maid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaidService {
    @Autowired
    MaidRepository repository;
    public String register(Maid maid) {
        repository.save(maid);
        return "true";
    }
}
