package Javinha.POO_heranca;

import Javinha.POO.Funcionario;

public class TestaFuncionario {
    public static void main(String[] args) {
        Gerente d1 = new Gerente("Marlon","Gerente",23,80,1.500,"4");
        Gerente d2 = new Gerente("Katarina","Gerente",55,67,3.000,"9");

        Vendedor d3 = new Vendedor("Rosivaldo","Vendedor",55,67,3.000,"60");
        Vendedor d4 = new Vendedor("Edmarildo","Vendedor",55,67,3.000,"34");

        d1.visualizar();
        d2.visualizar();
        d3.visualizar();
        d4.visualizar();
    }
}
