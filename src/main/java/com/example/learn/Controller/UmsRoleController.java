package com.example.learn.Controller;

import com.example.learn.dao.UmsRoleMapper;
import com.example.learn.pojo.UmsRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/role")
public class UmsRoleController {

    Log log = LogFactory.getLog(UmsRoleController.class);

    @Autowired
    private UmsRoleMapper roleMapper;

    @PostMapping(value = "/umsrole")
    public UmsRole getUmsRoleById(@RequestParam("Id") int Id){
        log.info(Id);
        UmsRole umsRole = roleMapper.selectUmsById(Id);
        return umsRole;
    }
    @PostMapping(value = "/addUmsRole")
    public String insertUmsRole(@RequestParam("name") String name,@RequestParam("description") String description){
        log.info(name+description);
        UmsRole umsRole = new UmsRole();
        umsRole.setName(name);
        umsRole.setDescription(description);
        int insert = roleMapper.insert(umsRole);
        if (insert>0){
            return "添加成功";
        }else {
            return "添加失败";
        }

    }

//     "timestamp": "2019-05-24T08:06:56.858+0000",
//             "status": 500,
//             "error": "Internal Server Error",
//             "message": "nested exception is org.apache.ibatis.exceptions.PersistenceException: \n### Error updating database.  Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.\n### The error may exist in file [/Users/scorpio/Documents/Java/springboot-learning/target/classes/mappers/UmsRoleMapper.xml]\n### The error may involve com.example.learn.dao.UmsRoleMapper.insert\n### The error occurred while executing an update\n### Cause: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure\n\nThe last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.",
//             "path": "/role/addUmsRole"


}
