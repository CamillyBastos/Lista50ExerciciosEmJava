package ExerciciosEmJava;
import java.util.Scanner;

public class Ex50 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("===== PLANOS DE ASSINATURA =====");
            System.out.println("1 - Básico: R$ 29,90 por mês");
            System.out.println("2 - Intermediário: R$ 59,90 por mês");
            System.out.println("3 - Premium: R$ 99,90 por mês");

            System.out.print("Escolha o plano: ");
            int plano = sc.nextInt();

            System.out.print("Quantidade de meses: ");
            int meses = sc.nextInt();

            double valorMensal = 0;
            String nomePlano = "";

            switch (plano) {
                case 1:
                    nomePlano = "Básico";
                    valorMensal = 29.90;
                    break;

                case 2:
                    nomePlano = "Intermediário";
                    valorMensal = 59.90;
                    break;

                case 3:
                    nomePlano = "Premium";
                    valorMensal = 99.90;
                    break;

                default:
                    System.out.println("Plano inválido.");
                    sc.close();
                    return;
            }

            if (meses <= 0) {
                System.out.println("Quantidade de meses inválida.");
                sc.close();
                return;
            }

            double valorSemDesconto = valorMensal * meses;
            double desconto = 0;

            if (meses >= 12) {
                desconto = valorSemDesconto * 0.10;
            }

            double valorFinal = valorSemDesconto - desconto;

            System.out.println("\n===== RESUMO DO CONTRATO =====");
            System.out.println("Nome do plano: " + nomePlano);
            System.out.println("Valor mensal: R$ " + valorMensal);
            System.out.println("Quantidade de meses: " + meses);
            System.out.println("Valor sem desconto: R$ " + valorSemDesconto);
            System.out.println("Valor do desconto: R$ " + desconto);
            System.out.println("Valor final do contrato: R$ " + valorFinal);

            sc.close();
        }
}
