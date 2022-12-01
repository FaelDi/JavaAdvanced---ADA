package jogoCartas;

import java.util.List;

public class Deck {
    private List<Carta> carta;
    private Integer vida;

    public Deck(List<Carta> carta) {
        this.carta = carta;
        this.vida = 100;
    }

    public List<Carta> getCartas() {
        return carta;
    }

    public void setCartas(List<Carta> carta) {
        this.carta = carta;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }
}
