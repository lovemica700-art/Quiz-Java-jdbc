package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.modelo.Tentativa;

public class TentativaDAO {
    
     public void inserir(Tentativa tentativa) throws SQLException{
        String sql="INSERT INTO produtos(id,data_inicio, nota_final,usuario) VALUES (?,?,?,?);";
        Connection conexao = null;
        PreparedStatement stmt = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, tentativa.getId());
            stmt.setInt(2, tentativa.getData_inicio());
            stmt.setInt(3, tentativa.getNota_final());
            stmt.setInt(4, tentativa.getUsuario().getId());
            stmt.executeUpdate();
            System.out.println("Produto inserido com sucesso");
            
        }catch(SQLException ex){
            System.out.println("***** Tentativa "+ex.getMessage());

        }finally{
            stmt.close();
            conexao.close();
        }

    }

    public List<Tentativa> listar() throws SQLException{
        String sql = "SELECT * FROM produtos";
        List<Tentativa> tentativas = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Tentativa tentativa = new Tentativa();
                tentativa.setId(rs.getInt("id"));
                tentativa.setData_inicio(rs.getString("data_inicio"));
                tentativa.setNota_final(rs.getDouble("nota_final"));
                tentativas.add(tentativa);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao Tentar "+ex.getMessage());
        } finally {
            rs.close();
            stmt.close();
            conexao.close();
        }
        return tentativas;

    }

    public Tentativa buscarId(int id) throws SQLException{
        String sql = "SELECT * FROM tentativas WHERE id=?";
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs.next()){
                Tentativa tentativa = new Tentativa();
                tentativa.setId(rs.getInt("id"));
                tentativa.setData_inicio(rs.getString("data_inicio"));
                tentativa.setNota_final(rs.getDouble("nota_final"));
                //tentativas.add(tentativa);
                return tentativa;
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao Tentar "+ex.getMessage());
        } finally {
            rs.close();
            stmt.close();
            conexao.close();
        }
        return null;

    }


}    
