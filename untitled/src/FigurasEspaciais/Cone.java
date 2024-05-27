package FigurasEspaciais;

public class Cone {
    // Atributos
    public double altura;
    public double raio;

    // Método Construtor
    public Cone (double altura, double raio) {
        this.altura = altura;
        this.raio = raio;
    }

    // Métodos de Ação
    public double calcularVolume () {
        return ((1.0/3.0) * Math.PI * Math.pow(raio, 2) * altura);
    }


    public double calcularAreaSuperficial () {
        return (Math.PI * raio * (raio + Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.raio, 2))));
    }

    public String resumoForma (int valor) {
        String resumo = (String.format("\nO resultado das operações do Cone de Altura %.2f e Raio %.2f" +
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
