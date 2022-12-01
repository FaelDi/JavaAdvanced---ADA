package jogoCartas;

public class CartaDeAtaque extends Carta{
    private Integer poder;
    private Integer resistencia;

    public CartaDeAtaque(String nome, String tipo, Integer custo, Integer poder, Integer resistencia) {
        super(nome, tipo, custo);
        this.poder = poder;
        this.resistencia = resistencia;
    }

    public Integer getPoder() {
        return poder;
    }

    public void setPoder(Integer poder) {
        this.poder = poder;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }
}
