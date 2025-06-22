package javaPro.lesson2.musicalInstrument;

public class MusicalInstrumentDemo {

    public static void main(String[] args) {
        MusicalInstrument guitar = new Guitar();
        MusicalInstrument piano = new Piano();
        MusicalInstrument violin = new Violin();

        guitar.displayInfo();
        guitar.playNote("E");

        piano.displayInfo();
        piano.playNote("C");

        violin.displayInfo();
        violin.playNote("A");
    }

}