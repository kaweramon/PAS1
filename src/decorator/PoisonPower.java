/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Kawe
 */
public class PoisonPower extends DecoratedWeapon{
    
    public PoisonPower(Weapon reference){
        super(reference);
    }
    
    public int getDano(){
        return super.getDano() + 3;
    }
}
