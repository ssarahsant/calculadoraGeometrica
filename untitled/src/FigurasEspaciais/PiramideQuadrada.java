package FigurasEspaciais;

public class PiramideQuadrada {
    // Atributos
    public double aresta_base;
    public double apotema;
    public double area_base;
    public double altura;

    // Método Construtor
    public PiramideQuadrada (double aresta_base, double apotema, double area_base, double altura) {
        this.aresta_base = aresta_base;
        this.apotema = apotema;
        this.area_base = area_base;
        this.altura = altura;
    }

    // Métodos de Ação
    public double calcularVolume () {
        return ((this.area_base * this.altura) / 3);
    }

    public double calcularAreaSuperficial () {
        return ((2 * this.aresta_base * this.apotema) + Math.pow(this.aresta_base, 2));
    }

    public String resumoForma (int valor) {
        String resumo = (String.format("\nO resultado das operações da Pirâmide Quadrada de Altura %.2f, Área da Base %.2f" +
                        "Apotema %.2f e Aresta da Base %.2f, " +
                        "\nO volume é igual a %.2f" +
                        "\nA área da superficieé igual a %.2f\n\n", this.altura, this.area_base, this.apotema,this.aresta_base,
                this.calcularVolume(), this.calcularAreaSuperficial()));

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }

        else {
            return resumo.toLowerCase();
        }
    }
}

