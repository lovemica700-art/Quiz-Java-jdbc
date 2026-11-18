package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static String url = "jdbc:/mysql://localhost:3306:loja";
    private static String user = "aluno";
    private static String password = "aluno";
    
    
    public Conexao() {

    }

    public static Connection conectar()throws SQLException{
        Connection conexao = DriverManager.getConnection(url, user, password);
        return conexao;
    }

    

}
