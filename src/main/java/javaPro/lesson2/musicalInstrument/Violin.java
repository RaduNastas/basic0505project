package javaPro.lesson2.musicalInstrument;

public class Violin extends MusicalInstrument {

    public Violin() {
        super("Violin");
    }

    @Override
    public void playNote(String note) {
        System.out.println("The violin plays the note: " + note);
    }

}