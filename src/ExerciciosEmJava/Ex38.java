package ExerciciosEmJava;
import java.util.Scanner;

public class Ex38 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a nota do aluno: ");
            double nota = sc.nextDouble();

            System.out.print("Digite a presença (%): ");
            double presenca = sc.nextDouble();

            if (nota < 0 || nota > 10 || presenca < 0 || presenca > 100) {
                System.out.println("Nota ou presença inválida.");
            } else if (nota >= 7 && presenca >= 75) {
                System.out.println("Aprovado.");
            } else if (nota >= 5 && nota < 7) {
                System.out.println("Recuperação.");
            } else {
                System.out.println("Reprovado.");
            }

            sc.close();
        }
    }

