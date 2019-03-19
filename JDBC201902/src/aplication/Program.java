package aplication;

import db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = DB.getConnection(); // conectou ao banco de dados

            st = conn.createStatement(); // prepara  o statement
            rs = st.executeQuery("SELECT * FROM department"); // executa uma dada  query sql

            while (rs.next())
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
