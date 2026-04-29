import java.util.Scanner;

public class Ex05
{
    public static void main(String args [])
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantos eixos o veículo tem");
        int eixos = teclado.nextInt();
        
        if(eixos <= 2)
        {
            System.out.println("Custo do pedágio é de R$ 15,00");
        }else if (eixos <=5){
            System.out.println("Custo do pedágio é de R$ 35,00");
        }else {
            System.out.println("Seu veiculo tem " + eixos + " eixos. Custo do pedágio é de R$ 60,00");
        }
    }
}
