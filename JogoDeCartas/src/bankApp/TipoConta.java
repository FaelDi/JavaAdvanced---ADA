package bankApp;

public enum TipoConta {
    CONTA_CORRENTE("CONTA_CORRENTE"),
    CONTA_POUPANCA("CONTA_POUPANCA"),
    CONTA_INVESTIMENTO("CONTA_INVESTIMENTO");

    private String name;

    TipoConta(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
