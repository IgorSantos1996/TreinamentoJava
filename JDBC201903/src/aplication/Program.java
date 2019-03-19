package aplication;

import db.DB;

import javax.xml.transform.Result;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement("INSERT INTO seller " +
                            "(Name, Email, BirthDate, BaseSalary, DepartmentId)" +
                            "VALUES" +
                            "(?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            //definir as interrogações
            st.setString(1, "Carl Purple");
            st.setString(2, "car@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("22/04/1990").getTime()));
            st.setDouble(4, 3000);
            st.setInt(5, 4);
            // alterar os dados tem que chamar o executeUpdate() e retorna a qtd linhas que foram alteradas
            int rows_affectedt = st.executeUpdate();

            if (rows_affectedt > 0) {
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1); // valor da primeira coluna
                    System.out.println("Done! id = " + id);
                }
            } else {
                System.out.println("No rows affected");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
