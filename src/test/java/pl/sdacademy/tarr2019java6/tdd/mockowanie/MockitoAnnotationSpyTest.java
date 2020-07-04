package pl.sdacademy.tarr2019java6.tdd.mockowanie;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
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
public class MockitoAnnotationSpyTest {

    /**
     * Mockowana lista - tworzenie atrapy @Mock
     * jak widać nie ma inicjalizacji!
     *
     * Wymagana inicjalizacja Mockowania
     */
    @Spy
    List<String> spyList = new ArrayList<>();

    /**
     * Inicjalizacja mockowania w before każdego testu
     */
    @Before
    public void before(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenUseSpyAnnotationInjectTest(){
        spyList.add("one");
        spyList.add("two");

        assertEquals(2,spyList.size());

        when(spyList.size()).thenReturn(2020);
        assertEquals(2020,spyList.size());
    }

    @Test
    public void whenUseSpyAnnotationInjectInMethodTest(){
        // częściowa atrapa widoczna tylko w tym teście
        List<String> spyListOnlyHere = spy(new ArrayList<>());

        spyListOnlyHere.add("one");
        spyListOnlyHere.add("two");
        spyListOnlyHere.add("one");


        assertEquals(3,spyListOnlyHere.size());

        verify(spyListOnlyHere, times(3)).add(anyString());
        verify(spyListOnlyHere, times(2)).add("one");

    }

}
