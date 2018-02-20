package sample;

import dbUtil.dbConnection;

import java.sql.Connection;
import java.sql.SQLDataException;

public class loginModel {
    Connection connection;

    public loginModel() {
        try {
            this.connection = dbConnection.getConnenctton();
        }catch (SQLDataException ex)



    }//loginModel
}//loginModel
