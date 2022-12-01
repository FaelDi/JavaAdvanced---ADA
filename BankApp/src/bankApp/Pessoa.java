package bankApp;

public abstract class Pessoa {
    private String nome;
    private String documento;
    private String endereço;
    private Conta contaCorrente;
    private Conta contaInvestimentos;

    public Pessoa(String nome, String documento, String endereço) {
        this.nome = nome;
        this.documento = documento;
        this.endereço = endereço;
    }

    public void setContaCorrente(Conta contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public void setContaInvestimentos(Conta contaInvestimentos) {
        this.contaInvestimentos = contaInvestimentos;
    }

    public Conta getContaCorrente() {
        return contaCorrente;
    }

    public Conta getContaInvestimentos() {
        return contaInvestimentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
}
