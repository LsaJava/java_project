/**
Na logística, alguns produtos precisam de mais cuidado.
Entrada: O usuário digita o código da carga (um número inteiro).
Regra 1: Código de 1 a 10 -> "Carga Não Perecível".
Regra 2: Código de 11 a 20 -> "Carga Perecível (Alimentos)".
Regra 3: Código de 21 a 30 -> "Carga Perigosa (Inflamáveis)".
Qualquer outro código: "Código Inválido".*/

import java.util.Scanner;
public class Ex10 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o código da carga?");
        int codCarga = teclado.nextInt();
        
        if(codCarga <1 || codCarga >30)
        {
            System.out.println("Código Inválido");
        }else if(codCarga <= 10){
            System.out.println("Não Perecível (Alimentos)");
        }else if(codCarga <= 20){
            System.out.println("Carga Perecível (Alimentos)");
        }else{
            System.out.println("Carga Perigosa (Inflamáveis)");
        }
    }
}