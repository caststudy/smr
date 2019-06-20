package com.smr.service;


import com.smr.mapper.Func1Mapper;
import com.smr.model.Func1;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class Func1ServiceImpl implements Func1Service {
    //    @Autowired  //    MyDAO dao;
    Logger log = Logger.getLogger(Func1ServiceImpl.class);
    @Autowired
    Func1Mapper func1Mapper;
    public Func1 getFunc1(Func1 func1) {

        log.info(func1Mapper);
        try {
//            return (Func1) dao.getById(Func1Mapper.class, func1.getFld1());
            return (Func1) func1Mapper.getById(func1.getFld1());
        } catch (Exception e) {
            log.error(e.getMessage());
            return null;
        }
    }

    @Cacheable(value="func1")
    public List<Func1> getAllFunc1(Func1 func1) {
        log.info("test  redis  cach........................");
        try {
//            return (List) dao.getAll(Func1Mapper.class, func1);
            return (List) func1Mapper.getAll(func1);
        } catch (Exception e) {
            log.error(e.getMessage());
            return null;
        }
    }

}
