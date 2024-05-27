package FigurasPlanas;

public class Retangulo {
    // Atributos
    public double base;
    public double altura;

    // Método Construtor
    public Retangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Métodos de Ação
    public double calcularArea () {
        return (this.base * this.altura);
    }

    public double calcularPerimetro () {
        return ((2 * this.base) + (2 * this.altura));
    }

    public String resumoForma (int valor) {
        String resumo = (String.format("\nO resultado das operações do Retângulo de base %.2f e altura %.2f" +
                "\nA área é igual a %.2f" +
                "\nO perímetro é igual a %.2f\n\n", this.base, this.altura, this.calcularArea(),this.calcularPerimetro()));

        if (valor % 2 == 0) {
            return  resumo.toUpperCase();
        }

        else {
            return  resumo.toLowerCase();
        }
    }
}