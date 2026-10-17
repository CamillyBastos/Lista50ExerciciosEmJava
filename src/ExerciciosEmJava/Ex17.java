package ExerciciosEmJava;
import java.util.Scanner;

public class Ex17 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Valor da compra: R$ ");
            double valor = sc.nextDouble();

            if (valor >= 100) {
                System.out.println("Cliente ganhou desconto.");
            }

            sc.close();
        }
    }

