import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o salário atual?");  
        double salario = teclado.nextDouble();
        
        double aumento15 = 0.15;
        double aumento10 = 0.10;
        double aumento5 = 0.05; 
        double novoSalario;
        
        if(salario <= 2000.00){
            aumento15 = salario * 0.15;
            novoSalario = salario + aumento15;
            System.out.printf("Aumento de 15%. Valor do salario pós aumento: R$ %.2f%n" + novoSalario);    
        }else if(salario >= 2000.01 && salario <= 4000.00){
            aumento10 = salario * 0.10;
            novoSalario = salario + aumento10;
            System.out.printf("Aumento de 10%. Valor do salario pós aumento: R$ %.2f%n" + novoSalario);    
        }else{
            aumento5 = salario * 0.05;
            novoSalario = salario + aumento5;
            System.out.printf("Aumento de 5%. Valor do salario pós aumento: R$ %.2f%n" + novoSalario);    
        }       
    }
}