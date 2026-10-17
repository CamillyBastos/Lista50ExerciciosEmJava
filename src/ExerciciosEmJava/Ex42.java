package ExerciciosEmJava;
import java.util.Scanner;

public class Ex42 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a nota do aluno: ");
            double nota = sc.nextDouble();

            String resultado = (nota >= 7)
                    ? "Aprovado."
                    : "Reprovado.";

            System.out.println(resultado);

            sc.close();
        }
    }
