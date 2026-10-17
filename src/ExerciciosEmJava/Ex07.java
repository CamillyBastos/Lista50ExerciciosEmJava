package ExerciciosEmJava;
import java.util.Scanner;

public class Ex07 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Quanto ganha por hora? R$ ");
            double valorHora = sc.nextDouble();

            System.out.print("Quantas horas trabalhou no mês? ");
            double horas = sc.nextDouble();

            double salario = valorHora * horas;

            System.out.println("Salário bruto: R$ " + salario);

            sc.close();
        }
    }

