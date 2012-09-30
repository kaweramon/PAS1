/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Kawe
 */
public class Main {
    
    public static void main(String[]args){
        Weapon espada = (Weapon) new SwordWeapon();
        Armor couro = (Armor) new LeatherArmor();
        Weapon lanca = (Weapon) new SpearWeapon();
        Armor completo = (Armor) new FullArmor();
        
        Warrior warrior1 = new Warrior("Aragorn", espada,couro);
        Warrior warrior2 = new Warrior("Frodo", lanca, completo);
        
        warrior1.atacar();
        warrior2.defender(warrior1.getWeapon());        
        System.out.println("life: "+warrior2.getName()+" - "+warrior2.getLife());
        
        warrior2.atacar();
        warrior1.defender(warrior2.getWeapon());
        System.out.println("Life: "+warrior1.getName()+" - "+warrior1.getLife());
        
        warrior2.atacar();
        warrior1.defender(warrior2.getWeapon());
        System.out.println("Life: "+warrior1.getName()+" - "+warrior1.getLife());
        
        warrior2.atacar();
        warrior1.defender(warrior2.getWeapon());
        System.out.println("Life: "+warrior1.getName()+" - "+warrior1.getLife());
        
    }
}
