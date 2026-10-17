package ExerciciosEmJava;
import java.util.Scanner;

public class Ex32 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a nota do aluno: ");
            double nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida.");
            } else if (nota >= 9) {
                System.out.println("Excelente.");
            } else if (nota >= 7) {
                System.out.println("Bom.");
            } else if (nota >= 5) {
                System.out.println("Recuperação.");
            } else {
                System.out.println("Reprovado.");
            }

            sc.close();
        }
    }
