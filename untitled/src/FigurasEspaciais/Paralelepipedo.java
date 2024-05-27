package FigurasEspaciais;

public class Paralelepipedo {
    // Atributos
    public double comprimento;
    public double altura;
    public double largura;

    // Método Construtor
    public Paralelepipedo (double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    // Métodos de Ação
    public double calcularVolume () {
        return (this.comprimento * this.altura * this.largura);
    }

    public double calcularAreaSuperficial () {
        return (2 * ((this.comprimento * this.altura) + (this.altura * this.largura) + (this.comprimento * this.largura)));
    }

    public String resumoForma (int valor) {
        String resumo = (String.format("\nO resultado das operações do Paralelepípedo de Comprimento %.2f, Altura %.2f e Largura %.2f" +
                        "\nO volume igual a %.2f" +
                        "\nA área da superficie é igual a %.2f\n\n", this.comprimento, this.altura, this.largura,
                this.calcularVolume(), this.calcularAreaSuperficial()));

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }

        else {
            return resumo.toLowerCase();
        }
    }
}