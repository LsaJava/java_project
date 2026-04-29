import java.util.Scanner;

public class Ex09 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantas horas foram trabalhadas");
        double horasTrabalhadas = teclado.nextDouble();
        
        // Removi a linha 'double horasExtras =' que estava causando o erro
        
        if (horasTrabalhadas <= 160) {
            double total = horasTrabalhadas * 25;
            System.out.println("Salário normal: R$ " + total);
        } 
        else {
            // 1. Descobrimos quantas horas passaram de 160
            double extras = horasTrabalhadas - 160;
            
            // 2. Calculamos o fixo (160 * 25) + o adicional (extras * 40)
            double total = (160 * 25) + (extras * 40);
            
            System.out.println("Você fez " + extras + " horas extras!");
            System.out.println("Salário total com bônus: R$ " + total);
        }
    }
}   