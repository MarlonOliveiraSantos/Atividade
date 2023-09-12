package Javinha.POO_heranca;

public class PessoaJuridica extends Cliente {

    private String cnpj;

    public PessoaJuridica(String nome,String cidade, int idade, float peso, double altura, String cnpj) {
        super(nome,cidade,idade,peso,altura);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Cpf da Pessoa Juridica: " + cnpj + "\n");
    }
}
