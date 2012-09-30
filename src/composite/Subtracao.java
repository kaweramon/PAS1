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
public class Subtracao implements Calculadora{

    private ArrayList<Calculadora> numeros = new ArrayList<Calculadora>();
    
    @Override
    public void adicionarNum(Calculadora numero) throws Exception {
        numeros.add(numero);
    }
    
    public int verificacaoExpressao() {
        int resultado = numeros.get(0).verificacaoExpressao();
        for (int i = 1; i < this.numeros.size(); i++) {
            resultado -= numeros.get(i).verificacaoExpressao();
        }
        return resultado;
    }
    
    
}
