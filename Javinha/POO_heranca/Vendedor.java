package Javinha.POO_heranca;

public class Vendedor extends Cliente {

    private String vendasRealizadas;

    public Vendedor(String nome, String cargo, int idade, float peso, double salario, String vendasRealizadas) {
        super(nome,cargo,idade,peso,salario);
        this.vendasRealizadas = vendasRealizadas;
    }

    public String getVendasRealizadas() {
        return vendasRealizadas;
    }

    public void setVendasRealizadas(String vendasRealizadas) {
        this.vendasRealizadas = vendasRealizadas;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Vendas realizadas: " + vendasRealizadas + "\n");
    }
}
