import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual peso Bruto Total (PBT) do veículo em quilos");
        int pesoBruto = teclado.nextInt();

        System.out.println("Categoria da CNH do motorista (Letra: A, B, C, D ou E)");
        String cnh = teclado.next();

        if(pesoBruto > 3500 && cnh.equalsIgnoreCase("B")){
            System.out.println("INFRAÇÃO: Motorista não habilitado para este peso!");
        }else if(pesoBruto == 3500 || cnh.equalsIgnoreCase("C")||cnh.equalsIgnoreCase("D")||cnh.equalsIgnoreCase("E")){
            System.out.println("Habilitação Compatível. Boa viagem!");
        }else{
            System.out.println("Categoria ou peso não reconhecido pelo sistema.");
        }
    }
}