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
public class Soma implements Calculadora{

    private ArrayList<Calculadora> numerosSoma = new ArrayList<Calculadora>();
    
    public void adicionarNum(Calculadora numero) throws Exception {
        numerosSoma.add(numero);
    }

    public int verificacaoExpressao() {
        int resultado = numerosSoma.get(0).verificacaoExpressao();
        for (int i = 1; i < this.numerosSoma.size(); i++) {
            resultado += numerosSoma.get(i).verificacaoExpressao();
        }
        return resultado;
    }
    
    
    
    
}
