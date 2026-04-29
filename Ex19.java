import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o Tipo de carga: (Use 1 para Perecível, 2 para Eletrônico, 3 para Outros");
        int tipoCarga = teclado.nextInt();

        System.out.println("Digite o valor da carga");
        double valorCarga = teclado.nextDouble();

        if(tipoCarga == 1 || valorCarga > 10000){
            System.out.println("CARGA COM PRIORIDADE MÁXIMA: Saída imediata!");   
        }else{
            System.out.println("Carga em espera. Seguir cronograma normal.");
        }
    }
}