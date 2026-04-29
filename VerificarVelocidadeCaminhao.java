import java.util.Scanner;

public class Ex01
{
    public static void main(String args [])
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a velocidade do caminhão");
        int velocidade = teclado.nextInt();
        
        if(velocidade >= 80)
        {
            System.out.println("Cuidado! Velocidade acima do limite permitido!");
        }
        else{
            System.out.println("Você esta no limite correto de velocidade!");
        }
    }
   
}