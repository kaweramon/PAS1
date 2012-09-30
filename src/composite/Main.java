/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Kawe
 */
public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Calculadora num1 = new Numero(10);
        Calculadora num2 = new Numero(5);
        Calculadora sub = new Subtracao();
        sub.adicionarNum(num1);
        sub.adicionarNum(num2);
        
        
        Calculadora num3 = new Numero(3);
        Calculadora num4 = new Numero(9);
        Calculadora div = new Divisao();
        div.adicionarNum(num4);
        div.adicionarNum(num3);
        
        
        
        sub.adicionarNum(div);
        //(10 - 5) - (9/3)
        
        Calculadora soma = new Soma();
        soma.adicionarNum(new Numero(5));
        soma.adicionarNum(sub);
        
        System.out.println(soma.verificacaoExpressao());
        
        
        
        
        
    }
}
