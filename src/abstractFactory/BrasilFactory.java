/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

/**
 *
 * @author Kawe
 */
public class BrasilFactory extends AbstractFactory{

    
    AbstractTelefone exibirTelefone(String telefone) {
        return new TelefoneBrasil();
    }


    AbstractCEP checarCEP(String cep) {
        return new CEPBrasil();
    }

   
   
    
}
