import java.util.List;
import java.util.stream.Collectors;

public abstract class Tabuleiro {

    private List<Deck> decks;

    private List<CartasTabuleiro> cartasTabuleiros;

    private Integer limitDecks;

    private Integer limitCartasNoDeck;

    private Integer limitCartasAtaque;

    private Integer limitCartasAtaqueEspecial;


    public Tabuleiro(Integer limitDecks, Integer limitCartasNoDeck, Integer limitCartasAtaque, Integer limitCartasAtaqueEspecial) {
        this.limitDecks = limitDecks;
        this.limitCartasNoDeck = limitCartasNoDeck;
        this.limitCartasAtaque = limitCartasAtaque;
        this.limitCartasAtaqueEspecial = limitCartasAtaqueEspecial;
    }

    public List<Deck> getDecks() {
        return decks;
    }

    public List<CartasTabuleiro> getCartasTabuleiros() {
        return cartasTabuleiros;
    }

    public Integer getLimitCartasAtaque() {
        return limitCartasAtaque;
    }

    public Integer getLimitCartasAtaqueEspecial() {
        return limitCartasAtaqueEspecial;
    }

    public Boolean inserirDeck(Deck deck) {
        if(this.decks.size() <= this.limitDecks){
            if(deck.getCartas().size() == this.limitCartasNoDeck) {
                this.decks.add(deck);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public abstract CartasTabuleiro getCartaTabuleiroFromDeck(Deck deck);

    public abstract Boolean verificarCarta(Carta carta, Deck deck);

    public Deck verificaVitoria(){
        List<Deck> winner = getDecks().stream().filter(deck -> deck.getVida() > 0).collect(Collectors.toList());
        return winner.size() > 1 ? null : winner.get(0);
    }
}
