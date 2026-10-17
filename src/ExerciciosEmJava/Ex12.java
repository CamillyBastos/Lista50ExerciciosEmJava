package ExerciciosEmJava;
import java.util.Scanner;

public class Ex12 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a nota do aluno: ");
            double nota = sc.nextDouble();

            if (nota >= 7) {
                System.out.println("Aluno aprovado.");
            }

            sc.close();
        }
    }

