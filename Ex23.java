import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos litros no tanque?");
        double litros = teclado.nextDouble();

        System.out.println("Possui cartão: 1 Para Sim, 2 Para Não");
        int cartao = teclado.nextInt();

        if(litros < 50 && cartao ==1){
            System.out.println("PARE! Abasteça agora.");
        }else if(litros <50 && cartao ==2){
            System.out.println("ALERTA: Procure posto credenciado.");
        }else
            System.out.println("Siga viagem");
    }
}