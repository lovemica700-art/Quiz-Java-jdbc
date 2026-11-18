package br.edu.ifpr.modelo;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String tipo_perfil;
    private int pontos;
   
   
    public Usuario() {
    }

    public Usuario(int id, String nome, String email, String senha, String tipo_perfil, int pontos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo_perfil = tipo_perfil;
        this.pontos = pontos;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getTipo_perfil() {
        return tipo_perfil;
    }
    public void setTipo_perfil(String tipo_perfil) {
        this.tipo_perfil = tipo_perfil;
    }
    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }


   
    
}
