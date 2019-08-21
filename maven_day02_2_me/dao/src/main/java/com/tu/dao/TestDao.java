package com.tu.dao;

import com.tu.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDao {
    //@Select("select * from items")
    public List<Items> findAll();
}
