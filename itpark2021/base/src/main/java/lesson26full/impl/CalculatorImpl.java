package lesson26full.impl;

import lesson26full.ArgumentA;
import lesson26full.ArgumentB;
import lesson26full.Calculator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CalculatorImpl implements Calculator {
    private final ArgumentA argumentA;

    /*@Autowired*/
    private final ArgumentB argumentB;

    /*@Autowired
    public CalculatorImpl (ArgumentA argumentA, ArgumentB argumentB) {
        this.argumentA = argumentA;
        this.argumentB = argumentB;
    }

    public CalculatorImpl (ArgumentA argA) {
        this.argumentA = argA;
        this.argumentB = new ArgumentB();
    }

    @Autowired
    public void setArgumentB (ArgumentB argumentB) {
        this.argumentB = argumentB;
    }*/

    @Override
    public int summa() {
        return argumentA.getValue() + argumentB.getValue();
    }

    @Override
    public int divide () {
        return argumentA.getValue() / argumentB.getValue();
    }
}
