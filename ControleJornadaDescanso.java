import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas horas foram dirigidas?");
        double horasDirigidas = teclado.nextDouble();

        System.out.println("O motorista fez a parada obrigatória de 30 minutos? (Use 1 para Sim e 0 para Não)");
        int paradaObr = teclado.nextInt();

        if(paradaObr != 0 && paradaObr != 1) {
            System.out.println("Código Errado");
        }else if (horasDirigidas > 5.5 && paradaObr == 0){
            System.out.println("Alerta: Motorista deve parar imediatamente para descanso!");
        }else if (horasDirigidas > 5.5 && paradaObr == 1){
            System.out.println("Jornada regular. Siga viagem.");
        }else {
            System.out.println("Horário de direção dentro do limite.");
        }
    }
}