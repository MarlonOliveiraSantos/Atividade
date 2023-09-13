package Javinha.POO_heranca;

public abstract class Funcionario {
    private String nome, cargo;
    private int idade;
    private float peso;
    private double salario;



    public Funcionario(String nome, String cargo, int idade, float peso, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.peso = peso;
        this.salario = salario;
    }

    //métodos SET
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //métodos GET
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public double getSalario() {
        return salario;
    }

    //métodos

    public void visualizar() {
        System.out.println(nome + cargo + idade + peso + salario);

    }

}
