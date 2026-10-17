package ExerciciosEmJava;
import java.util.Scanner;

public class Ex18 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Porcentagem de presença: ");
            double presenca = sc.nextDouble();

            if (presenca >= 75) {
                System.out.println("Presença suficiente.");
            }

            sc.close();
        }
    }

