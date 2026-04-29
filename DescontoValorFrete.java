import java.util.Scanner;

public class Ex06
{
    public static void main(String args [])
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o valor frete");
        double valorFrete = teclado.nextDouble();

        if(valorFrete >= 1000)
        {
            double valorComDesconto = valorFrete * 0.90;
            System.out.println("Total com 10% de desconto: R$" + valorComDesconto);
        }
        else if(valorFrete >= 500 && valorFrete <= 1000){
            double valorComDesconto = valorFrete * 0.95;
            System.out.println("Total com 5% de desconto: R$" + valorComDesconto);
        }else {
            System.out.println("Total sem desconto: R$" + valorFrete);
        }   
    }
}