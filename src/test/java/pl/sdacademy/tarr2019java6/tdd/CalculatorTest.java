package pl.sdacademy.tarr2019java6.tdd;

import org.junit.Before;
import org.junit.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    Calculator calc;

    @Before
    public void before(){
        // given
        calc = new CalculatorImpl();
    }

    /**
     * Test wciśnięcia przycisku "0" i sprawdzenie
     * czy na wyświetlacz jest wyświetlone "0"
     */
    @Test
    public void pressNumber0Test(){


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
    public void emptyDisplayTest(){

        // when
        // nic nie robimy z kalkulatorem, bo display ma być pusty!

        // then

        // opcja 1
        String result = calc.display();
        String expected = "";
        assertEquals("Display must be empty!",expected,result);

        // opcja 2 - zalecana
        assertTrue("Display must be empty!",calc.display().isEmpty());

    }
}
