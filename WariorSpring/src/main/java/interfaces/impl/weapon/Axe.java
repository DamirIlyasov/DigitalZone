package interfaces.impl.weapon;

import interfaces.Weapon;
import org.springframework.stereotype.Component;

@Component
public class Axe implements Weapon{
    public String getName() {
        return "ТОПОРРРР";
    }
}
