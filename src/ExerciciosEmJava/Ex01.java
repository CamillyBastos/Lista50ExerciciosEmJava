package ExerciciosEmJava;

import java.util.Scanner;
import java.util.Scanner;

public class Ex01 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite sua cidade: ");
            String cidade = sc.nextLine();

            System.out.println("Olá, " + nome + "! Você tem "
                    + idade + " anos e mora em " + cidade + ".");

            sc.close();
        }
    }

