package br.edu.ifpr.modelo;

public class Pergunta {

    private int id;
    private String enunciado;
    private String opcao_correta;
    private String dificuldade;
    private Categoria categoria;
    
    
    public Pergunta() {
    }

    public Pergunta(int id, String enunciado, String opcao_correta, String dificuldade, Categoria categoria) {
        this.id = id;
        this.enunciado = enunciado;
        this.opcao_correta = opcao_correta;
        this.dificuldade = dificuldade;
        this.categoria = categoria;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEnunciado() {
        return enunciado;
    }
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    public String getOpcao_correta() {
        return opcao_correta;
    }
    public void setOpcao_correta(String opcao_correta) {
        this.opcao_correta = opcao_correta;
    }
    public String getDificuldade() {
        return dificuldade;
    }
    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
   

}
