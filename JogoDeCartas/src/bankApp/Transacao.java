package bankApp;

public abstract  class Transacao {
    private Double taxa;

    public Transacao(Double taxa) {
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
}
