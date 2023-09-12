package Javinha.POO_heranca;

public class PessoaFisica extends Cliente {

    private String cpf;

    public PessoaFisica(String nome,String cidade, int idade, float peso, double altura, String cpf) {
        super(nome,cidade,idade,peso,altura);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Cpf da Pessoa Física: " + cpf + "\n");
    }
}
