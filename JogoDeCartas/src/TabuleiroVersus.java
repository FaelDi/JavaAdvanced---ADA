
public class TabuleiroVersus extends Tabuleiro {

    public TabuleiroVersus(Integer limitDecks, Integer limitCartasNoDeck, Integer limitCartasAtaque, Integer limitCartasAtaqueEspecial) {
        super(limitDecks, limitCartasNoDeck, limitCartasAtaque, limitCartasAtaqueEspecial);
    }

    @Override
    public CartasTabuleiro getCartaTabuleiroFromDeck(Deck deck) {
        return getCartasTabuleiros().get(getDecks().indexOf(deck));
    }

    @Override
    public Boolean verificarCarta(Carta carta, Deck deck){
        if( deck.getVida() > carta.getCusto() ) {
            //deck.setVida(deck.getVida()-carta.getCusto());
            CartasTabuleiro cartasTabuleiro = getCartaTabuleiroFromDeck(deck);
            if (carta instanceof CartaDeAtaqueEspecial) {
                if(cartasTabuleiro.getCartaAtaqueEspecial().size() <= getLimitCartasAtaqueEspecial()) {
                    return Boolean.TRUE;
                }
            } else  {
                if(cartasTabuleiro.getCartaAtaque().size() <= getLimitCartasAtaque()) {
                    return Boolean.TRUE;
                }
            }

        }
        return Boolean.FALSE;
    }

}
