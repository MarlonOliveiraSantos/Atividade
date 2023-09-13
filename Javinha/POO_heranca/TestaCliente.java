package Javinha.POO_heranca;

import Javinha.POO.Cliente;

public class TestaCliente {
    public static void main(String[] args) {
        PessoaFisica c1 = new PessoaFisica("Marlon","SaoPaulo",23,80,1.85,"555555666");
        PessoaFisica c2 = new PessoaFisica("Katarina","SaoPaulo",55,67,1.75,"444333777");

        PessoaJuridica c3 = new PessoaJuridica("Ltda","SaoPaulo",55,67,1.75,"12345678912345");
        PessoaJuridica c4 = new PessoaJuridica("Ltda","SaoPaulo",55,67,1.75,"12345678915050");

        c1.visualizar();
        c2.visualizar();
        c3.visualizar();
        c4.visualizar();

        ClienteMaximo c5 = new ClienteMaximo("Katarina","SaoPaulo",55,67,1.75);

        c5.resgatarBeneficios();
        c5.comprar();


    }
}
