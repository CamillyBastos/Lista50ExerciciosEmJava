package ExerciciosEmJava;
import java.util.Scanner;

public class Ex10 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nome do funcionário: ");
            String nome = sc.nextLine();

            System.out.print("Cargo: ");
            String cargo = sc.nextLine();

            System.out.print("Salário: R$ ");
            double salario = sc.nextDouble();

            System.out.print("Está ativo? (true/false): ");
            boolean ativo = sc.nextBoolean();

            System.out.println("Nome: " + nome);
            System.out.println("Cargo: " + cargo);
            System.out.println("Salário: R$ " + salario);
            System.out.println("Ativo na empresa: " + ativo);

            sc.close();
        }
    }

