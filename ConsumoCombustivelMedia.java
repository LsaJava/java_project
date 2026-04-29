import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a distância percorrida?");
        double distancia = teclado.nextDouble();

        System.out.println("Quantos litros de diesel foram gastos?");
        double litros = teclado.nextDouble();

        double media = distancia/litros;

        if(media < 2.2){
            System.out.println("Consumo Crítico! Verifique mecânica ou condução");
        }else if(media >= 2.2 && media <3.5){
            System.out.println("Consumo Normal para o trecho.");   
        }else {
            System.out.println("Excelente média! Condução econômica.");  
        }
    }
}