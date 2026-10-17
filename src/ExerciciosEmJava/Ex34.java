package ExerciciosEmJava;
import java.util.Scanner;

public class Ex34 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a temperatura: ");
            double temperatura = sc.nextDouble();

            if (temperatura < 15) {
                System.out.println("Frio.");
            } else if (temperatura <= 25) {
                System.out.println("Agradável.");
            } else if (temperatura <= 35) {
                System.out.println("Quente.");
            } else {
                System.out.println("Muito quente.");
            }

            sc.close();
        }
    }

