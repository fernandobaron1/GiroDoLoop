
package girodoloop;

import java.util.Scanner;


public class GiroDoLoop {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
         
        int maiorValor =0; 
        int entrada = 0;
        int menorValor = 0;
        int ultimoPar = 0;
        int i = 0;
        String aux = "";
        
        while (true) {
            System.out.println ("Informe o valor do produto");
            
            aux = leia.next();
            
            if (aux.equals("sair")){
                System.out.println("Operação finalizada.");
                break; 
            }  
            
            entrada = Integer.parseInt(aux);
            
            if (entrada > maiorValor | i == 0){
            maiorValor = entrada;
            }
            
            if (entrada < menorValor | i == 0) {
                menorValor = entrada;
            }
                
            if (entrada % 2 == 0){
                ultimoPar = entrada;
            
            } 
            i++;
        System.out.println ("O maior valor é: "+maiorValor);
        System.out.println ("O menor valor é: "+menorValor);
        System.out.println("O último número par é: "+ultimoPar);
        }
    }
    
}
