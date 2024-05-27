package FigurasEspaciais;

public class Esfera {
    // Atributos
    public double raio;

    // Método Construtor
    public Esfera (double raio) {
        this.raio = raio;
    }

    // Métodos de Ação
    public double calcularVolume () {
        return ((4.0/3.0) * Math.PI * Math.pow(this.raio, 3));
    }

    public double calcularAreaSuperficial () {
        return (4 * Math.PI * Math.pow(this.raio, 2));
    }

    public String resumoForma (int valor) {
        String resumo = (String.format("\nO resultado das operações da Esfera de Raio %.2f" +
                        "\nO volume é igual a %.2f" +
                        "\nA área superficial é igual a %.2f\n\n", this.raio, this.calcularVolume(),
                this.calcularAreaSuperficial()));

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        } else {
            return resumo.toLowerCase();
        }
    }
}
