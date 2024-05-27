package FigurasPlanas;

public class TrianguloEquilatero {
        // Atributos
        public double lado;

        // Método Construtor
        public TrianguloEquilatero (double lado) {
            this.lado = lado;
        }

        // Métodos de Ação
        public double calcularArea () {
                return (lado * lado * Math.sqrt(3) / 4);
        }


        public double calcularPerimetro () {
                return (lado * 3);
        }

        public String resumoForma (int valor) {
                String resumo = (String.format("\nO resultado das operações do Triângulo Equilátero de Lado %.2f" +
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