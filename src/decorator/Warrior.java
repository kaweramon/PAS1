/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

/**
 *
 * @author Kawe
 */
public class Warrior {
        private int life = 50;
	private String name;
	private Weapon weapon;
        private Armor armor;
        
        public Warrior(String name, Weapon weapon, Armor armor){
            this.armor = armor;
            this.name = name;
            this.weapon = weapon;
        }
        public Warrior(){
            
        }
        
	public void setLife(int life){
		this.life = life;
	}

	public int getLife(){
		return this.life;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setWeapon(Weapon weapon){
		this.weapon = weapon;
	}

	public Weapon getWeapon(){
		return this.weapon;
	}
        
        public void setArmor(Armor armor){
            this.armor = armor;
        }
        public Armor getArmor(){
            return this.armor;
        }

	public void atacar(){
            this.weapon.atacar();
	}
        
        public void defender(Weapon ataque){
            this.armor.defense();
            tirarLife(ataque);
        }
        
        private void tirarLife(Weapon ataque){
            if(this.life <= 0){
                System.out.println("Life menor ou igual a 0: DEAD!!!");
                return;
            }
            if(this.armor instanceof LeatherArmor){
                this.life -= ataque.getDano() - 2;
            }
            if (this.armor instanceof  MetalArmor) {
                this.life -= ataque.getDano() -5;               
            }
            if(this.armor instanceof FullArmor){
                this.life -= ataque.getDano() -10;
            }
            
        }
        
}
