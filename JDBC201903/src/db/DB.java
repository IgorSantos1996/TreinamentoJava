package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {
    //carrega as propriedades
    private static Connection conn = null;


    /*           Método auxiliar para criar a conexão            */
    public static Connection getConnection() {
        if (conn == null) {
            try {
                Properties props = loadProperties(); // carreguei as propriedades
                String url = props.getProperty("dburl"); // url do banco, definida no arquivo db.properties
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    /*           Carregar as propriedades do arquivo com as configurações            */
    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) { // abre o arquivo com as propiedades
            Properties props = new Properties();
            props.load(fs); // faz a leitura apontada pelo fs
            return props;

        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }
    /*           Método auxiliar para fechar a conexão            */
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
    /*           Método auxiliar para fechar o statement            */
    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
    /*           Método auxiliar para fechar o resultSet            */
    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
