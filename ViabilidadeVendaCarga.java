
/**
Entradas: Valor de custo da carga e Valor de venda da carga.

O Desafio: Determinar a viabilidade da venda.

Regras:

Venda menor que o custo: exibir "Prejuízo".

Lucro menor que 20% do custo: exibir "Margem Baixa".

Lucro igual ou maior que 20% do custo: exibir "Margem Ideal".

Dica de %: Para calcular 20% do custo, use custo * 0.20.
 */

import java.util.Scanner;

public class Ex11 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual valor de custo da carga?");
        double valorCarga = teclado.nextDouble();
        
        System.out.println("Qual valor de venda da carga");
        double valorVendaCarga = teclado.nextDouble();
        
        double lucro = valorVendaCarga - valorCarga;
        if(valorVendaCarga < valorCarga){
            System.out.println("Prejuízo");
        } else if (valorVendaCarga - valorCarga < valorCarga * 0.20) {
            // Se (Venda - Custo) for menor que (Custo vezes 20%)
            System.out.println("Margem Baixa");
        }else {
            // Se não for prejuízo e nem margem baixa, só sobrou a ideal
            System.out.println("Margem Ideal");
        }
    }
}