package pl.sdacademy.tarr2019java6.tdd;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 27.06.2020
 **/
public class Cafe {

    boolean hasCafe;

    public Cafe(){
        hasCafe = false;
    }

    public void serveCoffe() {
        hasCafe = true;
    }

    public boolean canServeCoffee() {
        return hasCafe;
    }
}
