package ExerciciosEmJava;
import java.util.Scanner;

public class Ex02 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nome do aluno: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Nota final: ");
            double nota = sc.nextDouble();

            System.out.println("Aluno: " + nome
                    + " | Idade: " + idade
                    + " | Nota final: " + nota);

            sc.close();
        }
    }
