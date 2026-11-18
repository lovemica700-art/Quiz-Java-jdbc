package br.edu.ifpr.modelo;

public class Tentativa {

    private int id;
    private String nome;
    private int data_inicio;
    private int nota_final;
    private Usuario usuario;
    
    
    public Tentativa() {
    }

    public Tentativa(int id, String nome, int data_inicio, int nota_final, Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.data_inicio = data_inicio;
        this.nota_final = nota_final;
        this.usuario = usuario;
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
    public int getData_inicio() {
        return data_inicio;
    }
    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }
    public int getNota_final() {
        return nota_final;
    }
    public void setNota_final(double nota_final) {
        this.nota_final = nota_final;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setData_inicio(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setData_inicio'");
    }

    public void setNota_final(double double1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNota_final'");
    }
   

}
