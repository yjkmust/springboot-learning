package com.example.learn;

import com.example.learn.dao.UmsRoleMapper;
import com.example.learn.pojo.UmsRole;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnApplicationTests {

    @Autowired
    UmsRoleMapper umsRoleMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getUmsRole(){
        Log log = LogFactory.getLog(LearnApplicationTests.class);
//        UmsRole umsRole = umsRoleMapper.selectUmsById(1);
        log.info("123");

    }

}
