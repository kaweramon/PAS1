/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Kawe
 */
public class Numero implements Calculadora{

    private int numero; 
    
    public Numero(int n){
        this.numero = n;
    }
    
    @Override
    public void adicionarNum(Calculadora numero) throws Exception{
        throw new Exception();
    }

    
    public int verificacaoExpressao() {
        return this.numero;
    }
    
}
