/*
 * Esse aqui simula aqueles avisos que vemos antes de túneis ou viadutos 
 * baixos (muito comum em Porto Alegre, como no viaduto da Conceição ou ali perto da Rodoviária).

O Cenário: O caminhão está chegando em um viaduto. O sistema de GPS precisa 
avisar se ele passa ou não.

Entrada 1: Altura do caminhão (ex: 4.20).
Entrada 2: Altura máxima do viaduto (ex: 4.50).
As Regras:
Se a altura do caminhão for maior ou igual à do viaduto:
"ROTA BLOQUEADA: Risco de colisão!"
Se o caminhão for mais baixo que o viaduto, mas a diferença (folga) 
for menor que 0.30 (30 centímetros):"Passagem permitida com cuidado: Gabarito baixo."
Se a folga for 0.30 ou mais:
"Passagem livre e segura."*/
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
