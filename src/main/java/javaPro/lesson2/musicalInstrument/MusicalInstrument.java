package javaPro.lesson2.musicalInstrument;

public abstract class MusicalInstrument {
    protected String name;

    public MusicalInstrument(String name) {
        this.name = name;
    }

    public abstract void playNote(String note);

    public void displayInfo() {
        System.out.println("Instrument: " + name);
    }

}