package com.dao;

import com.po.user;
import com.util.DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class userdao {
    private static Connection con = null;
    private static PreparedStatement pst = null;
    private static ResultSet res = null;

    public List<user> login(user u) {
        con = DBconnection.getConnection();
        String sql = "select * from users where loginname=? and loginpassword=?";
        List<user> users = null;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, u.getLoginame());
            pst.setString(2, u.getLoginpassword());
            res = pst.executeQuery();

            while (res.next()) {
                users = new ArrayList<>();
                user uu = new user();
                uu.setLoginame(res.getString(2));
                uu.setLoginpassword(res.getString(3));
                uu.setTruename(res.getString(4));
                users.add(uu);
            }
            DBconnection.closeAll(con, pst, res);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
          DBconnection.closeAll(con,pst,res);
        }

        return users;
    }



}
