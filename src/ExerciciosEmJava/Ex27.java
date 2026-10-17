package ExerciciosEmJava;
import java.util.Scanner;

public class Ex27 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite seu email: ");
            String email = sc.nextLine();

            System.out.print("Digite sua senha: ");
            String senha = sc.nextLine();

            if (email.equals("admin@email.com")
                    && senha.equals("123456")) {
                System.out.println("Login realizado com sucesso.");
            } else {
                System.out.println("Email ou senha inválidos.");
            }

            sc.close();
        }
    }

