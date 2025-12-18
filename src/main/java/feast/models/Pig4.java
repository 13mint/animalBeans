package feast.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pig4 {

    private Lamb5 lamb5;
    public Pig4(@Qualifier("lamb5")Lamb5 lamb5) {this.lamb5 = lamb5;}
    @Override
    public String toString() {
        return "which is stuffed inside a lamb, "+ lamb5.toString();
    }
}
