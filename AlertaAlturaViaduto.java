import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a altura do caminhão");
        double alturaCaminhao = teclado.nextDouble();

        System.out.println("Digite a altura máxima do viaduto");
        double alturaViaduto = teclado.nextDouble();

        double folga = alturaViaduto - alturaCaminhao;

        if(alturaCaminhao >= alturaViaduto){
            System.out.println("ROTA BLOQUEADA: Risco de colisão!");       
        }else if (folga < 0.30){
            System.out.println("Passagem livre e segura.");   
        }else {
            System.out.println("Passagem livre e segura. Folga de: " + folga + "m");   
        } 
    }
}
