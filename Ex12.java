
/**
Neste exercício, você vai lidar com um valor fixo se for carro/caminhão pequeno e um valor 
por eixo se for maior, além da condição da TAG.
Entradas:
Quantidade de eixos (int).
Status da TAG (int): sendo 1 para Ativa e 0 para Inativa.
Regras:
Se a TAG for 1: O valor exibido deve ser sempre 0.00.
Se a TAG for 0: Caminhões com até 2 eixos: Valor fixo de R$ 16,50
 */
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