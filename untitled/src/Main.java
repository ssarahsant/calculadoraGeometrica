import FigurasEspaciais.*;
import FigurasPlanas.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criação do Objeto Scanner
        Scanner ler = new Scanner(System.in);

        int valor = 0, figura_plana = 0;

        // Entrada de Dados
        System.out.println("BEM VINDO À CALCULADORA DE FIGURAS GEOMÉTRICAS" +
                "\nPara continuar, informe seu nome: ");
        String nome_usuario = ler.nextLine();

        while (true) {
            // Entrada de Dados
            System.out.printf("\n%s, por favor selecione o tipo de figura desejada:" +
                    "\n1. Figuras Planas" +
                    "\n2. Figuras Espaciais" +
                    "\n3. Sair da Calculadora\n", nome_usuario);
            // Declaração de Variavel + Leitura
            int tipo_figura = Integer.parseInt(ler.nextLine());

            // Estrutura de Decisão (Opções de Escolha do Tipo de Figura)
            if (tipo_figura == 1) {

                while (true) {
                    try {
                        // Entrada de Dados
                        System.out.println("\nSelecione uma das seguintes opções de Figuras Planas, " +
                                "para obter o perímetro e área" +
                                "\n1. Círculo" +
                                "\n2. Hexágono Regular" +
                                "\n3. Quadrado" +
                                "\n4. Retângulo" +
                                "\n5. Triângulo Equilátero " +
                                "\n6. Voltar ao menu anterior\n");
                        figura_plana = Integer.parseInt(ler.nextLine());

                        // Estrutura de Decisão (Volta ao menu anterior)
                        if (figura_plana == 6) {
                            break;
                        } 

                        System.out.println("\nInsira um número para formatar a apresentação da resposta." +
                                "\nINSIRA UM VALOR PAR PARA FORMATÁ-LA COM LETRAS MAIÚSCULAS" +
                                "\nCaso deseje uma formatação com letras minúsculas, insira um valor ímpar ");
                        valor = Integer.parseInt(ler.nextLine());
                        if (valor <= 0) {
                            System.out.println("Tente novamente!" +
                                    "\nInsira um número maior e diferente de 0.");
                            continue;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Tente novamente!" +
                                "\nInsira somente números.");
                        continue;
                    }

                    // Opção de Escolha (figuras planas)
                    switch (figura_plana) {
                        // Círculo
                        case 1 -> {
                            while (true) {
                                try {
                                    System.out.printf("\n%s, por favor insira o valor do RAIO do Círculo: ", nome_usuario);
                                    double raio = Double.parseDouble(ler.nextLine());
                                    if (raio <= 0) {
                                        System.out.println("Tente novamente!" +
                                                "\nInsira um número maior e diferente de 0.");
                                    } else {
                                        Circulo circulo = new Circulo(raio);
                                        System.out.println(circulo.resumoForma(valor));
                                        break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Tente novamente!" +
                                            "\nInsira somente números.");
                                }
                            }
                        }

                        // Hexágono Regular
                        case 2 -> {
                            while (true) {
                                try {
                                    System.out.printf("\n%s, por favor insira o valor do LADO do Hexágono Regular: ", nome_usuario);
                                    double lado = Double.parseDouble(ler.nextLine());
                                    if (lado <= 0) {
                                        System.out.println("Tente novamente!" +
                                                "\nInsira um número maior e diferente de 0.");
                                    } else {
                                        HexagonoRegular hexagonoRegular = new HexagonoRegular(lado);
                                        System.out.println(hexagonoRegular.resumoForma(valor));
                                        break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Tente novamente!" +
                                            "\nInsira somente números.");
                                }
                            }
                        }

                        // Quadrado
                        case 3 -> {
                            while (true) {
                                try {
                                    System.out.printf("\n%s, por favor insira o valor do LADO do Quadrado: ", nome_usuario);
                                    double lado = Double.parseDouble(ler.nextLine());
                                    if (lado <= 0) {
                                        System.out.println("Tente novamente!" +
                                                "\nInsira um número maior e diferente de 0.");
                                    } else {
                                        Quadrado quadrado = new Quadrado(lado);
                                        System.out.println(quadrado.resumoForma(valor));
                                        break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Tente novamente!" +
                                            "\nInsira somente números.");
                                }
                            }
                        }

                        // Retângulo
                        case 4 -> {
                            while (true) {
                                try {
                                    System.out.printf("\n%s, por favor insira o valor da BASE do Retângulo: ", nome_usuario);
                                    double base = Double.parseDouble(ler.nextLine());
                                    System.out.printf("\n%s, por favor insira o valor da ALTURA do Retângulo: ", nome_usuario);
                                    double altura = Double.parseDouble(ler.nextLine());
                                    if (base <= 0 || altura <= 0) {
                                        System.out.println("Tente novamente!" +
                                                "\nInsira números maiores e diferentes de 0.");
                                    } else {
                                        Retangulo retangulo = new Retangulo(base, altura);
                                        System.out.println(retangulo.resumoForma(valor));
                                        break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Tente novamente!" +
                                            "\nInsira somente números.");
                                }
                            }
                        }

                        // Triângulo Equilátero
                        case 5 -> {
                            while (true) {
                                try {
                                    System.out.printf("\n%s, por favor insira o valor do LADO do Triângulo Equilátero: ", nome_usuario);
                                    double lado = Double.parseDouble(ler.nextLine());
                                    if (lado <= 0) {
                                        System.out.println("Tente novamente!" +
                                                "\nInsira um número maior e diferente de 0.");
                                    } else {
                                        TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(lado);
                                        System.out.println(trianguloEquilatero.resumoForma(valor));
                                        break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Tente novamente!" +
                                            "\nInsira somente números.");
                                }
                            }
                        }
                        default -> System.out.println("\nOpção inserida inválida, tente novamente");
                    }
                }
            }

            // Figuras Espaciais
            else if (tipo_figura == 2) {
                while (true) {
                    try {
                        // Entrada de Dados
                        System.out.println("\nSelecione uma das seguintes opções de Figuras Espaciais, " +
                                "para obter o volume e área" +
                                "\n1. Cilindro" +
                                "\n2. Cone" +
                                "\n3. Cubo" +
                                "\n4. Esfera" +
                                "\n5. Paralelepípedo" +
                                "\n6. Pirâmide Quadrada" +
                                "\n7. Voltar ao menu anterior");
                        figura_plana = Integer.parseInt(ler.nextLine());

                        // Estrutura de Decisão (Volta ao menu anterior)
                        if (figura_plana == 7) {
                            break;
                        }


                        System.out.println("\nInsira um número para formatar a apresentação da resposta." +
                                "\nINSIRA UM VALOR PAR PARA FORMATÁ-LA COM LETRAS MAIÚSCULAS" +
                                "\nCaso deseje uma formatação com letras minúsculas, insira um valor ímpar");
                        valor = Integer.parseInt(ler.nextLine());
                        if (valor <= 0) {
                            System.out.println("Tente novamente!" +
                                    "\nInsira um número maior e diferente de 0.");
                            continue;
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Tente novamente!" +
                                "\nInsira somente números.");
                        continue;
                    }

                    // Opção de Escolha (figuras espaciais)
                    switch (figura_plana) {
                        // Cilindro
                        case 1 -> {
                            while (true) {
                                try {
                                    System.out.printf("\n%s, por favor insira o valor da ALTURA do Cilindro: ", nome_usuario);
                                    double altura = Double.parseDouble(ler.nextLine());
                                    System.out.printf("\n%s, por favor insira o valor do RAIO do Cilindro: ", nome_usuario);
                                    double raio = Double.parseDouble(ler.nextLine());
                                    if (altura <= 0 || raio <= 0) {
                                        System.out.println("Tente novamente!" +
                                                "\nInsira números maiores e diferentes de 0.");
                                    } else {
                                        Cilindro cilindro = new Cilindro(altura, raio);
                                        System.out.println(cilindro.resumoForma(valor));
                                        break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Tente novamente!" +
                                            "\nInsira somente números.");
                                }
                            }
                        }

                        // Cone
                        case 2 -> {
                            while (true) {
                                try {
                                    System.out.printf("\n%s, por favor insira o valor da ALTURA do Cone: ", nome_usuario);
                                    double altura = Double.parseDouble(ler.nextLine());
                                    System.out.printf("\n%s, por favor insira o valor do RAIO do Cone: ", nome_usuario);
                                    double raio = Double.parseDouble(ler.nextLine());
                                    if (altura <= 0 || raio <= 0) {
                                        System.out.println("Tente novamente!" +
                                                "\nInsira números maiores e diferentes de 0.");
                                    } else {
                                        Cone cone = new Cone(altura, raio);
                                        System.out.println(cone.resumoForma(valor));
                                        break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Tente novamente!" +
                                            "\nInsira somente números.");
                                }
                            }
                        }

                        // Cubo
                        case 3 -> {
                            while (true) {
                                try {
                                    System.out.printf("\n%s, por favor insira o valor do LADO do Cubo: ", nome_usuario);
                                    double lado = Double.parseDouble(ler.nextLine());
                                    if (lado <= 0) {
                                        System.out.println("Tente novamente!" +
                                                "\nInsira um número maior e diferente de 0.");
                                    } else {
                                        Cubo cubo = new Cubo(lado);
                                        System.out.println(cubo.resumoForma(valor));
                                        break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Tente novamente!" +
                                            "\nInsira somente números.");
                                }
                            }
                        }

                        // Esfera
                        case 4 -> {
                            while (true) {
                                try {
                                    System.out.printf("\n%s, por favor insira o valor do RAIO da Esfera: ", nome_usuario);
                                    double raio = Double.parseDouble(ler.nextLine());
                                    if (raio <= 0) {
                                        System.out.println("Tente novamente!" +
                                                "\nInsira um número maior e diferente de 0.");
                                    } else {
                                        Esfera esfera = new Esfera(raio);
                                        System.out.println(esfera.resumoForma(valor));
                                        break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Tente novamente!" +
                                            "\nInsira somente números.");
                                }
                            }
                        }

                        // Paralelepípedo
                        case 5 -> {
                            while (true) {
                                try {
                                    System.out.printf("\n%s, por favor insira o valor do COMPRIMENTO do Paralelepípedo: ", nome_usuario);
                                    double comprimento = Double.parseDouble(ler.nextLine());
                                    System.out.printf("\n%s, por favor insira o valor da ALTURA do Paralelepípedo: ", nome_usuario);
                                    double altura = Double.parseDouble(ler.nextLine());
                                    System.out.printf("\n%s, por favor insira o valor da LARGURA do Paralelepípedo: ", nome_usuario);
                                    double largura = Double.parseDouble(ler.nextLine());
                                    if (comprimento <= 0 || altura <= 0 || largura <= 0) {
                                        System.out.println("Tente novamente!" +
                                                "\nInsira números maiores e diferentes de 0.");
                                    } else {
                                        Paralelepipedo paralelepipedo = new Paralelepipedo(comprimento, altura, largura);
                                        System.out.println(paralelepipedo.resumoForma(valor));
                                        break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Tente novamente!" +
                                            "\nInsira somente números.");
                                }
                            }
                        }

                        // Pirâmide Quadrada
                        case 6 -> {
                            while (true) {
                                try {
                                    System.out.printf("\n%s, por favor insira o valor da ARESTA DA BASE da Pirâmide Quadrada: ", nome_usuario);
                                    double aresta_base = Double.parseDouble(ler.nextLine());
                                    System.out.printf("\n%s, por favor insira o valor da APOTEMA da Pirâmide Quadrada: ", nome_usuario);
                                    double apotema = Double.parseDouble(ler.nextLine());
                                    System.out.printf("\n%s, por favor insira o valor da ÁREA DA BASE da Pirâmide Quadrada: ", nome_usuario);
                                    double area_base = Double.parseDouble(ler.nextLine());
                                    System.out.printf("\n%s, por favor insira o valor da ALTURA da Pirâmide Quadrada: ", nome_usuario);
                                    double altura = Double.parseDouble(ler.nextLine());
                                    if (aresta_base <= 0 || apotema <= 0 || area_base <= 0 || altura <= 0) {
                                        System.out.println("Tente novamente!" +
                                                "\nInsira números maiores e diferentes de 0.");
                                    } else {
                                        PiramideQuadrada piramideQuadrada = new PiramideQuadrada(aresta_base, apotema, area_base, altura);
                                        System.out.println(piramideQuadrada.resumoForma(valor));
                                        break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Tente novamente!" +
                                            "\nInsira somente números.");
                                }
                            }
                        }

                        default -> System.out.println("\nOpção inserida inválida, tente novamente");
                    }
                }
            }

            // Opção de Saída (fecha programa)
            else if (tipo_figura == 3) {
                System.exit(0);
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
