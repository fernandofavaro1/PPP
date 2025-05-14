import java.util.List;

public class Pedido {
    private String cliente;
    private List<Double> itens;

    public Pedido(String cliente, List<Double> itens) {
        this.cliente = cliente;
        this.itens = itens;
    }
    public void processarPedido() {
        System.out.println("Processando pedido para o cliente: " + cliente);

        double subtotal = calculaSubtotal();
        double desconto = calculaDesconto(subtotal);
        double imposto = calculaImposto(subtotal, desconto);
        double total = calculaTotal(subtotal, desconto, imposto);
        exibirRecibo(subtotal, desconto, imposto, total);
    }

    public double calculaSubtotal(){
        double subtotal = 0;
        for (double item : itens) {
            subtotal += item;
        }
        return subtotal;
    }

    public double calculaDesconto(double subtotal) {
        double desconto = 0;
        if(subtotal > 100)
            return subtotal * 0.1;
        else throw new IllegalArgumentException("Erro ao calcular o desconto");
    }

    public double calculaImposto(double subtotal, double desconto) {
        return (subtotal - desconto) * 0.08;
    }

    public double calculaTotal(double subtotal, double desconto, double imposto){
        return subtotal - desconto + imposto;
    }

    public void exibirRecibo(double subtotal, double desconto, double imposto, double total) {
        System.out.println("Subtotal: R$" + subtotal);
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Imposto: R$" + imposto);
        System.out.println("Total: R$" + total);
    }
}



