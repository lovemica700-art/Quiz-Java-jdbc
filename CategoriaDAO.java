package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.modelo.Categoria;

public class CategoriaDAO {

    public void inserir(Categoria categoria) throws SQLException{
        String sql="INSERT INTO categorias(id,nome) VALUES (?,?);";
        Connection conexao = null;
        PreparedStatement stmt = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, categoria.getId());
            stmt.setString(2, categoria.getNome());
            stmt.executeUpdate();
            System.out.println("Categoria inserido com sucesso");
            
        }catch(SQLException ex){
            System.out.println("Erro ao inserir categoria "+ex.getMessage());

        }finally{
            stmt.close();
            conexao.close();
        }

    }

    public List<Categoria> listar() throws SQLException{
        String sql = "SELECT * FROM categorias";
        List<Categoria> categorias = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setNome(rs.getString("nome"));
                categorias.add(categoria);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar categorias "+ex.getMessage());
        } finally {
            rs.close();
            stmt.close();
            conexao.close();
        }
        return categorias;
    }

}
