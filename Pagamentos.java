
package Calculo_imposto;

import java.util.ArrayList;
import java.util.List;


public class Pagamentos {
    public List<Imposto> pagamentos;
    
    public Pagamentos(){
        this.pagamentos = new ArrayList<>();
    }
    
    public void addImposto(Imposto imposto) {
        pagamentos.add(imposto);
    }
    
    public void mostrar() {
        for (Imposto pagamentos : pagamentos) {
            System.out.printf("\nDescrição: ");
            pagamentos.descricao();
        }
    }
    
}
