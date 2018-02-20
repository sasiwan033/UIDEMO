package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;

public class dbConnection {
private static final String SQCONN = "jdbc:sqlite:school.sqlite";
private static Connection getConnection(){
    try {
        Class.forName("org.sqlite.JDBC");
        return DriverManager.getConnection(SQCONN);

    }catch (ClassNotFoundException e){
        e.printStackTrace();
    }catch (SQLClientInfoException e){
        e.printStackTrace();
    }
    return null;
}//getConnection



}//class
