/**
Balança de Ponte (Conversão Kg para Toneladas)
Você está na entrada de uma ponte antiga. O limite de peso da ponte está em Toneladas (t), 
mas a balança do caminhão mede em Quilos (kg).

Entrada 1: Peso do caminhão em Kg (ex: 12500).

Entrada 2: Limite da ponte em Toneladas (ex: 10).

A Conta: Você deve dividir o Peso em Kg por 1000 para achar as Toneladas.

Regra: * Se o peso convertido for maior que o limite: "Passagem Proibida! Excesso de carga."

Se for menor ou igual: "Passagem Autorizada." 
 */
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
