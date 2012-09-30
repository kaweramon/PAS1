/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Kawe
 */
public class Main {
    
    public static void main(String[]args){
        //Armadura
        Armor couro = new LeatherArmor();
        Armor metal = new MetalArmor();
        Armor full = new FullArmor();
        //Armas
        Weapon facaComFogo = new SimpleWeapon();
        facaComFogo = new FirePower(new KnifeWeapon(facaComFogo));
        Weapon espadaComVeneno = new SimpleWeapon();
        espadaComVeneno = new PoisonPower(new SwordWeapon(espadaComVeneno));
        Weapon lancaComRaio = new SimpleWeapon();
        lancaComRaio = new ThunderPower(new SpearWeapon(lancaComRaio));
        //Guerreiros
        Warrior warrior1 = new Warrior("Guerreiro 1", facaComFogo, metal);
        Warrior warrior2 = new Warrior("Guerreiro 2", espadaComVeneno, couro);
        Warrior warrior3 = new Warrior("Guerreiro 3", lancaComRaio, full);
        //Free For All
        //Guerreiro 1 ataca o 2
        warrior1.atacar();
        warrior2.defender(warrior1.getWeapon());
        System.out.println("LIFE "+warrior2.getName()+" : "+warrior2.getLife());
        //Guerreiro 3 ataca o 1
        warrior3.atacar();
        warrior1.defender(warrior3.getWeapon());
        System.out.println("LIFE "+warrior1.getName()+" : "+warrior1.getLife());
        //Guerreiro 2 ataca o 3
        warrior2.atacar();
        warrior3.defender(warrior2.getWeapon());
        System.out.println("LIFE "+warrior3.getName()+" : "+warrior3.getLife());
        //Guerreiro 3 ataca o 1
        warrior3.atacar();
        warrior1.defender(warrior3.getWeapon());
        System.out.println("LIFE "+warrior1.getName()+" : "+warrior1.getLife());
        //Guerreiro 2 ataca o 1
        warrior2.atacar();
        warrior1.defender(warrior2.getWeapon());
        System.out.println("LIFE "+warrior1.getName()+" : "+warrior1.getLife());
        
        
        
        
        
        
    }
}
