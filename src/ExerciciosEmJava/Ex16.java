package ExerciciosEmJava;
import java.util.Scanner;

public class Ex16 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Velocidade do veículo: ");
            double velocidade = sc.nextDouble();

            if (velocidade > 80) {
                System.out.println("Você foi multado.");
            }

            sc.close();
        }
    }

