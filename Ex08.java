import java.util.Scanner;

public class Ex08
{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o peso do caminhão?");
        int peso = teclado.nextInt();
        
        if(peso <= 5){
            System.out.println("Pátio A");
        }else if (peso >=5 && peso <=15){
            System.out.println("Pátio B");
        }else       
            System.out.println("Pátio C");
    }
}