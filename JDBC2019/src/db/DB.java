package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
    //carrega as propriedades
    private static Connection conn = null;


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

    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) { // abre o arquivo com as propiedades
            Properties props = new Properties();
            props.load(fs); // faz a leitura aprontada pelo fs
            return props;

        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static void closeConnection() { //fechar a conexão
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
