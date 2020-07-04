package pl.sdacademy.tarr2019java6.tdd;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 04.07.2020
 **/
@RunWith(JUnitParamsRunner.class)
public class CalculatorParametizedJUnitParamsMethodTest {


    private Object[] parametersToTestAdd(){
        return new Object[]{
                new Object[]{1,2,3},
                new Object[]{2,3,5},
                new Object[]{4,2,6}
        };
    }

    @Test
    @Parameters(method = "parametersToTestAdd")
    public void testAdd(int numberA, int numberB, String expected){

        // given
        Calculator calc = new CalculatorImpl();

        // when
        calc.add(numberA,numberB);

        // then
        String message = String.format("Error %d + %d != %s because is equal %s",
                numberA,numberB,calc.display(),expected);
        assertEquals(message,expected,calc.display());
    }

}
