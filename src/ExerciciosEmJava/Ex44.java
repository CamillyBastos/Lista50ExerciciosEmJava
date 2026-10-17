package ExerciciosEmJava;
import java.util.Scanner;

public class Ex44 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o valor da compra: R$ ");
            double compra = sc.nextDouble();

            double frete = (compra >= 150) ? 0 : 20;

            double valorFinal = compra + frete;

            System.out.println("Valor da compra: R$ " + compra);
            System.out.println("Valor do frete: R$ " + frete);
            System.out.println("Valor final: R$ " + valorFinal);

            sc.close();
        }
    }

