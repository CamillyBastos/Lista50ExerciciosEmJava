package ExerciciosEmJava;
import java.util.Scanner;

public class Ex22 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a nota final: ");
            double nota = sc.nextDouble();

            if (nota >= 7) {
                System.out.println("Aprovado.");
            } else {
                System.out.println("Reprovado.");
            }

            sc.close();
        }
    }

