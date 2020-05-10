package zajecia9.zadanie3;

import java.util.Random;

public class AutoComposer implements Composeable {
    @Override
    public Tone[] compose() {
        Tone[] tones = new Tone[5];
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int toneFreq = r.nextInt(2000) + 1000;
            tones[i] = new Tone(toneFreq);
        }
        return tones;
    }
}
