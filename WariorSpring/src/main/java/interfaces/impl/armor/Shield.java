package interfaces.impl.armor;

import interfaces.Armor;
import org.springframework.stereotype.Component;

@Component
public class Shield implements Armor{
    public String getName() {
        return "ЩИТ";
    }
}
