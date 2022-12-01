package bankApp;

public class ContaInvestimento extends Conta{
    private Double taxaInvestimento;

    public ContaInvestimento(Integer agencia, Integer numeroDaConta, TipoConta tipoConta, Double saldo, Double saldoInvestimento, Transacao transacao) {
        super(agencia, numeroDaConta, tipoConta, saldo, saldoInvestimento, transacao);
        this.taxaInvestimento = 0.2;
    }
}
