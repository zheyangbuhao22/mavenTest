package com.tu.service.impl;

import com.tu.dao.TestDao;
import com.tu.domain.Items;
import com.tu.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{
    @Autowired
    private TestDao testDao;

    @Override
    public List<Items> findAll() {
        return testDao.findAll();
    }
}
