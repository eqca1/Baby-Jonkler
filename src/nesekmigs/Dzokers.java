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

	public void pernutj() {
		
	}

    public void smieties() {
        String[] laughs = {
            "Ха-ха-ха! 😄",
            "Хи-хи-хи! 😂",
            "Хо-хо-хо! 😆",
            "Хехехе 😜",
            "Муа-ха-ха! 😈",
            "Аха-ха-ха! 🤣"
        };

        String[] soundFiles = {
            "haha.wav",
            "hihi.wav",
            "hoho.wav",
            "hehe.wav",
            "muahaha.wav",
            "ahaha.wav"
        };

        Random rand = new Random();
        int index = rand.nextInt(laughs.length);

        String randomLaugh = laughs[index];
        String soundFile = soundFiles[index];

        // Показать сообщение
        JOptionPane.showMessageDialog(null, randomLaugh, "Смех", JOptionPane.INFORMATION_MESSAGE);

        // Воспроизвести соответствующий звук
        try {
            File audioFile = new File(soundFile);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
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
