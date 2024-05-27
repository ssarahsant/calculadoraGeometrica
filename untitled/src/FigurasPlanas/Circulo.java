package FigurasPlanas;

public class Circulo {
    // Atributos
    public double raio;

    // Método Construtor
    public Circulo (double raio) {
        this.raio = raio;
    }

    // Métodos de Ação
    public double calcularArea () {
        return (Math.PI * Math.pow(this.raio, 2));
    }

    public double calcularPerimetro () {
        return (2 * Math.PI * this.raio);
    }

    public String resumoForma (int valor) {
        String resumo = (String.format("\nO resultado das operações do Circulo de Raio %.2f" +
                "\nA área é igual a %.2f" +
                "\nO perímetro é igual a %.2f\n\n", this.raio, this.calcularArea(),this.calcularPerimetro()));

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }

        else {
            return resumo.toLowerCase();
        }
    }
}