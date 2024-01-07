package Dao;

import Factory.ConnectionFactory;
import Model.UserModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Usuario {

    private Connection connection;
    private int id;
    private String nome;
    private String sexo;
    private String idade;
    private String tipo_exame;

    public Usuario() throws SQLException{
        new ConnectionFactory();
        this.connection = ConnectionFactory.faz_conexao();
    }

    public void adiciona(UserModel userModel){
        String sql = "INSERT INTO dados_cadastro(nome,sexo,idade,tipo_exame) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, userModel.getNome());
            stmt.setString(2, userModel.getSexo());
            stmt.setString(3, userModel.getIdade());
            stmt.setString(3, userModel.getTipo_exame());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
