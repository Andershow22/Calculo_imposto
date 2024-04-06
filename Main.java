
package Calculo_imposto;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Registre impostos");
        
        Pagamentos pagamentos = new Pagamentos();
        String pare = "";
        while(pare.equals("PARE") == false){
            System.out.println("---------------------------------------------------------");
            System.out.print("Qual é o imposto?[IPI] ou [PIS]:");
            String var = teclado.next();
            if(var.equals("PIS") == true){
                System.out.print("Débito:");
                double debito = teclado.nextDouble();
                System.out.print("Credito:");
                double credito = teclado.nextDouble();
                System.out.print("A alíquota é de:");
                double aliquota = teclado.nextDouble();
                
                pagamentos.addImposto(new PIS(aliquota, debito, credito));
            }else if(var.equals("IPI") == true){
                System.out.print("Valor do produto:");
                double valor = teclado.nextDouble();
                System.out.print("Frete:");
                double frete = teclado.nextDouble();
                System.out.print("Seguro:");
                double seguro = teclado.nextDouble();
                System.out.print("Outros valores:");
                double outrosV = teclado.nextDouble();
                System.out.print("A alíquota é de:");
                double aliquota = teclado.nextDouble();
                pagamentos.addImposto(new IPI(aliquota, valor, frete, seguro, outrosV));
            }else{
                System.err.println("Tipo de imposto inválido!");
            }
            System.out.printf("\nDigite 'PARE' caso esteja satisfeito");
            System.out.printf("\n[]:");
            pare = teclado.next();
        }
        
        System.out.println("-------------------------------------------------");
        System.out.println("               Exibindo os impostos");
        System.out.println("--------------------------------------------------");
        pagamentos.mostrar();
    }
    
}
