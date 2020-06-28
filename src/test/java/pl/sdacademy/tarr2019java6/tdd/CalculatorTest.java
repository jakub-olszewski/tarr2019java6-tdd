package pl.sdacademy.tarr2019java6.tdd;

import org.junit.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertEquals;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 28.06.2020
 *
 * Stwórz testy metod:
 * pressNumber(), display(),
 * add(), sub(), div(), multi() [+, -, / , * ]
 **/
public class CalculatorTest {


    /**
     * Test wciśnięcia przycisku "0" i sprawdzenie
     * czy na wyświetlacz jest wyświetlone "0"
     */
    @Test
    public void pressNumber0Test(){

        // given
        Calculator calc = null; // = new CalculatorImpl();

        // when
        calc.pressNumber(0);

        // then
        String expected = "0";
        String result = calc.display();

        // sprawdzanie
        assertEquals("Must be only zero on display!",expected,result);
    }

    /**
     * Test pustego wyświetlacza
     */
    @Test
    public void displayTest(){

        /**
         * Zadanie: zaimplementować test pustego wyświetlacza
         * Pamiętaj o sekcjach
         */
    }
}
