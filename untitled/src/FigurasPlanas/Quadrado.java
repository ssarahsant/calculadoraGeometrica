package FigurasPlanas;

public class Quadrado {
    // Atributos
    public double lado;

    // Método Construtor
    public Quadrado (double lado) {
        this.lado = lado;
    }

    // Métodos de Ação
    public double calcularArea () {
        return (lado * lado);
    }

    public double calcularPerimetro () {
        return (4 * lado);
    }

    public String resumoForma (int valor) {
        String resumo = (String.format("\nO resultado das operações do Quadrado de Raio %.2f" +
                "\nA área é igual a %.2f" +
                "\nO perímetro é igual a %.2f \n\n", this.lado, this.calcularArea(),this.calcularPerimetro()));

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }

        else {
            return resumo.toLowerCase();
        }
    }
}