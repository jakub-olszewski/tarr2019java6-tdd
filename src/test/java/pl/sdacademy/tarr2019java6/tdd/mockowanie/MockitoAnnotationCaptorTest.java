package pl.sdacademy.tarr2019java6.tdd.mockowanie;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 04.07.2020
 **/
public class MockitoAnnotationCaptorTest {

    /**
     * Mockowana lista - tworzenie atrapy @Mock
     * jak widać nie ma inicjalizacji!
     *
     * Wymagana inicjalizacja Mockowania
     */
    @Mock
    List<String> mockedList;

    @Captor
    ArgumentCaptor<String> argumentCaptor;

    /**
     * Inicjalizacja mockowania w before każdego testu
     */
    @Before
    public void before(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenUseCaptorAnnotationInjectTest(){

        mockedList.add("one");

        // weryfikacja przechwyconego argumentu metody powyżej
        verify(mockedList).add(argumentCaptor.capture());

        assertEquals("one",argumentCaptor.getValue());
    }

    /**
     * Przechwytywacz widoczny tylko w tym tescie
     */
    @Test
    public void whenUseCaptorAnnotationInjectMethodTest(){

        mockedList.add("one");

        // weryfikacja przechwyconego argumentu metody powyżej
        verify(mockedList).add(argumentCaptor.capture());

        ArgumentCaptor<String> argumentCaptorHere = ArgumentCaptor.forClass(String.class);

        assertEquals("one",argumentCaptorHere.getValue());
    }
}
