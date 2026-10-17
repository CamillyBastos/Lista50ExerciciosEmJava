package ExerciciosEmJava;
import java.util.Scanner;

public class Ex48 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            double numero1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = sc.nextDouble();

            System.out.println("===== OPERAÇÕES =====");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            System.out.print("Escolha uma operação: ");
            int operacao = sc.nextInt();

            double resultado;

            switch (operacao) {
                case 1:
                    resultado = numero1 + numero2;
                    System.out.println("Resultado da soma: " + resultado);
                    break;

                case 2:
                    resultado = numero1 - numero2;
                    System.out.println("Resultado da subtração: " + resultado);
                    break;

                case 3:
                    resultado = numero1 * numero2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;

                case 4:
                    if (numero2 == 0) {
                        System.out.println("Não é possível dividir por zero.");
                    } else {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado da divisão: " + resultado);
                    }
                    break;

                default:
                    System.out.println("Operação inválida.");
            }

            sc.close();
        }
}
