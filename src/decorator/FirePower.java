/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Kawe
 */
public class FirePower extends DecoratedWeapon{
    
    public FirePower(Weapon reference){
        super(reference);
    }
    
    public int getDano(){
        return super.getDano() + 5;
    }
}
