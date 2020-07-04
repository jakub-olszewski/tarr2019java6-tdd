package pl.sdacademy.tarr2019java6.tdd.mockowanie;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.sdacademy.tarr2019java6.tdd.Calculator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 04.07.2020
 **/
public class MockitoAnnotationMockTest {

    /**
     * Mockowana lista - tworzenie atrapy @Mock
     * jak widać nie ma inicjalizacji!
     *
     * Wymagana inicjalizacja Mockowania
     */
    @Mock
    List<String> mockedList;

    /**
     * Inicjalizacja mockowania w before każdego testu
     */
    @Before
    public void before(){
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Test nie zamockowanej listy
     */
    @Test
    public void whenNotUseMockAnnotationMockInject(){

        // given
        List<String> notMockedList = new ArrayList<>();

        // when
        notMockedList.add("one");
        //notMockedList.add("two");
        //notMockedList.add("three");
        // ... i tak jeszcze 2017 razy a poniżej jest mock :)


        // then
        assertEquals(notMockedList.size(),1);
        assertTrue(notMockedList.get(0).equals("one"));
    }

    @Test
    public void whenUseMockAnnotationMockInject(){

        // given mock - atrapa
        List<String> mockedList = mock(ArrayList.class);

        // when
        when(mockedList.size()).thenReturn(2020);

        // then
        assertEquals(mockedList.size(),2020);
        //assertTrue(notMockedList.get(0).equals("one"));
    }

    @Test
    public void whenUseMockAnnotationMockInject2(){

        // when
        mockedList.add("one");

        when(mockedList.size()).thenReturn(1);
        verify(mockedList).add("one");// weryfikacja użycia metody one

        // then
        assertEquals(mockedList.size(),1);
        //assertTrue(notMockedList.get(0).equals("one"));
    }

    @Test
    public void calculatorMockitoTest(){

        // given
        Calculator calc = mock(Calculator.class);

        // when
        calc.add(1,2);
        when(calc.display()).thenReturn("3");// zachowanie kalulatora

        // then
        // weryfikacja czy kalkulator wykonał raz metodę add
        verify(calc, times(1)).add(anyInt(),anyInt());
        // weryfikacja czy nigdy nie uzyta zostala metoda div
        verify(calc,never()).div(anyInt(),anyInt());

        assertEquals(calc.display(),"3");
    }
}
