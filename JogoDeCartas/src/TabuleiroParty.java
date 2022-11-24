
public class TabuleiroParty extends Tabuleiro {

    CartasTabuleiro cartasTabuleiro;

    public TabuleiroParty(Integer limitDecks, Integer limitCartasNoDeck, Integer limitCartasAtaque, Integer limitCartasAtaqueEspecial) {
        super(limitDecks, limitCartasNoDeck, limitCartasAtaque, limitCartasAtaqueEspecial);
    }

    @Override
    public CartasTabuleiro getCartaTabuleiroFromDeck(Deck deck) {
        return this.cartasTabuleiro;
    }


    @Override
    public Boolean verificarCarta(Carta carta, Deck deck) {
        if( deck.getVida() > carta.getCusto() ) {
            if(cartasTabuleiro.getCartaAtaque().size() <= getLimitCartasAtaque()){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

}
