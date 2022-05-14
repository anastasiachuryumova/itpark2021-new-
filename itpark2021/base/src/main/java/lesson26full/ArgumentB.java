package lesson26full;

import org.springframework.stereotype.Component;

@Component
public class ArgumentB implements HasValue{

    public int getValue () {
        return 25;
    }
}
