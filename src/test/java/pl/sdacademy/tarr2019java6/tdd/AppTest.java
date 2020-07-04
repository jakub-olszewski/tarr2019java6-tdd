package pl.sdacademy.tarr2019java6.tdd;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {

        try
        {
            test(1);
        }catch (Exception e){
            // częsty błąd pusty cache!
        }

        assertTrue(true);
    }

    public void test(int a){
        if(a==0){
            throw new IllegalArgumentException();
        }
    }
}
