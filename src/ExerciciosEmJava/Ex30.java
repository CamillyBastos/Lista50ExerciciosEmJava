package ExerciciosEmJava;
import java.util.Scanner;

public class Ex30 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite sua senha: ");
            String senha = sc.nextLine();

            if (senha.equals("java123")) {
                System.out.println("Acesso liberado.");
            } else {
                System.out.println("Senha incorreta.");
            }

            sc.close();
        }
    }

