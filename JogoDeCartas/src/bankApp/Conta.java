package bankApp;

public abstract class Conta {
    private Integer agencia;
    private Integer numeroDaConta;
    private TipoConta tipoConta;
    private Double saldo;
    private Double saldoInvestimento;
    private Transacao transacao;

    public Conta(Integer agencia, Integer numeroDaConta, TipoConta tipoConta, Double saldo, Double saldoInvestimento, Transacao transacao) {
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.saldoInvestimento = saldoInvestimento;
        this.transacao = transacao;
    }

    public Boolean sacar(Double valorDeSaque) {
        Double taxaTransação = valorDeSaque*this.transacao.getTaxa();

        if(this.saldo >= valorDeSaque+taxaTransação){
            this.saldo = this.saldo - taxaTransação;
            this.saldo = this.saldo - valorDeSaque;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean depositar(Double valorDeDeposito) {
            if(valorDeDeposito >= 0){
                this.saldo += valorDeDeposito;
                return Boolean.TRUE;
            }
        System.out.println("valor de deposito negativo!");
        return Boolean.FALSE;
    }

    public Boolean transferir(Conta contaDeDestino, Double valorDeTransferencia){
        Double taxaTransação = valorDeTransferencia*this.transacao.getTaxa();

        if(this.saldo >= valorDeTransferencia+taxaTransação){
            this.saldo = this.saldo - taxaTransação;
            this.saldo = this.saldo - valorDeTransferencia;
            contaDeDestino.depositar(valorDeTransferencia);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Double consultarSaldo(){
        return this.saldo;
    };

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }
}
