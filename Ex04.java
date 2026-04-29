//4. Filtro de Combustível (Diesel vs Gasolina)
//Peça ao motorista para digitar "D" para Diesel ou "G" para Gasolina.
//Condição: Se for "D", exiba "Vá para as bombas 1 e 2 (Camiões)".
//Senão: Exiba "Vá para as bombas 3 e 4 (Carros)"

import java.util.Scanner;

public class Ex04 {
    public static void main(String args [])
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite D para Diesel ou G para Gasolina");
        
        String Combustivel = teclado.next();
        
        if(Combustivel.equalsIgnoreCase("D")){
            System.out.println("Vá para as bombas 1 e 2 (Camiões)");
        } else if (Combustivel.equalsIgnoreCase("G")){
            System.out.println("Vá para as bombas 3 e 4 (Carros)");   
        }else {
            System.out.println("Opção inválida! Digite apenas D ou G.");
        }
    }
}