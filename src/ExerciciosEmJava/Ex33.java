package ExerciciosEmJava;
import java.util.Scanner;

public class Ex33 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite seu salário: R$ ");
            double salario = sc.nextDouble();

            if (salario < 0) {
                System.out.println("Salário inválido.");
            } else if (salario <= 1500) {
                System.out.println("Salário baixo.");
            } else if (salario <= 3000) {
                System.out.println("Salário médio.");
            } else if (salario <= 7000) {
                System.out.println("Salário bom.");
            } else {
                System.out.println("Salário alto.");
            }

            sc.close();
        }
    }

