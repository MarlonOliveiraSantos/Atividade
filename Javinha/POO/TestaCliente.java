package Javinha.POO;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Marlon","SaoPaulo",23,80,1.85);
        Cliente c2 = new Cliente("Katarina","SaoPaulo",55,67,1.75);

        c1.visualizar();
        c2.visualizar();
    }
}
