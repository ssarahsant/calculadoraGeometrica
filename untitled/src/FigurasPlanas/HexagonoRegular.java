package FigurasPlanas;

public class HexagonoRegular {
    // Atributos
    public double lado;

    // Método Construtor
    public HexagonoRegular (double lado) {
        this.lado = lado;
    }

    // Métodos de Ação
    public double calcularArea () {
        return (3 * Math.sqrt(3) * lado * lado) / 2;
    }


    public double calcularPerimetro () {
        return (lado * 6);
    }

    public String resumoForma (int valor) {
        String resumo = (String.format("\nO resultado das operações do Hexagono Regular de Lado %.2f" +
                "\nA área é igual a %.2f" +
                "\nO perímetro é igual a %.2f\n\n" +
                "", this.lado, this.calcularArea(),this.calcularPerimetro()));

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }

        else {
            return resumo.toLowerCase();
        }
    }
}