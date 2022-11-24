
public class TabuleiroParty extends Tabuleiro {

    public TabuleiroParty(Integer limitDecks, Integer limitCartasNoDeck, Integer limitCartasAtaque, Integer limitCartasAtaqueEspecial) {
        super(limitDecks, limitCartasNoDeck, limitCartasAtaque, limitCartasAtaqueEspecial);
    }

    @Override
    public CartasTabuleiro getCartaTabuleiroFromDeck(Deck deck) {
        return getCartasTabuleiros().get(0);
    }


    @Override
    public Boolean verificarCarta(Carta carta, Deck deck) {
        if( deck.getVida() > carta.getCusto() ) {
            if(getCartasTabuleiros().get(0).getCartaAtaque().size() <= getLimitCartasAtaque()){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

}
