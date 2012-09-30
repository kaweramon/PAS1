/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;

/**
 *
 * @author Kawe
 */
public class Divisao implements Calculadora{
    
    ArrayList<Calculadora> numDivisao = new ArrayList<Calculadora>();
    
    public void adicionarNum(Calculadora numero) throws Exception {
        numDivisao.add(numero);
    }

    @Override
    public int verificacaoExpressao() {
       int resultado = numDivisao.get(0).verificacaoExpressao();
        for (int i = 1; i < numDivisao.size(); i++) {
            resultado /= numDivisao.get(i).verificacaoExpressao();
        }
       
       return resultado;
    }
    
}
