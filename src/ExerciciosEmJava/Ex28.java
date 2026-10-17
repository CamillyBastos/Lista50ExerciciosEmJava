package ExerciciosEmJava;
import java.util.Scanner;

public class Ex28 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Saldo da conta: R$ ");
            double saldo = sc.nextDouble();

            System.out.print("Valor do saque: R$ ");
            double saque = sc.nextDouble();

            if (saque > 0 && saque <= saldo) {
                saldo = saldo - saque;

                System.out.println("Saque realizado com sucesso.");
                System.out.println("Saldo restante: R$ " + saldo);
            } else {
                System.out.println("Saldo insuficiente.");
            }

            sc.close();
        }
    }

