import java.util.Scanner;

public class CalculadoraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora Geométrica!");
        System.out.println("Escolha a figura geométrica (círculo, quadrado, retângulo, triângulo):");
        String figura = scanner.nextLine().toLowerCase();

        if (figura.equals("círculo")) {
            System.out.print("Digite o raio do círculo: ");
            double raio = scanner.nextDouble();
            Circulo circulo = new Circulo(raio);

            System.out.println("Escolha a operação (área ou perímetro):");
            String operacao = scanner.next().toLowerCase();

            if (operacao.equals("área")) {
                System.out.println("Área do Círculo: " + circulo.calcularArea());
            } else if (operacao.equals("perímetro")) {
                System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());
            } else {
                System.out.println("Operação inválida.");
            }
        } else if (figura.equals("quadrado")) {
            System.out.print("Digite o lado do quadrado: ");
            double lado = scanner.nextDouble();
            Quadrado quadrado = new Quadrado(lado);

            System.out.println("Escolha a operação (área ou perímetro):");
            String operacao = scanner.next().toLowerCase();

            if (operacao.equals("área")) {
                System.out.println("Área do Quadrado: " + quadrado.calcularArea());
            } else if (operacao.equals("perímetro")) {
                System.out.println("Perímetro do Quadrado: " + quadrado.calcularPerimetro());
            } else {
                System.out.println("Operação inválida.");
            }
        } else if (figura.equals("retângulo")) {
            System.out.print("Digite o comprimento do retângulo: ");
            double comprimento = scanner.nextDouble();
            System.out.print("Digite a largura do retângulo: ");
            double largura = scanner.nextDouble();
            Retangulo retangulo = new Retangulo(comprimento, largura);

            System.out.println("Escolha a operação (área ou perímetro):");
            String operacao = scanner.next().toLowerCase();

            if (operacao.equals("área")) {
                System.out.println("Área do Retângulo: " + retangulo.calcularArea());
            } else if (operacao.equals("perímetro")) {
                System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());
            } else {
                System.out.println("Operação inválida.");
            }
        } else if (figura.equals("triângulo")) {
            System.out.print("Digite o primeiro lado do triângulo: ");
            double lado1 = scanner.nextDouble();
            System.out.print("Digite o segundo lado do triângulo: ");
            double lado2 = scanner.nextDouble();
            System.out.print("Digite o terceiro lado do triângulo: ");
            double lado3 = scanner.nextDouble();
            Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

            System.out.println("Escolha a operação (área ou perímetro):");
            String operacao = scanner.next().toLowerCase();

            if (operacao.equals("área")) {
                System.out.println("Área do Triângulo: " + triangulo.calcularArea());
            } else if (operacao.equals("perímetro")) {
                System.out.println("Perímetro do Triângulo: " + triangulo.calcularPerimetro());
            } else {
                System.out.println("Operação inválida.");
            }
        } else {
            System.out.println("Figura geométrica inválida.");
        }

        scanner.close();
    }
}
