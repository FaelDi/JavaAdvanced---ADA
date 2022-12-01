package bankApp;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Integer agencia, Integer numeroDaConta, TipoConta tipoConta, Double saldo, Double saldoInvestimento, Transacao transacao) {
        super(agencia, numeroDaConta, tipoConta, saldo, saldoInvestimento, transacao);
    }
}
