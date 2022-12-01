package bankApp;

public class PessoaJuridica extends Pessoa implements FuncionalidadesPessoa{

    public PessoaJuridica(String nome, String documento, String endereço, Conta contaCorrente, Conta contaInvestimentos) {
        super(nome, documento, endereço);
    }

    @Override
    public Conta abrirConta(TipoConta tipoConta) {
        return null;
    }
}
