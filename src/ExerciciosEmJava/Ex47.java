package ExerciciosEmJava;
import java.util.Scanner;

public class Ex47 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("===== CARDÁPIO =====");
            System.out.println("1 - Hambúrguer: R$ 25,00");
            System.out.println("2 - Pizza: R$ 40,00");
            System.out.println("3 - Salada: R$ 18,00");
            System.out.println("4 - Refrigerante: R$ 8,00");

            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            System.out.print("Digite a quantidade: ");
            int quantidade = sc.nextInt();

            double preco = 0;
            String produto = "";

            switch (opcao) {
                case 1:
                    produto = "Hambúrguer";
                    preco = 25.00;
                    break;

                case 2:
                    produto = "Pizza";
                    preco = 40.00;
                    break;

                case 3:
                    produto = "Salada";
                    preco = 18.00;
                    break;

                case 4:
                    produto = "Refrigerante";
                    preco = 8.00;
                    break;

                default:
                    System.out.println("Opção inválida.");
                    sc.close();
                    return;
            }

            if (quantidade <= 0) {
                System.out.println("Quantidade inválida.");
                sc.close();
                return;
            }

            double total = preco * quantidade;

            System.out.println("Produto escolhido: " + produto);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Valor total: R$ " + total);

            sc.close();
        }
    }

