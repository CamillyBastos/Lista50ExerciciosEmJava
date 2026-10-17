package ExerciciosEmJava;
import java.util.Scanner;

public class Ex25 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.print("Possui CNH? (true/false): ");
            boolean cnh = sc.nextBoolean();

            if (idade >= 18 && cnh) {
                System.out.println("Pode dirigir.");
            } else {
                System.out.println("Não pode dirigir.");
            }

            sc.close();
        }
    }

