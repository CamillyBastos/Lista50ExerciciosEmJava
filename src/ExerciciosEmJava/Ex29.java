package ExerciciosEmJava;
import java.util.Scanner;

public class Ex29 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Valor da compra: R$ ");
            double valor = sc.nextDouble();

            double desconto = 0;

            if (valor >= 200) {
                desconto = valor * 0.10;
            }

            double valorFinal = valor - desconto;

            System.out.println("Valor original: R$ " + valor);
            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Valor final: R$ " + valorFinal);

            sc.close();
        }
}
