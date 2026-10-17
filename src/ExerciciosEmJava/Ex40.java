package ExerciciosEmJava;
import java.util.Scanner;

public class Ex40 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Total gasto pelo cliente no mês: R$ ");
            double totalGasto = sc.nextDouble();

            if (totalGasto < 0) {
                System.out.println("Valor inválido.");
            } else if (totalGasto <= 100) {
                System.out.println("Cliente comum.");
            } else if (totalGasto <= 500) {
                System.out.println("Cliente bronze.");
            } else if (totalGasto <= 1000) {
                System.out.println("Cliente prata.");
            } else {
                System.out.println("Cliente ouro.");
            }

            sc.close();
        }
}
