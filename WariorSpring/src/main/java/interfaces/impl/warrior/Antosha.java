package interfaces.impl.warrior;

import interfaces.Armor;
import interfaces.Warrior;
import interfaces.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Antosha implements Warrior{

    private Armor armor;
    private Weapon weapon;
    public Antosha(){

    }
    @Autowired
    public Antosha(Armor armor, Weapon weapon){
        this.armor = armor;
        this.weapon = weapon;
    }
    public void attack() {
        System.out.println("Антоша воин.");
        System.out.println("Антоша бьёт " + weapon.getName()+".");
        System.out.println("Антоша защищается "+ armor.getName()+".");
    }
}
