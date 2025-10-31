package nesekmigs;

import java.util.Random;
import javax.swing.JOptionPane;

public class Betmens extends Supervaronis {
    static Random rand = new Random(); 
    private int ierATKBonus; // Ieroča bonusa spēks
    private boolean ierocis; 
    private boolean gadzets; 
    
    public Betmens(int DZIVSK, int HP, int SPEKS, int VECUMS, int AIZS, String VARDS, String IZCELSME, String MOTIVS, boolean ierocis, boolean gadzets) {
        super(DZIVSK, HP, SPEKS, VECUMS, AIZS, VARDS, IZCELSME, MOTIVS);
        this.ierocis = ierocis;
        this.gadzets = gadzets;
        // Ja ir ierocis, piešķir nejaušu bonusu
        if(ierocis) {
            this.ierATKBonus = rand.nextInt(15, 51); // Bonuss no 15 līdz 50
        }
    }
    
    // Trenēšanās - palielina spēku
    public void treneties() {
        if(noteiktSPEKS() < 300) {
            int palielin = rand.nextInt(1, 16); // Palielinājums 1-15
            izmainitSPEKU(palielin, true);
            JOptionPane.showMessageDialog(null, "Spēks palielinās uz "+palielin+" ATK~", "Veiksme", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Supervaroņa(Betmens) spēks pārsniedz max spēku", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // Izmanto gadžetu
    public void izmantotGadzetu() {
        if(gadzets) {
            int gadzetaBojajums = rand.nextInt(70, 201); // Bojājums 70-200
            JOptionPane.showMessageDialog(null, "Betmens izmanto gadžetu!\nBojājums: " + gadzetaBojajums + " ATK", 
                    "Gadžets", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nav pieejamu gadžetu!", 
                    "Kļūda", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // Maina ieroci
    public void mainitIeroci() {
        if(ierocis) {
            this.ierATKBonus = rand.nextInt(15, 51); // Jauns bonuss
            JOptionPane.showMessageDialog(null, "Ierocis nomainīts!\nJaunais bonuss: " + ierATKBonus + " ATK", 
                    "Ierocis", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nav ieroča!", 
                    "Kļūda", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public boolean vaiIrIerocis() {
        return ierocis;
    }
    
    public boolean noteiktGadzets() {
        return gadzets;
    }
    
    public int noteiktIerocaBonusu() {
        return ierATKBonus;
    }
    
    // Noņem ieroci
    public void nonemtIerocu() {
        if(ierocis) {
            ierocis = false;
            ierATKBonus = 0;
            JOptionPane.showMessageDialog(null, "Ierocis noņemts!", 
                    "Ierocis", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Aprēķina kopējo bojājumu
    public int noteiktKopegoBojajumu() {
        int pamatBojajums = noteiktSPEKS();
        if(ierocis) {
            return pamatBojajums + ierATKBonus; // Ar ieroča bonusu
        }
        return pamatBojajums; // Bez bonusa
    }

    // Izvada papildus informāciju
    @Override
    public String Izvadit() {
        return super.Izvadit() +
               "| Ierocis: " + (ierocis ? "Jā" : "Nē") + (ierocis ? " ("+ierATKBonus+" ATK)" : "") +
               " | Gadžets: " + (gadzets ? "Jā" : "Nē") +
               "\n ";
    }
}