/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

/**
 *
 * @author Kawe
 */
public abstract class AbstractFactory {
    abstract AbstractTelefone exibirTelefone(String telefone);
    abstract AbstractCEP checarCEP(String cep);
    //abstract AbstractEndereco exibirEndereco();
}
