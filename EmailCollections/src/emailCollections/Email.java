package emailCollections;

import java.util.Locale;

public class Email {

    private String remetente;
    private String dataDeEnvio;
    private String dataRecebimento;
    private String assunto;
    private String texto;
    private String pais;

    public Email(){

    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        pais = pais.toLowerCase(Locale.ROOT);
        this.pais = pais;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDataDeEnvio() {
        return dataDeEnvio;
    }

    public void setDataDeEnvio(String dataDeEnvio) {
        dataDeEnvio = dataDeEnvio.toLowerCase(Locale.ROOT);
        this.dataDeEnvio = dataDeEnvio;
    }

    public String getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(String dataRecebimento) {
        dataRecebimento = dataRecebimento.toLowerCase(Locale.ROOT);
        this.dataRecebimento = dataRecebimento;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        assunto = assunto.toLowerCase(Locale.ROOT);
        this.assunto = assunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        texto = texto.toLowerCase(Locale.ROOT);
        this.texto = texto;
    }
}
