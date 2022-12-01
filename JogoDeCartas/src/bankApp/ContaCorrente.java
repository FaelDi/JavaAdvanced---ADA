package bankApp;

public class ContaCorrente extends Conta{
    public ContaCorrente(Integer agencia, Integer numeroDaConta, TipoConta tipoConta, Double saldo, Double saldoInvestimento, Transacao transacao) {
        super(agencia, numeroDaConta, tipoConta, saldo, saldoInvestimento, transacao);
    }
}
