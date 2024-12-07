package ed_dezembro;

import java.util.ArrayList;
import java.util.List;

public class AtividadeComplexicade {
    public static void main (String [] args) {
        
        List<Integer> numeros = new ArrayList<>();
        
        for (int i = 1; i<= 1_000_000; i++){
            numeros.add(i);            
        }
        
        long soma = 0;
        for (int numero: numeros){
            soma += numero;
        }
        
        System.out.println("Soma dos elementos: " + soma);
        
    }
    
}
