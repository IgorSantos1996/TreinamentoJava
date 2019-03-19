package aplication;

import db.DB;
import db.DbException;
import db.DbIntegrityExcpetion;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement st = null;
        ResultSet rs = null;
        try {

            connection = DB.getConnection(); // conecta com o banco de dados
            st = connection.createStatement();

            /*                      simples consulta                        */
            rs = st.executeQuery("select * from department");

            while (rs.next()) {
                System.out.println(rs.getInt("Id") + ", "
                        + rs.getString("Name"));
            }
            /*                      INSERTION DATA                       */
            try {
                connection = DB.getConnection();
                /*
                preparedStatement = connection.prepareStatement(
                        "INSERT INTO seller " + "(Name, Email, BirthDate, BaseSalary, DepartmentID)"
                                + "VALUES" + "(?,?,?,?,?)",
                        Statement.RETURN_GENERATED_KEYS);

                preparedStatement.setString(1, "Igor Santos");
                preparedStatement.setString(2, "igsants@gmail.com");
                preparedStatement.setDate(3, new java.sql.Date(sdf.parse("02/12/2016").getTime()));
                preparedStatement.setDouble(4, 4000.0);
                preparedStatement.setInt(5, 2); // inserir o vendedor no departamento 4

                preparedStatement = connection.prepareStatement(
                        "INSERT  INTO department (Name) values ('D1'),('D2')",
                        Statement.RETURN_GENERATED_KEYS);
                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println("Done! Rows affected: " + rowsAffected);
                if (rowsAffected > 0) {
                    ResultSet resultSet = preparedStatement.getGeneratedKeys();
                    while (resultSet.next()) {
                        int id = resultSet.getInt(1);
                        System.out.println("Done! Id = " + id);
                    }
                } else {
                    System.out.println("Nenhuma linha alterada!");
                }*/

                /*                  Update Data
                preparedStatement = connection.prepareStatement("UPDATE seller " + "SET BaseSalary = BaseSalary + ?"
                        + "WHERE"
                        + "(DepartmentId = ?)");
                preparedStatement.setDouble(1, 200);
                preparedStatement.setInt(2, 2);
                //rowsAffected = preparedStatement.executeUpdate();
                //System.out.println("Done! Rows affected: " + rowsAffected);
                */
                /*                  Delete Data                     */


                //preparedStatement = connection.prepareStatement(
                        //"DELETE FROM department "
                        //        + "WHERE "
                        //        + "Id = ?"
                //);
              //  preparedStatement.setInt(1, 2);

                int rowsaffected = preparedStatement.executeUpdate();

            } catch (SQLException e) {
                throw new DbIntegrityExcpetion(e.getMessage());
                //} catch (ParseException x) {
                // x.getMessage();
            } finally {
                DB.closeStatement(st);
                DB.closeConnection();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }


        //Connection connection = DB.getConnection();
        //DB.closeConnection();  fecha minha conexão
    }
}
