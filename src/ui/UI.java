package ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UI {
    final static String psql = "org.postgresql.Driver";
    static int cnt;
    public static int counter=20;
    public static Boolean isTt=false;
    public static void main(String[] args)throws Exception {
        DBCon.createTable();
        try
        {
            ResultSet rs = DBCon.executeQuery("select * from logins");
            System.out.println("Student :");
                    while(rs.next())
                    {  
                        System.out.println(rs.getString(1)+" "+rs.getString(2));
                    }
            rs = DBCon.executeQuery("select * from logint");
            System.out.println("Faculty :");
                    while(rs.next())
                    {
                        System.out.println(rs.getString(1)+" "+rs.getString(2));
                    }
            rs.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        SignUp_Page hp = new SignUp_Page();
        hp.setVisible(true);
    }   
}