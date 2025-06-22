package javaPro.lesson2.musicalInstrument;

public class Guitar extends MusicalInstrument {

    public Guitar() {
        super("Guitar");
    }

    @Override
    public void playNote(String note) {
        System.out.println("The guitar plays the note: " + note);
    }

}