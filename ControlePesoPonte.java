import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o peso do caminhão em KG?");
        double pesoKg = teclado.nextDouble(); // Mudamos para double

        System.out.println("Qual o limite da ponte em toneladas?");
        double limitePonte = teclado.nextDouble(); // Mudamos para double

        // Criamos uma variável para a conta ficar clara
        double pesoTonelada = pesoKg / 1000.0; 

        if (pesoTonelada > limitePonte) {
            System.out.println("Passagem Proibida! O caminhão tem " + pesoTonelada + "t e o limite é " + limitePonte + "t.");
        } else {
            System.out.println("Passagem Autorizada. Peso: " + pesoTonelada + "t.");
        }
    }
}
