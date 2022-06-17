import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class sams {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306?cwp","root","root");
       Statement stmt=conn.createStatement();
       String sql1=" use cwp;";
       String sql2="create table mags (name varchar(20) primary key,age int not null );";
       stmt.executeUpdate(sql1);
       stmt.executeUpdate(sql2);
       stmt.close();
       conn.close();
    }
    @Test
    public void testscan(){
        //输出hellow world
        System.out.println("hellow world");
        System.out.println("hellow git");
    }
}
