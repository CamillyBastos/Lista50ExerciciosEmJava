package ExerciciosEmJava;
import java.util.Scanner;

public class Ex13 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite seu saldo: R$ ");
            double saldo = sc.nextDouble();

            if (saldo > 0) {
                System.out.println("Você possui saldo disponível.");
            }

            sc.close();
        }
    }
