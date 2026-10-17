package ExerciciosEmJava;
import java.util.Scanner;

public class Ex06 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a medida em metros: ");
            double metros = sc.nextDouble();

            double centimetros = metros * 100;

            System.out.println("Centímetros: " + centimetros);

            sc.close();
        }
    }

