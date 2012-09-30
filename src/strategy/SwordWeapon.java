/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Kawe
 */
public class SwordWeapon implements Weapon{

    public void atacar() {
        System.out.println("Ataque com espada");
    }
    
    public int getDano(){
        return 10;
    }
    
}
