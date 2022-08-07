/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static ui.UI.psql;

/**
 *
 * @author Aditya Mhatre
 */
public class DBCon {
    private static Connection con = null;
    private static Statement stmt = null;
    private static final String logins = "create table if not exists logins(userid varchar(15) primary key, passwords varchar(15));";
    private static final String logint = "create table if not exists logint(userid varchar(15) primary key, password varchar(15));";
    private static final String level_1 = "create table if not exists level_1(qnum int primary key, ques text, opt1 varchar(100), opt2 varchar(100), opt3 varchar(100), opt4 varchar(100), answer varchar(100));";
    private static final String level_2 = "create table if not exists level_2(qnum int primary key, ques text, opt1 varchar(100), opt2 varchar(100), opt3 varchar(100), opt4 varchar(100), answer varchar(100));";
    private static final String level_3 = "create table if not exists level_3(qnum int primary key, ques text, opt1 varchar(100), opt2 varchar(100), opt3 varchar(100), opt4 varchar(100), answer varchar(100));";
    private static final String scorecard = "create table if not exists scorecard(username varchar(15),subject varchar(10) , score int, foreign key(username) references logins(userid) on delete cascade)";
    public static void createTable() {
        connect();
        executeUpdate(logins);
        executeUpdate(logint);
        executeUpdate(level_1);
        executeUpdate(level_2);
        executeUpdate(level_3);
        executeUpdate(scorecard);
        disconnect();
    }
    public static void connect()  {
        try {
            //Class.forName(psql);
            con=DriverManager.getConnection("jdbc:sqlite:QuizData.db");
            stmt=con.createStatement();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void disconnect()
    {
        if(con!=null)
        {
            try {
                stmt.close();
                con.close();
                stmt=null;
                con=null;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public static ResultSet executeQuery(String sql)
    {
        ResultSet rs=null;
        try{
            connect();
             rs=stmt.executeQuery(sql);
        }catch(SQLException ex)
        {
            System.out.println(ex);
        }
        return rs;
    }
    public static int executeUpdate(String sql)
    {
        int i=0;
        try{
            connect();
            Statement stmt=con.createStatement();
             i=stmt.executeUpdate(sql);
             disconnect();
        }catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return i;
    }
}
