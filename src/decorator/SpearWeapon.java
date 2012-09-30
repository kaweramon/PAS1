/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Kawe
 */
public class SpearWeapon extends DecoratedWeapon{

    public SpearWeapon(Weapon reference){
        super(reference);
    }
    
    public void atacar() {
        super.atacar();
        System.out.println("Atacando com uma lança");
    }
    public int getDano(){
        return 20;
    }
    
}
