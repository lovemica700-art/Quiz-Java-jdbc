package br.edu.ifpr.modelo;

public class Resposta {

    private int id;
    private String opcao_escolhida;
    private Boolean acertou;
    private Tentativa tentativa;
    private Pergunta pergunta;
   
   
    public Resposta() {
    }

    public Resposta(int id, String opcao_escolhida, Boolean acertou, Tentativa tentativa, Pergunta pergunta) {
        this.id = id;
        this.opcao_escolhida = opcao_escolhida;
        this.acertou = acertou;
        this.tentativa = tentativa;
        this.pergunta = pergunta;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getOpcao_escolhida() {
        return opcao_escolhida;
    }
    public void setOpcao_escolhida(String opcao_escolhida) {
        this.opcao_escolhida = opcao_escolhida;
    }
    public Boolean getAcertou() {
        return acertou;
    }
    public void setAcertou(Boolean acertou) {
        this.acertou = acertou;
    }
    public Tentativa getTentativa() {
        return tentativa;
    }
    public void setTentativa(Tentativa tentativa) {
        this.tentativa = tentativa;
    }
    public Pergunta getPergunta() {
        return pergunta;
    }
    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }


}
