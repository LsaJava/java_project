 import java.util.Scanner;

public class Ex02
{
    public static void main(String args [])
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a idade");
        int idade = teclado.nextInt();
        
        if(idade >= 18)
        {
            System.out.println("Pode iniciar o processo para a carta de condução");
        } else
            System.out.println("Ainda não tem idade legal para conduzir");
    }
}