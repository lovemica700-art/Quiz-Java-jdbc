package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.modelo.Pergunta;



public class PerguntaDAO {
    
    public void inserir(Pergunta pergunta) throws SQLException{
        String sql="INSERT INTO perguntas(id,enunciado,opcao_correta,dificuldade,categoria) VALUES (?,?,?,?,?);";
        Connection conexao = null;
        PreparedStatement stmt = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, pergunta.getId());
            stmt.setString(2, pergunta.getEnunciado());
            stmt.setString(3, pergunta.getOpcao_correta());
            stmt.setString(4, pergunta.getDificuldade());
            stmt.setInt(5, pergunta.getCategoria().getId());
            stmt.executeUpdate();
            System.out.println("Pergunta inserido com sucesso");
            
        }catch(SQLException ex){
            System.out.println("Erro ao inserir pergunta "+ex.getMessage());

        }finally{
            stmt.close();
            conexao.close();
        }

    }

    public List<Pergunta> listar() throws SQLException{
        String sql = "SELECT * FROM perguntas";
        List<Pergunta> perguntas = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Pergunta pergunta = new Pergunta();
                pergunta.setId(rs.getInt("id"));
                pergunta.setEnunciado(rs.getString("enunciado"));
                pergunta.setOpcao_correta(rs.getString("opcao_corrta"));
                pergunta.setDificuldade(rs.getString("dificuldade"));
                pergunta.setCategoria(rs.getString("categoria"));

                perguntas.add(pergunta);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar perguntas "+ex.getMessage());
        } finally {
            rs.close();
            stmt.close();
            conexao.close();
        }
        return perguntas;
    }




}
