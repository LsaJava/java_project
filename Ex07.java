import java.util.Scanner;
public class Ex07
{
    public static void main(String args [])
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Boa noite, digite a velociade do veículo");
        double veloVeiculo = teclado.nextDouble();
        
        if(veloVeiculo <= 80){
            System.out.println("Velocidade Segura");    
        }else if(veloVeiculo <= 100){
            System.out.println("Multa de R$ 130,00");    
        }else if(veloVeiculo >= 100)
        {
            System.out.println("Multa Gravíssima: R$ 880,00 TE FUDEU");
        }
    }
}