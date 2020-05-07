package zajecia9.zadanie3;

public class Synthesizer extends Instrument {
    @Override
    public void play(int freq) {
        System.out.println(freq);
    }

    public void playSong() {
        AutoComposer ac = new AutoComposer();
        Tone[] tones = ac.compose();
        for (int i = 0; i < 5; i++) {
            play(tones[i].getFrequency());
        }
    }
}
