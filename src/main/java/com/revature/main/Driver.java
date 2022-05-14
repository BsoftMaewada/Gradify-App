package com.revature.main;

import com.revature.dao.UserDao;
import com.revature.utility.ConnectionUtility;

import java.sql.SQLException;

public class Driver {

    public static void main(String [] args) {
//        try {
//            ConnectionUtility.getConnection();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            ;
//        }

        UserDao dao = new UserDao();
        try{
            System.out.println(dao.getUserByUsernameAndPassword("jane_dao","pass12345"))
        } catch (SQLException e){
            e.printStackTrace();;
        }
    }
}
