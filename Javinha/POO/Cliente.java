package Javinha.POO;

public class Cliente {

        private String nome, cidade;
        private int idade;
        private float peso;
        private double altura;


    public Cliente(String nome, String cidade, int idade, float peso, double altura) {
        this.nome = nome;
        this.cidade = cidade;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    //métodos SET
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //métodos GET
    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    //métodos

    public void visualizar() {
        System.out.println(nome + cidade + idade + peso + altura);

    }
}


