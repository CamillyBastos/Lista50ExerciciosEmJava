package ExerciciosEmJava;
import java.util.Scanner;

public class Ex23 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Saldo do cliente: R$ ");
            double saldo = sc.nextDouble();

            System.out.print("Valor do produto: R$ ");
            double produto = sc.nextDouble();

            if (saldo >= produto) {
                System.out.println("Compra aprovada.");
            } else {
                System.out.println("Saldo insuficiente.");
            }

            sc.close();
        }
    }
