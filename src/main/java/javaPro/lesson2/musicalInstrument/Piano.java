package javaPro.lesson2.musicalInstrument;

public class Piano extends MusicalInstrument {

    public Piano() {
        super("Piano");
    }

    @Override
    public void playNote(String note) {
        System.out.println("The piano plays the note: " + note);
    }

}