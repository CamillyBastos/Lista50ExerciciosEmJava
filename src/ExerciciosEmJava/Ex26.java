package ExerciciosEmJava;
import java.util.Scanner;

public class Ex26 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Valor da compra: R$ ");
            double valor = sc.nextDouble();

            if (valor >= 150) {
                System.out.println("Frete grátis.");
            } else {
                System.out.println("Frete de R$ 20,00.");
            }

            sc.close();
        }
    }

