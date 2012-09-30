/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Kawe
 */
public class SpearWeapon implements Weapon{

    
    public void atacar() {
        System.out.println("Atacando com uma lança");
    }
    public int getDano(){
        return 20;
    }
    
}
