package jogoCartas;

public class CartaDeAtaqueEspecial extends CartaDeAtaque{
    private String efeito;

    public CartaDeAtaqueEspecial(String nome, String tipo, Integer custo, Integer poder, Integer resistencia) {
        super(nome, tipo, custo, poder, resistencia);
    }

    public String exibirEfeito() {
        System.out.println(efeito);
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }
}
