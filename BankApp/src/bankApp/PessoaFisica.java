package bankApp;

public class PessoaFisica extends Pessoa implements FuncionalidadesPessoa{
    private Conta contaPoupança;

    public PessoaFisica(String nome, String documento, String endereço, Conta contaCorrente, Conta contaInvestimentos, Conta contaPoupança) {
        super(nome, documento, endereço);
        this.contaPoupança = contaPoupança;
    }


    @Override
    public Conta abrirConta(TipoConta tipoConta) {
         Conta contaCriada = null;
         Transacao tipoTransacao = new TransacaoPF();
         switch (tipoConta){
             case CONTA_CORRENTE:
                 contaCriada = new ContaCorrente(MathUtils.generateNumber(MathUtils.NUMBER_MIL),MathUtils.generateNumber(MathUtils.NUMBER_MIL),tipoConta, MathUtils.DOUBLE_ZERO, MathUtils.DOUBLE_ZERO, tipoTransacao);
                 this.setContaCorrente(contaCriada);
                 break;
             case CONTA_POUPANCA:
                 contaCriada = new ContaPoupanca(MathUtils.generateNumber(MathUtils.NUMBER_MIL),MathUtils.generateNumber(MathUtils.NUMBER_MIL),tipoConta, MathUtils.DOUBLE_ZERO, MathUtils.DOUBLE_ZERO, tipoTransacao);
                 this.contaPoupança = contaCriada;
             case CONTA_INVESTIMENTO:
                 contaCriada = new ContaInvestimento(MathUtils.generateNumber(MathUtils.NUMBER_MIL),MathUtils.generateNumber(MathUtils.NUMBER_MIL),tipoConta, MathUtils.DOUBLE_ZERO, MathUtils.DOUBLE_ZERO, tipoTransacao);
                 this.setContaInvestimentos(contaCriada);
         }
         return contaCriada;
    }
}
