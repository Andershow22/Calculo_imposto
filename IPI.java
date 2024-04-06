
package Calculo_imposto;


public class IPI extends Imposto {
    private double valor;
    private double frete;
    private double seguro;
    private double outrosV;
    
    public IPI(double aliquota, double valor, double frete, double seguro, double outrosV ){
        setAliquota(aliquota);
        this.valor = valor;
        this.frete = frete;
        this.seguro = seguro;
        this.outrosV = outrosV;
        setBaseCalculo(valor + frete + seguro + outrosV);
    }
    
    @Override
    public void descricao(){
        System.out.println("Imposto: IPI");
        System.out.println("Alíquota: " + getAliquota());
        System.out.println("Valor do produto: " + valor);
        System.out.println("Frete: " + frete);
        System.out.println("Seguro: " + seguro);
        System.out.println("Outros valores: " + outrosV);
        System.out.println("Calculo do imposto: " + calculoImposto());

        
    }
    
}
