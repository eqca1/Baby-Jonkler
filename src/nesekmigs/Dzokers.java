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
    private boolean irSpridzins;
    private Random rand = new Random(); // Добавил Random как поле класса

    public Dzokers(int DZIVSK, int HP, int SPEKS, int VECUMS, int AIZS, String VARDS, String IZCELSME, String MOTIVS, int KRIT, int IZVAIRISANA) {
        super(DZIVSK, HP, SPEKS, VECUMS, AIZS, VARDS, IZCELSME, MOTIVS);
        this.KRIT = KRIT;
        this.IZVAIRISANA = IZVAIRISANA;
        this.irSpridzins = true; // У Джокера всегда есть взрывчатка при создании
    }

    public void dzonkleraorganismaizvaddati() {
        String info = "Džokera unikālie parametri:\n" +
                     "Kritiskā trieciena iespēja: " + KRIT + "%\n" +
                     "Izvairīšanās iespēja: " + IZVAIRISANA + "%\n" +
                     "Sprādzienbīstamība: " + (irSpridzins ? "Jā" : "Nē") + "\n" +
                     "Psihiskais stāvoklis: Nestabilns 😈";
        
        JOptionPane.showMessageDialog(null, info, "Džokera organisma dati", JOptionPane.INFORMATION_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Nevar atskaņot smieklu skaņu! 😢", "Kļūda", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Uzspridzinat() {
        if (irSpridzins) {
            int bojajums = rand.nextInt(20, 61);
            JOptionPane.showMessageDialog(null, 
                "BUM! 💥 Izraisīts " + bojajums + " bojājuma punktu sprādziens!\n" +
                "Visi apkārtējie objekti iznīcināti! 💣", 
                "Sprādziens", JOptionPane.WARNING_MESSAGE);
            irSpridzins = false;
        } else {
            JOptionPane.showMessageDialog(null, 
                "Nav sprādzienvielu! 😕\nVajag atkal sagatavot kādu joku...", 
                "Nav sprādzienvielu", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void sagatavotJaunuJoku() {
        irSpridzins = true;
        JOptionPane.showMessageDialog(null, 
            "Jauns joks sagatavots! 🃏\nKāds grasās kļūt par šī joka upuri? 😈", 
            "Jauns joks", JOptionPane.INFORMATION_MESSAGE);
    }

    public boolean izvairities() {
        int izvairisanasVeriba = rand.nextInt(1, 101);
        if (izvairisanasVeriba <= IZVAIRISANA) {
            JOptionPane.showMessageDialog(null, 
                "Džokers veikmiģi izvairījās no uzbrukuma! 🃏\n" +
                "Viņš tikai smejas atkal... 😂", 
                "Izvairīšanās", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        return false;
    }

    public int uzbrukt() {
        int pamatBojajums = noteiktSPEKS() / 2;
        int kritVeriba = rand.nextInt(1, 101);
        
        if (kritVeriba <= KRIT) {
            int kritiskaisBojajums = pamatBojajums * 2;
            JOptionPane.showMessageDialog(null, 
                "Kritiskais trieciens! 💥\n" +
                "Bojājums: " + kritiskaisBojajums + " HP\n" +
                "Džokers ir neapturams! 😈", 
                "Kritisks trieciens", JOptionPane.WARNING_MESSAGE);
            return kritiskaisBojajums;
        } else {
            JOptionPane.showMessageDialog(null, 
                "Džokers uzbruk! 🃏\nBojājums: " + pamatBojajums + " HP", 
                "Uzbrukums", JOptionPane.INFORMATION_MESSAGE);
            return pamatBojajums;
        }
    }

    @Override
    public String Izvadit() {
        return super.Izvadit() +
               " | Kritiskā iespēja: " + KRIT + "%" +
               " | Izvairīšanās: " + IZVAIRISANA + "%" +
               " | Sprādzieni: " + (irSpridzins ? "Jā" : "Nē") +
               "\n ";
    }

    public int noteiktKrit() {
        return KRIT;
    }
    
    public int noteiktIZVAIRISANA() {
        return IZVAIRISANA;
    }

    public boolean vaiIrSpridzins() {
        return irSpridzins;
    }

    // Метод для улучшения характеристик Джокера
    public void uzlabotKrit() {
        if (KRIT < 80) {
            KRIT += 5;
            JOptionPane.showMessageDialog(null, 
                "Kritiskā trieciena iespēja palielināta līdz " + KRIT + "%! 🔥", 
                "Uzlabojums", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
                "Kritiskā trieciena iespēja jau ir maksimālā! 💪", 
                "Maksimums", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void uzlabotIzvairisanas() {
        if (IZVAIRISANA < 60) {
            IZVAIRISANA += 5;
            JOptionPane.showMessageDialog(null, 
                "Izvairīšanās iespēja palielināta līdz " + IZVAIRISANA + "%! 🃏", 
                "Uzlabojums", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
                "Izvairīšanās iespēja jau ir maksimālā! 🎭", 
                "Maksimums", JOptionPane.WARNING_MESSAGE);
        }
    }
}
