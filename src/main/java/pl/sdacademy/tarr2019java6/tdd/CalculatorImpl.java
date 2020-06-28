package pl.sdacademy.tarr2019java6.tdd;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 28.06.2020
 **/
public class CalculatorImpl implements Calculator {

    String display;

    public CalculatorImpl(){
        display = "";
    }

    @Override
    public void pressNumber(int number) {
        display += number;
    }

    @Override
    public String display() {
        return display;
    }

    @Override
    public void add(int numberA, int numberB) {
        display += numberA + numberB;
    }

    @Override
    public void clear() {
        display = "";
    }
}
