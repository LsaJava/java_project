import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual numero de eixos?");
        int eixos = teclado.nextInt();

        System.out.println("Possui TAG? (1 para Sim, 0 para Não)");
        int tag = teclado.nextInt();

        double valorFinal = 0;
        if(tag == 1){
            valorFinal = eixos * 5.0;
            System.out.println("Pedágio Liberado (Tag).");
        }else{
            valorFinal = eixos * 7.5;    
            System.out.println("Pare na cabine (Pagamento Manual).");
        }
        System.out.println("O valor final é R$" + valorFinal);
    }
}