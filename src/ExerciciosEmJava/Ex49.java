package ExerciciosEmJava;
import java.util.Scanner;

public class Ex49 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("===== POSTO DE COMBUSTÍVEL =====");
            System.out.println("1 - Gasolina: R$ 5,80 por litro");
            System.out.println("2 - Etanol: R$ 4,20 por litro");
            System.out.println("3 - Diesel: R$ 6,00 por litro");

            System.out.print("Escolha o combustível: ");
            int tipo = sc.nextInt();

            System.out.print("Digite a quantidade de litros: ");
            double litros = sc.nextDouble();

            double preco = 0;
            String combustivel = "";

            switch (tipo) {
                case 1:
                    combustivel = "Gasolina";
                    preco = 5.80;
                    break;

                case 2:
                    combustivel = "Etanol";
                    preco = 4.20;
                    break;

                case 3:
                    combustivel = "Diesel";
                    preco = 6.00;
                    break;

                default:
                    System.out.println("Tipo de combustível inválido.");
                    sc.close();
                    return;
            }

            if (litros <= 0) {
                System.out.println("Quantidade de litros inválida.");
                sc.close();
                return;
            }

            double total = preco * litros;

            System.out.println("Combustível: " + combustivel);
            System.out.println("Preço por litro: R$ " + preco);
            System.out.println("Litros abastecidos: " + litros);
            System.out.println("Valor total a pagar: R$ " + total);

            sc.close();
        }
}
