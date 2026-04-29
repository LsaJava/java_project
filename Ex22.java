import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da mercadoria");
        double merc = teclado.nextDouble();

        System.out.println("Qual a distancia em KM");
        int km = teclado.nextInt();

        double seguro;

        if (merc > 10000.00) {
            seguro = 200.00;
        } else {
            seguro = 50.00;
        }
        double freteBase = km * 2.50;
        double total = freteBase + seguro;

        System.out.println("Frete Base: R$ " + freteBase);
        System.out.println("Valor do Seguro: R$ " + seguro);
        System.out.println("O valor total do frete é: R$ " + total);

    }
}