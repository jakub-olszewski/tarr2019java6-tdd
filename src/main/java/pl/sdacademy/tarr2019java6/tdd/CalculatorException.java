package pl.sdacademy.tarr2019java6.tdd;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 04.07.2020
 *
 * Własny wyjątek dla kalkulatora
 **/
public class CalculatorException extends Exception {

    public CalculatorException(){
        super("Ogólny błąd kalkulatora");
    }

    public CalculatorException(String message) {
        super(message);
    }

    public static CalculatorException divide(){
        return new CalculatorException(CalculatorImpl.DIV_ERROR_MESSAGE);
    }
}
