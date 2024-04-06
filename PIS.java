
package Calculo_imposto;


public class PIS extends Imposto {
    private double debito;
    private double credito;
    
    public PIS(double aliquota, double debito, double credito){
        setAliquota(aliquota);
        this.debito = debito;
        this.credito = credito;
        setBaseCalculo(debito - credito);
    }
    
    @Override
    public void descricao(){
        System.out.println("Imposto: PIS");
        System.out.println("Alíquota: " + getAliquota());
        System.out.println("Débito: " + debito);
        System.out.println("Crédito: " + debito);
        System.out.println("Calculo do imposto: " + calculoImposto());
    }
}
