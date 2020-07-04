package pl.sdacademy.tarr2019java6.tdd;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 04.07.2020
 **/
@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedJUnitParamCSVTest {

    @Test
    @FileParameters("src/test/resources/CalculatorParameterCSVFileAddTest.csv")
    public void testAdd(int numberA, int numberB, String expected){

        /**
         *         String path = "C:/Users/trener";// \n - enter   \t - tabulator
         */

        // given
        Calculator calc = new CalculatorImpl();

        // when
        calc.add(numberA,numberB);

        // then
        String message = String.format("Error %d + %d != %s",numberA,numberB,calc.display());

        assertEquals(message,expected,calc.display());

    }

    // TODO Zadanie: Test z plikiem CSV na odejmowanie i mnożenie po 5 przykładów

}
