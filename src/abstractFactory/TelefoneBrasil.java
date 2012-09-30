/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

import sun.nio.cs.ext.ISCII91;

/**
 *
 * @author Kawe
 */
public class TelefoneBrasil extends AbstractTelefone{
    
   

   
    public String exibirTelefone(String telefone) {
        for (int i = 0; i <  telefone.length(); i++) {
            if (telefone.isEmpty()) {
                return "Telefone vazio";
        
            }
            if (telefone.startsWith("(55)") && telefone.contains("")) {
                return telefone;
            }
            if (telefone.contains("A-Z")) {
                return "Contem letra";
            }
        }
        
        
        return "";
        
    }
}
