package feast.models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Lamb5{
    private Goat6 goat6;

    @Override
    public String toString() {
        return "which is stuffed inside a goat, " + goat6.toString();
    }
}
