import java.util.List;

public class CartasTabuleiro {
    private List<Carta> cartaAtaque;
    private List<Carta> cartaAtaqueEspecial;

    public List<Carta> getCartaAtaque() {
        return cartaAtaque;
    }

    public void setCartaAtaque(List<Carta> cartaAtaque) {
        this.cartaAtaque = cartaAtaque;
    }

    public List<Carta> getCartaAtaqueEspecial() {
        return cartaAtaqueEspecial;
    }

    public void setCartaAtaqueEspecial(List<Carta> cartaAtaqueEspecial) {
        this.cartaAtaqueEspecial = cartaAtaqueEspecial;
    }
}
