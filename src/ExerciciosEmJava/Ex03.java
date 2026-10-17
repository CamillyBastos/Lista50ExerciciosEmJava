package ExerciciosEmJava;
import java.util.Scanner;
import java.time.Year;

public class Ex03 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite seu ano de nascimento: ");
            int nascimento = sc.nextInt();

            int anoAtual = Year.now().getValue();
            int idade = anoAtual - nascimento;

            System.out.println("Sua idade aproximada é: " + idade + " anos.");

            sc.close();
        }
    }

