/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Kawe
 */
public class KnifeWeapon extends DecoratedWeapon{
    
    public KnifeWeapon(Weapon reference){
        super(reference);
    }
    
    public void atacar(){
        super.atacar();
        System.out.println("Ataque com faca");
    }
    
    public int getDano(){
        return 5;
    }
}
