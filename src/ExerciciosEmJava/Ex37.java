package ExerciciosEmJava;
import java.util.Scanner;

public class Ex37 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Valor da compra: R$ ");
            double valor = sc.nextDouble();

            double percentual = 0;

            if (valor < 0) {
                System.out.println("Valor inválido.");
                sc.close();
                return;
            } else if (valor <= 100) {
                percentual = 0;
            } else if (valor <= 300) {
                percentual = 0.05;
            } else if (valor <= 500) {
                percentual = 0.10;
            } else {
                percentual = 0.15;
            }

            double desconto = valor * percentual;
            double valorFinal = valor - desconto;

            System.out.println("Valor original: R$ " + valor);
            System.out.println("Desconto aplicado: " + (percentual * 100) + "%");
            System.out.println("Valor do desconto: R$ " + desconto);
            System.out.println("Valor final: R$ " + valorFinal);

            sc.close();
        }
    }

