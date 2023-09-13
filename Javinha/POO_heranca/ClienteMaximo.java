package Javinha.POO_heranca;

public class ClienteMaximo extends Cliente implements interface_cliente_normal, interface_cliente_vip{
    public ClienteMaximo(String nome, String cidade, int idade, float peso, double altura) {
        super(nome,cidade,idade,peso,altura);
    }

    @Override
    public void comprar() {
        System.out.println("\nComprando...");
    }

    @Override
    public void resgatarBeneficios() {
        System.out.println("\nResgatando Beneficios...");
    }

}
