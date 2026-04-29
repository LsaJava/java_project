import java.util.Scanner;

public class Ex03
{
    public static void main(String args [])
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o peso da carga em toneladas?");
        int peso = teclado.nextInt();
        
        
        if(peso <= 15)
            System.out.println("Peso dentro do limite. Boa viagem!");
        else 
            System.out.println("Carga excessiva! Necessário retirar o excesso antes de seguir");
    }
}
