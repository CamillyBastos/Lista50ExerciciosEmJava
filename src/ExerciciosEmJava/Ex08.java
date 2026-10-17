package ExerciciosEmJava;
import java.util.Scanner;

public class Ex08 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número: ");
            double numero = sc.nextDouble();

            double dobro = numero * 2;
            double metade = numero / 2;

            System.out.println("Dobro: " + dobro);
            System.out.println("Metade: " + metade);

            sc.close();
        }
    }

