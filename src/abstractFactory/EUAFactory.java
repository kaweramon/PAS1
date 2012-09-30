/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

/**
 *
 * @author Kawe
 */
public class EUAFactory extends AbstractFactory{

    @Override
    AbstractTelefone exibirTelefone(String telefone) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    AbstractCEP checarCEP(String cep) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
