package aplication;

import db.DB;
import db.DbException;
import db.DbIntegrityExcpetion;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        // Simulação de Transações

        Connection connection = null;

        Statement st = null;


        try {
            connection = DB.getConnection();
            connection.setAutoCommit(false);

            st = connection.createStatement();
            int rows1 = st.executeUpdate("Update seller SET BaseSalary = 2090 WHERE DepartmentId = 1 ");
            int x = 1;
            if (x < 2) {
                throw new SQLException("Fake error!");
            }

            int rows2 = st.executeUpdate("Update seller SET BaseSalary = 3090 WHERE DepartmentId = 2 ");
            connection.commit();

            System.out.println("rows 1: " + rows1);
            System.out.println("rows 2: " + rows2);


        } catch (SQLException e) {
            try {
                connection.rollback(); // voltar a versão anterior
                throw new DbException("Transaction Rolled back! Caused by: " + e.getMessage());
            } catch (SQLException e1) {
                throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
            }
        } finally {

            DB.closeStatement(st);
            DB.closeConnection();
        }


        //Connection connection = DB.getConnection();
        //DB.closeConnection();  fecha minha conexão
    }
}
