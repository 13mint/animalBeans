package feast.models;

import org.springframework.stereotype.Component;
import jakarta.annotation.Resource;


@Component
public class Goat6 {
    @Resource(name = "horse7")
    private Horse7 horse7;

    @Override
    public String toString() {
        return "which is stuffed inside a horse, " + horse7.toString();
    }
}
