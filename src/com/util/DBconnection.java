package com.util;

import java.sql.*;

public class DBconnection {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/food_sales?useSSL=false&serverTimezone=GMT%2B8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";


    // 获取链接的方法：getConnection  返回值：Connection 参数：无
    public static Connection getConnection() {
        Connection con = null;  // 声明全局变量con
        try {
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return con;
    }

    // 关闭资源的方法：close()  返回值：void  参数：con, pst, res
    public static void closeAll(Connection con, PreparedStatement pst, ResultSet res) {
        if (res != null) {
            try {
                res.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }






}
