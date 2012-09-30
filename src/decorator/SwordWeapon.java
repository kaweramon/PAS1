/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Kawe
 */
public class SwordWeapon extends DecoratedWeapon{

    public SwordWeapon(Weapon reference){
        super(reference);
    }
    
    public void atacar() {
        super.atacar();
        System.out.println("Ataque com espada");
    }
    
    public int getDano(){
        return 10;
    }
    
}
