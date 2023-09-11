package Javinha.POO;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario c1 = new Funcionario("Marlon","Operador",23,80,1.500);
        Funcionario c2 = new Funcionario("Katarina","Gerente de Vendas",55,67,3.000);

        c1.visualizar();
        c2.visualizar();
    }
}
