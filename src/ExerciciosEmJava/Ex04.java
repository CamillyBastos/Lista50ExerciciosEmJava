package ExerciciosEmJava;
import java.util.Scanner;

public class Ex04 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nome do produto: ");
            String produto = sc.nextLine();

            System.out.print("Valor unitário: R$ ");
            double valor = sc.nextDouble();

            System.out.print("Quantidade comprada: ");
            int quantidade = sc.nextInt();

            double total = valor * quantidade;

            System.out.println("Produto: " + produto);
            System.out.println("Valor total: R$ " + total);

            sc.close();
        }
    }
