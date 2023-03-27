package com.service;

import com.dao.userdao;
import com.po.user;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class userservice {
    static userdao ud=new userdao();
    //注册service逻辑
    public boolean login(user u){
        List<user> users=new ArrayList<>();
        users=ud.login(u);
        if(users!=null&&users.size()!=0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
