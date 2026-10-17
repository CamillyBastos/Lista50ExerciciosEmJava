package ExerciciosEmJava;
import java.util.Scanner;

public class Ex45 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o salário do funcionário: R$ ");
            double salario = sc.nextDouble();

            double bonus = (salario < 3000) ? 500 : 200;

            double total = salario + bonus;

            System.out.println("Salário: R$ " + salario);
            System.out.println("Bônus: R$ " + bonus);
            System.out.println("Valor total: R$ " + total);

            sc.close();
        }
}
