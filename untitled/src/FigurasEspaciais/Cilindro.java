package FigurasEspaciais;

public class Cilindro {
    // Atributos
    public double altura;
    public double raio;

    // Método Construtor
    public Cilindro (double altura, double raio) {
        this.altura = altura;
        this.raio = raio;
    }

    // Métodos de Ação
    public double calcularVolume () {
        return (Math.PI * altura * Math.pow(raio, 2));
    }

    public double calcularAreaSuperficial () {
        return ((2 * Math.PI * raio * altura) + (2 * Math.PI * Math.pow(raio, 2)));
    }

    public String resumoForma (int valor) {
        String resumo = (String.format("\nO resultado das operações do Cilindro de Altura %.2f e Raio %.2f" +
                "\nO volume é igual a %.2f" +
                "\nA área da superficie é igual a %.2f\n\n", this.altura, this.raio, this.calcularVolume(),
                this.calcularAreaSuperficial()));

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }

        else {
            return resumo.toLowerCase();
        }
    }
}
