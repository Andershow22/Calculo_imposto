
package Calculo_imposto;


public abstract class Imposto {
    private double aliquota;
    private double baseCalculo;
        
    public abstract void descricao();
    
    public double calculoImposto(){
        double soma = getBaseCalculo() * getAliquota();
        return soma;
    }
    
    public void setAliquota(double aliquota){
        this.aliquota = (aliquota / 100);
    }
    
    public double getAliquota(){
        return aliquota;
    }

    public double getBaseCalculo() {
        return baseCalculo;
    }

    public void setBaseCalculo(double baseCalculo) {
        this.baseCalculo = baseCalculo;
    }
    
}
