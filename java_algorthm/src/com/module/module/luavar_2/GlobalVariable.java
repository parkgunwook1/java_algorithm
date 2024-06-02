package com.module.module.luavar_2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.Map;
import java.util.Properties;

public class GlobalVariable {

    private Map<String, Object> map = new HashMap<>();
    private static Connection con = null;
    private static Properties p = null;


    public static void main(String[] args)  {

        try {
        p = DatabaseConnection.GetProperties("test.xml");
        con = DatabaseConnection.getConnection(p);
        } catch (InvalidPropertiesFormatException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        }


        private String setVar(String key, String value) throws SQLException {

            GlobalVariableManager globalVariableManager = new GlobalVariableManager(con);

            int result = globalVariableManager.setVariable(key, value);

            if (result <= 0) {
                return "fail";
            }
            return "success";
        }

        private Object getVar(String key) throws SQLException {


            GlobalVariableManager globalVariableManager = new GlobalVariableManager(con);
            String value = globalVariableManager.getVariable(key);
            return value;

        }
        private String updateVar(String key, String value) throws SQLException {

            GlobalVariableManager globalVariableManager = new GlobalVariableManager(con);
            int result = globalVariableManager.updateVariable(key, value);

            if (result <= 0) {
                return "fail";
            }
            return "success";
        }

        private String deleteVar(String key) throws SQLException {
            GlobalVariableManager globalVariableManager = new GlobalVariableManager(con);

            int a = globalVariableManager.deleteVariable(key);

            if (a <= 0) {
                return "fail";
            }
            return "success";
        }
}
