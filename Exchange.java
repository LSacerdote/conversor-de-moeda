public class Exchange {

    private final double cotacaoDolar = 5.5;
    private final double iof = 0.0586;
    private final double taxaOperacaoEmPercentual = 1;

    public double comprarDolar(double valorReal) {
        double valorDolar = valorReal / cotacaoDolar; 
        double valorDolarComIOF = valorDolar - (valorDolar * iof); 
        double taxaOperacao = valorDolar * (taxaOperacaoEmPercentual / 100); 
        double valorDolarFinal = valorDolarComIOF - taxaOperacao;
        
        
        return valorDolarFinal;
    }

    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        double valorReal = 1000;
        double valorDolar = exchange.comprarDolar(valorReal);
        System.out.println("Valor em dólar: " + valorDolar);
    }
}
