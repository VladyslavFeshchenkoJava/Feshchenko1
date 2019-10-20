package lesson11;

public class InstrumentDemo {
    public static void main(String[] args) {
        Instrument[] instruments = {new Drum("big"), new Trumpet(25), new Trumpet(50), new Guitar(6)};

        for (Instrument i : instruments) {
            i.play();
        }
    }
}
