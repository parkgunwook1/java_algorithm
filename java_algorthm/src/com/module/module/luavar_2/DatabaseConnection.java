package com.module.module.luavar_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class DatabaseConnection {

    public static Properties GetProperties(String path) throws InvalidPropertiesFormatException, IOException {
        FileInputStream fin = new FileInputStream(path);
        Properties p = new Properties();
        p.loadFromXML(fin);
        return p;
    }

    public static Connection getConnection(Properties p) {

        try {
            String driver = p.getProperty(".Diver");
            String url = p.getProperty(".Url");
            String user = p.getProperty(".User");
            String password = p.getProperty(".Password");
            Class.forName(driver);

            return DriverManager.getConnection(url,user,password);
        }catch (Exception e) {
            return null;
        }
    }


}

