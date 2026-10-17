package ExerciciosEmJava;
import java.util.Scanner;

public class Ex20 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Você está logado? (true/false): ");
            boolean logado = sc.nextBoolean();

            if (logado) {
                System.out.println("Bem-vindo ao sistema.");
            }

            sc.close();
        }
    }

