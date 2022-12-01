package jogoCartas;

public abstract class Carta {
    private String nome;
    private String tipo;
    private Integer custo;

    public Carta(String nome, String tipo, Integer custo) {
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCusto() {
        return custo;
    }

    public void setCusto(Integer custo) {
        this.custo = custo;
    }
}
