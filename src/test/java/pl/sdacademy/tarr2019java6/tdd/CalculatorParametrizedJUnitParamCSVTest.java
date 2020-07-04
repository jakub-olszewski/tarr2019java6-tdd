package pl.sdacademy.tarr2019java6.tdd;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
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

    private Calculator calc;

    @Before
    public void before(){

        // given
        calc = new CalculatorImpl();

    }

    @Test
    @FileParameters("src/test/resources/CalculatorParameterCSVFileAddTest.csv")
    public void testAdd(int numberA, int numberB, String expected){

        /**
         *         String path = "C:/Users/trener";// \n - enter   \t - tabulator
         */

        // when
        calc.add(numberA,numberB);

        // then
        String message = String.format("Error %d + %d != %s",numberA,numberB,calc.display());

        assertEquals(message,expected,calc.display());

    }

    @Test
    @FileParameters("src/test/resources/CalculatorParameterCSVFileSubTest.csv")
    public void testSub(int numberA, int numberB, String expected){

        // when
        calc.sub(numberA,numberB);

        // then
        String message = String.format("Error %d - %d != %s",numberA,numberB,calc.display());

        assertEquals(message,expected,calc.display());

    }

    @Test
    @FileParameters("src/test/resources/CalculatorParameterCSVFileMultiTest.csv")
    public void testMulti(int numberA, int numberB, String expected){

        // when
        calc.multi(numberA,numberB);

        // then
        String message = String.format("Error %d * %d != %s",numberA,numberB,calc.display());

        assertEquals(message,expected,calc.display());

    }
}
