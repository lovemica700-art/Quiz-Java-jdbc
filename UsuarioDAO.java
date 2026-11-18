package br.edu.ifpr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.modelo.Usuario;

public class UsuarioDAO {
    
     public void inserir(Usuario usuario) throws SQLException{
        String sql="INSERT INTO produtos(id,nome,,email,senha,tipo_peril,pontos) VALUES (?,?,?,?,?,?);";
        Connection conexao = null;
        PreparedStatement stmt = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, usuario.getId());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getSenha());
            stmt.setString(5, usuario.getTipo_perfil());
            stmt.setInt(6, usuario.getPontos());
            stmt.executeUpdate();
            System.out.println("Usuario inserido com sucesso");
            
        }catch(SQLException ex){
            System.out.println("Erro ao inserir usuario "+ex.getMessage());

        }finally{
            stmt.close();
            conexao.close();
        }

    }

    public List<Usuario> listar() throws SQLException{
        String sql = "SELECT * FROM usuario";
        List<Usuario> usuarios = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.conectar();
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setTipo_perfil(rs.getString("tipo_perfil"));
                usuario.setPontos(0);//(rs.getString("pontos"));
                usuarios.add(usuario);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar usuario "+ex.getMessage());
        } finally {
            rs.close();
            stmt.close();
            conexao.close();
        }
        return usuarios;

    }

}
