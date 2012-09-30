/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Kawe
 */
public interface Calculadora {
    
   public void adicionarNum(Calculadora numero) throws Exception;
   
   public int verificacaoExpressao();
   
}
