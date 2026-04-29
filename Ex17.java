/*
 * O Cenário: Você está criando o software de monitoramento para um baú 
 * frigorífico que transporta carnes de exportação.

As Regras:

Abaixo de -18.0°C: "Temperatura ideal: Congelamento profundo."

Entre -18.0°C e -10.0°C: "Atenção: Temperatura subindo, verifique o termostato."

Acima de -10.0°C: "PERIGO: Carga em risco de descongelamento!
 */
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite qual temperatura do baú");
        double temperatura = teclado.nextDouble();

        if (temperatura < -18.0) {
            System.out.println("Temperatura ideal: Congelamento profundo.");
        }else if (temperatura >= -18.0 && temperatura <= -10.0) {
            System.out.println("Atenção: Temperatura subindo, verifique o termostato.");
        }else {
            System.out.println("PERIGO: Carga em risco de descongelamento!");
        }
    }
}