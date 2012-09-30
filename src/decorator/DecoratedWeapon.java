/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Kawe
 */
public class DecoratedWeapon implements Weapon{

    private Weapon reference = null;
    
    public DecoratedWeapon(Weapon reference){
        this.reference = reference;
    }
    
    public void atacar() {
        reference.atacar();
    }

    public int getDano() {
      return   reference.getDano();
    }
    
}
