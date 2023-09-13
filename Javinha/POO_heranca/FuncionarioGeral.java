package Javinha.POO_heranca;

public class FuncionarioGeral extends Funcionario implements interface_funcionario_1,interface_funcionario_2{
    public FuncionarioGeral (String nome, String cargo, int idade, float peso, double salario) {
        super(nome,cargo,idade,peso,salario);
    }

    @Override
    public void receberSalario() {
        System.out.println("\nRecebendo Sálario...");
    }

    @Override
    public void descontarFerias() {
        System.out.println("\nDescontando Férias...");
    }
}
