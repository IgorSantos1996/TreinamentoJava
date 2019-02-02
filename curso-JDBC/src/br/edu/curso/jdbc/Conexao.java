package br.edu.curso.jdbc;

import br.edu.curso.jdbc.br.edu.curso.jdbc.dto.PessoaDTO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Date;

public class Conexao {
    // usando o padrão singleton
    private static Conexao conexao = null;

    public static Conexao getInstance() {
        if (conexao == null) {
            conexao = new Conexao();
        }
        return conexao;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException { // quem chamar o getConnection() que trate essa exceção
        Class.forName("com.mysql.jdbc.Driver"); // nome do nosso Driver
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/teste_igor", "root", "root");
    }

    public void Listar() throws SQLException {
        Connection connection = null;
        try {
            connection = getConnection(); // abrir um tunel de conexao
            String sql = "SELECT * FROM TB_PESSOA";
            PreparedStatement statement = connection.prepareStatement(sql); // é como se apontasse para a conexão, vai no banco e pega;
            ResultSet resultSet = statement.executeQuery(); // conjunto de resultados, cópia da tabela da consulta

            while (resultSet.next()) {
                //linha a linha
                System.out.println(resultSet.getInt("ID_PESSOA"));
                System.out.println(resultSet.getString("NOME"));
                System.out.println(resultSet.getDate("DT_NASC"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fecha a conexão
            connection.close();
        }
    }

    public void Inserir(PessoaDTO pessoaDTO) throws SQLException {
        Connection connection = null;
        try {
            connection = getConnection();
            String sql = "INSERT INTO TB_PESSOA(NOME, CPF, ENDERECO, SEXO, DT_NASC) " +
                    "VALUES(?, ?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, pessoaDTO.getNome());
            statement.setLong(2, pessoaDTO.getCPF());
            statement.setString(3, pessoaDTO.getEndereco());
            statement.setString(4, String.valueOf(pessoaDTO.getSexo()));
            statement.setDate(5, new Date(pessoaDTO.getDtNascimento().getTime()));


            statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    public void Remover(Integer idPessoa) throws SQLException {
        Connection connection = null;
        try {
            connection = getConnection();
            String sql = "DELETE FROM TB_PESSOA WHERE ID_PESSOA = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idPessoa);

            statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    public void Atualizar(PessoaDTO pessoaDTO) {
        Connection connection = null;

        try {
            connection = getConnection();
            String sql = "UPDATE TB_PESSOA " +
                    "SET NOME = ?, " +
                    "CPF = ?, " +
                    "ENDERECO = ?, " +
                    "SEXO  = ?," +
                    "DT_NASC = ?" +
                    "WHERE  ID_PESSOA = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, pessoaDTO.getNome());
            statement.setLong(2, pessoaDTO.getCPF());
            statement.setString(3, pessoaDTO.getEndereco());
            statement.setString(4, String.valueOf(pessoaDTO.getSexo()));
            statement.setDate(5, new Date(pessoaDTO.getDtNascimento().getTime()));
            statement.setInt(6, pessoaDTO.getIdPessoa());
            statement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            PessoaDTO dto = new PessoaDTO();
            //dto.setIdPessoa(16); // setei o id da pessoa pra poder chamar o método Atualizar() na linha 129
            dto.setNome("CLOVIS");
            dto.setEndereco("Rua EMILY RAYAN ");
            dto.setCPF(1131213l);
            dto.setSexo('M');
            dto.setDtNascimento(new java.util.Date());

            //getInstance().Inserir(dto);
            //getInstance().Atualizar(dto);
            //getInstance().Remover(dto.getIdPessoa());

            getInstance().Listar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
