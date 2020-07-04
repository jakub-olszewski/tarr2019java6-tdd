package pl.sdacademy.tarr2019java6.tdd.mockowanie;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 04.07.2020
 **/
public class MockitoAnnotationInjectTest {


    /**
     * Inicjalizacja mockowania w before każdego testu
     */
    @Before
    public void before(){
        MockitoAnnotations.initMocks(this);
    }


    /**
     * Zamokowane dane do słownika
     */
    @Mock
    Map<String,String> wordMap;

    @InjectMocks
    MyDictionary dic = new MyDictionary();

    public class MyDictionary{

        Map<String,String> wordMap;

        public MyDictionary(Map<String,String> wordMap){
            this.wordMap = wordMap;
        }

        public MyDictionary() {
            wordMap = new HashMap<>();
        }

        /**
         * Metoda pobierania tłumaczeń z mapy
         * @param word słowo szukane
         * @return tłumaczenie
         */
        public String getTranslation(String word){
            return wordMap.get(word);
        }

    }

    @Test
    public void whenUseInjectMockAnnotationTest(){

        // zaimplementować działanie danych wejściowy
        // które są zamockowane
        // kiedy pobieramy z danych słowo Help mapa zwróci słowo Pomocy
        when(wordMap.get("Help")).thenReturn("Pomocy");
        when(wordMap.get("Programmer")).thenReturn("Programista");

        // weryfikacja
        assertEquals("Pomocy",dic.getTranslation("Help"));
        assertEquals("Programista",dic.getTranslation("Programmer"));

    }
}
