package nesekmigs;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

public class Dzokers extends Supervaronis {

	private int KRIT;
private int IZVAIRISANA;
	public Dzokers(int DZIVSK, int HP, int SPEKS, int VECUMS, int AIZS, String VARDS, String IZCELSME, String MOTIVS, int KRIT, int IZVAIRISANA) {
		super(DZIVSK, HP, SPEKS, VECUMS, AIZS, VARDS, IZCELSME, MOTIVS);
		this.KRIT = KRIT;
		this.IZVAIRISANA = IZVAIRISANA;
	}

	public void dzonkleraorganismaizvaddati() {
		
	}

    public void smieties() {
        String[] smiekls = {
            "UAHA-HA-HA-HA-HA-HA-HAA! 😄",
            "HA-HA-HA-HA! 😂",
            "uahaHHh-ahAH-ahHA-haHA-Hah-A-HAh-a-hHA-AAA! 😆",
            "UAHA-HA-HA-HAAAA 😜",
        };

        String[] SmiekluFaili = {
            "smiekls.mp3",
            "smiekls_1.mp3",
            "smiekls_2.mp3",
            "smiekls_3.mp3",
        };

        Random rand = new Random();
        int x = rand.nextInt(smiekls.length);

        String RandomSmiekls = smiekls[x];
        String soundFile = SmiekluFaili[x];

        // Показать сообщение
        JOptionPane.showMessageDialog(null, RandomSmiekls, "Smiekls!", JOptionPane.INFORMATION_MESSAGE);

        // Воспроизвести соответствующий звук
        try {
            File audioFili = new File(soundFile);
            AudioInputStream audioS = AudioSystem.getAudioInputStream(audioFili);
            Clip clip = AudioSystem.getClip();
            clip.open(audioS);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

	
public int noteitKrit() {
	return KRIT;
}
	
public int noteitIZVAIRISANA() {
	return IZVAIRISANA;
}

    public void Uzspridzinat() {
    	
    }
	
    
	
}
