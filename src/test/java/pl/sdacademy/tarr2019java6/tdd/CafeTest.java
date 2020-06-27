package pl.sdacademy.tarr2019java6.tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 27.06.2020
 **/
public class CafeTest {

    @Test
    public void shouldServeCoffee(){

        // given
        Cafe cafe = new Cafe();

        // when
        cafe.serveCoffe(); // serwuje kawe

        // then
        assertTrue(cafe.canServeCoffee());
        // sprawdzam czy kawa zostala zaserwowana

    }

    @Test
    public void shouldNotServeCoffee(){

        // given
        Cafe cafe = new Cafe();

        // when
        //nie serwuje kawy

        // then
        assertFalse(cafe.canServeCoffee());
        // sprawdzam czy kawa nie zostala zaserwowana
    }
}
