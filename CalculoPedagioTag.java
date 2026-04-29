
import java.util.Scanner;

public class Ex12 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual status da TAG");
        System.out.println("1 - Ativa / 0 - Inativa");
        int tag = teclado.nextInt();

        System.out.println("Qual a quantidade de eixos");
        int qtdEixos = teclado.nextInt();
        double valorTotal;

        if(tag != 1 && tag != 0){
            System.out.println("Status Errado");
        }else if(tag == 1){
            System.out.println("Valor: R$ 0.00 (TAG Ativa)");
        }else if(tag == 0){
            if (qtdEixos <= 2) {
                valorTotal = 16.50; // Valor fixo para os pequenos
            } else {
                valorTotal = qtdEixos * 13.00; // Valor por eixo para os grandes 
                System.out.println("Caminhão com " + qtdEixos + " eixos " + " Valor total : R$ " + valorTotal);
            }
        }
    }
}