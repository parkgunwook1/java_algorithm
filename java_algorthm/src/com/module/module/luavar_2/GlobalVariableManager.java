package com.module.module.luavar_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class GlobalVariableManager {

    private Connection con;

    public GlobalVariableManager(Connection con) {
        this.con = con;
    }

    private static final String INSERT_QUERY = "INSERT INTO global_variables (key, value) VALUES (?, ?)";
    private static final String SELECT_QUERY = "SELECT value FROM global_variables WHERE key = ?";
    private static final String UPDATE_QUERY = "UPDATE global_variables SET value = ? WHERE key = ?";
    private static final String DELETE_QUERY = "DELETE FROM global_variables WHERE key = ?";

    public int setVariable(String key, String value) throws SQLException {
        try (PreparedStatement statement = con.prepareStatement(INSERT_QUERY)) {
            statement.setString(1, key);
            statement.setString(2, value);
            int result = statement.executeUpdate();
            return result;
        }


    }

    public String getVariable(String key) throws SQLException {
        try (PreparedStatement statement = con.prepareStatement(SELECT_QUERY)) {
            statement.setString(1, key);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getString("value");
                }
            }
        }
        return null;
    }

    public int updateVariable(String key, String value) throws SQLException {
        try (PreparedStatement statement = con.prepareStatement(UPDATE_QUERY)) {
            statement.setString(1, value);
            statement.setString(2, key);
            int result = statement.executeUpdate();

            return result;
            }
        }

    public int deleteVariable(String key) throws SQLException {
        try (PreparedStatement statement = con.prepareStatement(DELETE_QUERY)) {
            statement.setString(1, key);
            int result = statement.executeUpdate();
            return result;
        }
    }
}
