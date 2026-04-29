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