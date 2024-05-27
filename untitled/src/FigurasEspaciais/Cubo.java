package FigurasEspaciais;

public class Cubo {
    // Atributos
    public double lado;

    // Método Construtor
    public Cubo (double lado) {
        this.lado = lado;
    }

    // Métodos de Ação
    public double calcularVolume () {
        return (Math.pow(this.lado, 3));
    }

    public double calcularAreaSuperficial () {
        return (Math.pow(this.lado, 2) * 6);
    }

    public String resumoForma (int valor) {
        String resumo = (String.format("\nO resultado das operações do Cubo de Lado %.2f" +
                        "\nO volume é igual a %.2f" +
                        "\nA área da superficie é igual a %.2f\n\n", this.lado, this.calcularVolume(),
                this.calcularAreaSuperficial()));

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }

        else {
            return resumo.toLowerCase();
        }
    }
}

