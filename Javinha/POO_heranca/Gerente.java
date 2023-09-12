package Javinha.POO_heranca;

public class Gerente extends Cliente {

    private String departamentosGerenciados;

    public Gerente(String nome, String cargo, int idade, float peso, double salario, String departamentosGerenciados) {
        super(nome,cargo,idade,peso,salario);
        this.departamentosGerenciados = departamentosGerenciados;
    }

    public String getDepartamentosGerenciados() {
        return departamentosGerenciados;
    }

    public void setDepartamentosGerenciados(String departamentosGerenciados) {
        this.departamentosGerenciados = departamentosGerenciados;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Departamentos Gerenciados: " + departamentosGerenciados + "\n");
    }
}
